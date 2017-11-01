package com.david.rest.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.david.dto.EvaluateRequest;
import com.david.dto.EvaluateResponse;
import com.david.dto.UserLoanInformation;
import com.david.dto.UserRegistration;
import com.david.service.UserLoanInformationService;
import com.david.service.UserRegistrationService;

@RestController
@EnableAutoConfiguration
public class EvaluateRequestController {

	@Autowired
	private UserRegistrationService userRegistrationService;

	@Autowired
	private UserLoanInformationService userLoanInformationService;

	private static final Logger logger = LoggerFactory.getLogger(EvaluateRequestController.class);

	@RequestMapping(value = "/evaluate", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public EvaluateResponse evaluate(@RequestBody EvaluateRequest req) {
		logger.info("evaluate received");

		EvaluateResponse response = new EvaluateResponse();
		try {

			userRegistrationService.create(req.getUserRegistration());
			userLoanInformationService.create(req.getUserLoanInformation());

			response.setStatus(true);
		} catch (Exception e) {
			logger.error("Error occurred while trying to process evaluation", e);
			response.setStatus(false);
		}

		return response;
	}
	@RequestMapping(value = "/getUserRegistrations", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public List<EvaluateRequest> getUserRegistrations() {
		logger.info("getUserRegistrations received");

		List<EvaluateRequest> response = new ArrayList<>();
		try {

			List<UserRegistration> allRegistrations = userRegistrationService.getAllRegistrations();
			List<UserLoanInformation> allLoanInformations = userLoanInformationService.getAllLoanInformations();

			 Map<Long, UserRegistration> userRegMap = allRegistrations.parallelStream().collect(Collectors.toMap(k -> k.getId(),v -> v));
			 allLoanInformations.forEach( loanInfo -> {
				 UserRegistration userRegistration = userRegMap.get(loanInfo.getId());
				 EvaluateRequest evaluate = new EvaluateRequest();
				 evaluate.setUserLoanInformation(loanInfo);
				 evaluate.setUserRegistration(userRegistration);
				 response.add(evaluate);
				 
			 });
			
		} catch (Exception e) {
			logger.error("Error occurred while trying to retrieve all registrations", e);
		}

		return response;
	}
	
}

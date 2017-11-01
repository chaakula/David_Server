package com.david.service;

import java.util.List;

import com.david.dto.UserLoanInformation;

public interface UserLoanInformationService {
	void create(UserLoanInformation userRegistration);

	List<UserLoanInformation> getAllLoanInformations();
}

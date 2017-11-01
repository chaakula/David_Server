package com.david.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.david.dao.UserLoanInformationDao;
import com.david.dto.UserLoanInformation;
import com.david.model.UserLoanInformationModel;
import com.david.service.UserLoanInformationService;

@Service
@Transactional
public class UserLoanInformationServiceImpl implements UserLoanInformationService {

	@Autowired
	private UserLoanInformationDao userLoanInfoDao;

	@Override
	public void create(UserLoanInformation userLoanInfo) {
		UserLoanInformationModel userRegrequestModel = new UserLoanInformationModel();

		try {
			BeanUtils.copyProperties(userRegrequestModel, userLoanInfo);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		userLoanInfoDao.save(userRegrequestModel);
	}

	@Override
	public List<UserLoanInformation> getAllLoanInformations() {

		List<UserLoanInformationModel> listOfRegistrations = (List<UserLoanInformationModel>) userLoanInfoDao.findAll();
		
		List<UserLoanInformation> respList = new ArrayList<UserLoanInformation>();
		listOfRegistrations.forEach(userReg -> {

			UserLoanInformation resp = new UserLoanInformation();
			try {
				BeanUtils.copyProperties(resp, userReg);
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			respList.add(resp);
		});
		return respList;
	
	}

}

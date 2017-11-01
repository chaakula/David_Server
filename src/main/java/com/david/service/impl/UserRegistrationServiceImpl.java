package com.david.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.david.dao.UserRegistrationDao;
import com.david.dto.UserRegistration;
import com.david.model.UserRegistrationModel;
import com.david.service.UserRegistrationService;

@Service
@Transactional
public class UserRegistrationServiceImpl implements UserRegistrationService {

	@Autowired
	private UserRegistrationDao userRegDao;

	@Override
	public void create(UserRegistration userRegrequest) {

		UserRegistrationModel userRegrequestModel = new UserRegistrationModel();

		try {
			BeanUtils.copyProperties(userRegrequestModel, userRegrequest);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		userRegrequestModel.setCreatedTime(new Timestamp(System.currentTimeMillis()));
		userRegDao.save(userRegrequestModel);
	}

	@Override
	public List<UserRegistration> getAllRegistrations() {
		List<UserRegistrationModel> listOfRegistrations = (List<UserRegistrationModel>) userRegDao.findAll();
		List<UserRegistration> respList = new ArrayList<UserRegistration>();
		listOfRegistrations.forEach(userReg -> {

			UserRegistration resp = new UserRegistration();
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

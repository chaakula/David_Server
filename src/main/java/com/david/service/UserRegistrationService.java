package com.david.service;

import java.util.List;

import com.david.dto.UserRegistration;

public interface UserRegistrationService {
	void create(UserRegistration userRegistration);

	List<UserRegistration> getAllRegistrations();
}

package com.david.dao;

import org.springframework.data.repository.CrudRepository;

import com.david.model.UserRegistrationModel;

/**
 * User Registration DAO Interface
 * @author Chandu A
 *
 */
public interface UserRegistrationDao extends CrudRepository<UserRegistrationModel, Long>{


}

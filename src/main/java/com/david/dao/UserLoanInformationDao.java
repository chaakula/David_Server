package com.david.dao;

import org.springframework.data.repository.CrudRepository;

import com.david.model.UserLoanInformationModel;

/**
 * User Loan Information DAO interface
 * @author Chandu A
 *
 */
public interface UserLoanInformationDao extends CrudRepository<UserLoanInformationModel, Long>{

}

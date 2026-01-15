package com.comulynx.wallet.rest.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.comulynx.wallet.rest.api.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	Optional<Customer> findByCustomerId(String customerId);

	// TODO : Implement the query and function below to delete a customer using Customer Id
	// @Query("?")
	// int deleteCustomerByCustomerId(String customer_id);
	
	// ----------------------------------------------------
    // Delete a customer using customerId implementation
    // ----------------------------------------------------
    @Modifying
    @Transactional
    @Query("DELETE FROM Customer c WHERE c.customerId = :customerId")
    int deleteCustomerByCustomerId(String customerId);

	// TODO : Implement the query and function below to update customer firstName using Customer Id
	// @Query("?")
	// int updateCustomerByCustomerId(String firstName, String customer_id);

	// -----------------------------------------------------------
    // Update customer's firstName using customerId implementation
    // ------------------------------------------------------------
    @Modifying
    @Transactional
    @Query("UPDATE Customer c SET c.firstName = :firstName WHERE c.customerId = :customerId")
    int updateCustomerByCustomerId(String firstName, String customerId);
	
	
	// TODO : Implement the query and function below and to return all customers whose Email contains  'gmail'
	// @Query("?")
	// List<Customer> findAllCustomersWhoseEmailContainsGmail();
	
	// -----------------------------------------------------------------
    // Return all customers whose email contains 'gmail' implementation
    // -----------------------------------------------------------------
    @Query("SELECT c FROM Customer c WHERE c.email LIKE '%gmail%'")
    List<Customer> findAllCustomersWhoseEmailContainsGmail();
}

package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     *
     * @param customerDto-CustomerDto object
     */
    void createAccount(CustomerDto customerDto);

    /**
     * @param mobileNumber-mobile number of the customer
     * @return the customerDto object based on mobile number
     */
    CustomerDto fetchAccount(String mobileNumber);

    /**
     * Updates the account details of an existing customer.
     *
     * @param customerDto - CustomerDto object containing updated account information
     * @return true if the account was successfully updated, false otherwise
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return boolean indicating if the delete of Account details is successful or not
     */
    boolean deleteAccount(String mobileNumber);

    /**
     *
     * @param accountNumber - Long
     * @return boolean indicating if the update of communication status is successful or not
     */
    boolean updateCommunicationStatus(Long accountNumber);
}

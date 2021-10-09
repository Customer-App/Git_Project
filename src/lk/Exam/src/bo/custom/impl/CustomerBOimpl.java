/*
 *
 *  *
 *  * ---------------------------------------------------------------------------------------------
 *  *  *  Copyright (c) Customer_App. All rights reserved.
 *  *  *  Licensed under the  Sri Lankan Information License. See License.txt in the project root for license information.
 *  *  *--------------------------------------------------------------------------------------------
 *
 */

package lk.Exam.src.bo.custom.impl;

import lk.Exam.src.bo.custom.CustomerBO;
import lk.Exam.src.dao.DAOFactory;
import lk.Exam.src.dao.custom.CustomerDAO;
import lk.Exam.src.dto.CustomerDTO;
import lk.Exam.src.entity.customer;

import java.util.ArrayList;

/**
 * @author Hashan Saminda <hashansaminda21@gmail.com> (Rdxhashan.tk/)
 * @since 10/9/2021
 */
public class CustomerBOimpl implements CustomerBO {
    CustomerDAO dao = (CustomerDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOType.CUSTOMER);
    @Override
    public boolean addCustomer(CustomerDTO customerDTO) throws Exception {
        return dao.add(new customer(customerDTO.getId(),customerDTO.getName(),customerDTO.getContact()));
    }

    @Override
    public boolean deleteCustomer(String id) throws Exception {
        return false;
    }

    @Override
    public boolean updateCustomer(CustomerDTO dto) throws Exception {
        return false;
    }

    @Override
    public CustomerDTO searchCustomer(String id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomer() throws Exception {
        return null;
    }
}

/*
 *
 *  *
 *  * ---------------------------------------------------------------------------------------------
 *  *  *  Copyright (c) Customer_App. All rights reserved.
 *  *  *  Licensed under the  Sri Lankan Information License. See License.txt in the project root for license information.
 *  *  *--------------------------------------------------------------------------------------------
 *
 */

package lk.Exam.src.bo.custom;

import lk.Exam.src.bo.SuperBO;
import lk.Exam.src.dto.CustomerDTO;

import java.util.ArrayList;

/**
 * @author Hashan Saminda <hashansaminda21@gmail.com> (Rdxhashan.tk/)
 * @since 10/9/2021
 */
public interface CustomerBO extends SuperBO {

    public boolean addCustomer(CustomerDTO customerDTO)throws Exception;

    public boolean deleteCustomer(String id) throws Exception;

    public boolean updateCustomer(CustomerDTO dto)throws Exception;

    public CustomerDTO searchCustomer(String id)throws Exception;

    public ArrayList<CustomerDTO> getAllCustomer()throws Exception;
}

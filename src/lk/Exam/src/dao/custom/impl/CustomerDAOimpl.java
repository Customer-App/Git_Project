/*
 *
 *  *
 *  * ---------------------------------------------------------------------------------------------
 *  *  *  Copyright (c) Customer_App. All rights reserved.
 *  *  *  Licensed under the  Sri Lankan Information License. See License.txt in the project root for license information.
 *  *  *--------------------------------------------------------------------------------------------
 *
 */

package lk.Exam.src.dao.custom.impl;

import lk.Exam.src.dao.CrudUtil;
import lk.Exam.src.dao.custom.CustomerDAO;
import lk.Exam.src.entity.customer;

import java.util.ArrayList;

/**
 * @author Hashan Saminda <hashansaminda21@gmail.com> (Rdxhashan.tk/)
 * @since 10/9/2021
 */
public class CustomerDAOimpl implements CustomerDAO {
    @Override
    public boolean add(customer customer) throws Exception {
        String sql = "insert into customer values (?,?,?)";
        return CrudUtil.executeUpdate(sql, customer.getId(), customer.getName(), customer.getContact());
    }

    @Override
    public boolean delete(String s) throws Exception {
        return false;
    }

    @Override
    public boolean update(customer customer) throws Exception {
        return false;
    }

    @Override
    public customer search(String s) throws Exception {
        return null;
    }

    @Override
    public ArrayList<customer> getAll() throws Exception {
        return null;
    }
}

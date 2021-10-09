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

import lk.Exam.src.dao.custom.ItemDAO;
import lk.Exam.src.entity.item;

import java.util.ArrayList;

/**
 * @author Hashan Saminda <hashansaminda21@gmail.com> (Rdxhashan.tk/)
 * @since 10/9/2021
 */
public class ItemDAOimpl implements ItemDAO {
    @Override
    public boolean add(item item) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String s) throws Exception {
        return false;
    }

    @Override
    public boolean update(item item) throws Exception {
        return false;
    }

    @Override
    public item search(String s) throws Exception {
        return null;
    }

    @Override
    public ArrayList<item> getAll() throws Exception {
        return null;
    }
}

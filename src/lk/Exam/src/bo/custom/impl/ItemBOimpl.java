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

import lk.Exam.src.bo.custom.ItemBO;
import lk.Exam.src.dto.ItemDTO;

import java.util.ArrayList;

/**
 * @author Hashan Saminda <hashansaminda21@gmail.com> (Rdxhashan.tk/)
 * @since 10/9/2021
 */
public class ItemBOimpl implements ItemBO {
    @Override
    public boolean add(ItemDTO itemDTO) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String id) throws Exception {
        return false;
    }

    @Override
    public boolean update(ItemDTO itemDTO) throws Exception {
        return false;
    }

    @Override
    public ItemDTO search(String id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<ItemDTO> getAll() throws Exception {
        return null;
    }
}

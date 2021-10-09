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
import lk.Exam.src.dto.ItemDTO;

import java.util.ArrayList;

/**
 * @author Hashan Saminda <hashansaminda21@gmail.com> (Rdxhashan.tk/)
 * @since 10/9/2021
 */
public interface ItemBO extends SuperBO {


    public boolean add(ItemDTO itemDTO)throws Exception;

    public boolean delete(String id) throws Exception;

    public boolean update(ItemDTO itemDTO)throws Exception;

    public ItemDTO search(String id)throws Exception;

    public ArrayList<ItemDTO> getAll()throws Exception;
}

/*
 *
 *  *
 *  * ---------------------------------------------------------------------------------------------
 *  *  *  Copyright (c) Customer_App. All rights reserved.
 *  *  *  Licensed under the  Sri Lankan Information License. See License.txt in the project root for license information.
 *  *  *--------------------------------------------------------------------------------------------
 *
 */

package lk.Exam.src.dao;

import java.util.ArrayList;

/**
 * @author Hashan Saminda <hashansaminda21@gmail.com> (Rdxhashan.tk/)
 * @since 10/9/2021
 */
public interface CrudDAO <T,ID> extends SuperDAO {

    public boolean add(T t) throws Exception;

    public boolean delete(ID id) throws Exception;

    public boolean update(T t) throws Exception;

    public T search(ID id) throws Exception;

    public ArrayList<T> getAll() throws Exception;
}

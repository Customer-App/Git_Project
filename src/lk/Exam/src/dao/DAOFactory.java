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

import lk.Exam.src.dao.custom.impl.CustomerDAOimpl;
import lk.Exam.src.dao.custom.impl.ItemDAOimpl;

/**
 * @author Hashan Saminda <hashansaminda21@gmail.com> (Rdxhashan.tk/)
 * @since 10/9/2021
 */
public class DAOFactory {

    private static DAOFactory daoFactory;
    private DAOFactory(){

    }

    public static DAOFactory getInstance(){
        if (daoFactory==null){
            daoFactory=new DAOFactory();

        }
        return daoFactory;
    }
    public enum DAOType{
        CUSTOMER,ITEM;
    }
    public SuperDAO getDAO (DAOFactory.DAOType type){

        switch (type){
            case CUSTOMER:return new CustomerDAOimpl();
            case ITEM:return new ItemDAOimpl();

            default:return null;
        }



    }
}

/*
 *
 *  *
 *  * ---------------------------------------------------------------------------------------------
 *  *  *  Copyright (c) Customer_App. All rights reserved.
 *  *  *  Licensed under the  Sri Lankan Information License. See License.txt in the project root for license information.
 *  *  *--------------------------------------------------------------------------------------------
 *
 */

package lk.Exam.src.bo;

import lk.Exam.src.bo.custom.impl.CustomerBOimpl;

import static lk.Exam.src.bo.BOFactory.BOType.ITEM;

/**
 * @author Hashan Saminda <hashansaminda21@gmail.com> (Rdxhashan.tk/)
 * @since 10/9/2021
 */
public class BOFactory {

    static BOFactory boFactory;

    private BOFactory() {

    }

    public static BOFactory getInstance() {

        if (boFactory == null) {
            boFactory = new BOFactory();
        }
        return boFactory;

    }
    public enum BOType {
        CUSTOMER,ITEM

    }

    public <T extends SuperBO>T getBO(BOType boType) {
        switch (boType) {
            case CUSTOMER:return (T) new CustomerBOimpl();
            case ITEM:return (T) new ItemBOimpl();

            default:
                return null;
        }
    }


}

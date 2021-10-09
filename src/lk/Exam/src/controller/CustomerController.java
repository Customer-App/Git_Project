/*
 *
 *  *
 *  * ---------------------------------------------------------------------------------------------
 *  *  *  Copyright (c) Customer_App. All rights reserved.
 *  *  *  Licensed under the  Sri Lankan Information License. See License.txt in the project root for license information.
 *  *  *--------------------------------------------------------------------------------------------
 *
 */

package lk.Exam.src.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import lk.Exam.src.bo.BOFactory;
import lk.Exam.src.bo.custom.CustomerBO;
import lk.Exam.src.dto.CustomerDTO;

/**
 * @author Hashan Saminda <hashansaminda21@gmail.com> (Rdxhashan.tk/)
 * @since 10/9/2021
 */
public class CustomerController {
    public JFXButton btnSave;
    public JFXTextField txtID;
    public JFXTextField txtName;
    public JFXTextField txtContact;
    CustomerBO bo = BOFactory.getInstance().getBO(BOFactory.BOType.CUSTOMER);
    public void SaveonAction(ActionEvent actionEvent) {

        String id = txtID.getText();
        String name = txtName.getText();
        String contact = txtContact.getText();


        CustomerDTO customerDTO = new CustomerDTO(id, name, contact);

        boolean add = false;
        try {
            add = bo.addCustomer(customerDTO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (add) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Customer Save");
            alert.setHeaderText(null);
            alert.setContentText("Customer Save successfully!");
            alert.showAndWait();

        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Customer Save");
            alert.setHeaderText(null);
            alert.setContentText("Oops, something went wrong!");
            alert.showAndWait();
        }
    }
}

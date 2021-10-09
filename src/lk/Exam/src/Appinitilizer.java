/*
 *
 *  *
 *  * ---------------------------------------------------------------------------------------------
 *  *  *  Copyright (c) Customer_App. All rights reserved.
 *  *  *  Licensed under the  Sri Lankan Information License. See License.txt in the project root for license information.
 *  *  *--------------------------------------------------------------------------------------------
 *
 */

package lk.Exam.src;/**
 * @author Hashan Saminda <hashansaminda21@gmail.com> (Rdxhashan.tk/)
 * @since 10/9/2021
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Appinitilizer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            primaryStage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("../src/viwe/Customer.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();
        }
//        primaryStage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("../src/view/DashBord.fxml"))));
        primaryStage.setTitle("CustomerForm");
        primaryStage.centerOnScreen();
        primaryStage.show();
        primaryStage.setResizable(false);
    }
}

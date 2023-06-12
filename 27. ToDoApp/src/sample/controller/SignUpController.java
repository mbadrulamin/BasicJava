package sample.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.database.DatabaseHandler;
import sample.model.User;

public class SignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXTextField signupFirstname;

    @FXML
    private JFXTextField signupLastname;

    @FXML
    private JFXTextField signupUsername;

    @FXML
    private JFXTextField signupLocation;

    @FXML
    private JFXCheckBox signupCheckBoxMale;

    @FXML
    private JFXCheckBox signupCheckBoxFemale;

    @FXML
    private JFXPasswordField signupPassword;

    @FXML
    private JFXButton signupButton;

    @FXML
    void initialize() {



        signupButton.setOnAction(actionEvent -> {

            createUser();

            signupButton.getScene().getWindow().hide(); //hide the current window

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/view/login.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));

            stage.show();



        });

    }

    private void createUser(){

        DatabaseHandler databaseHandler = new DatabaseHandler();

        String firstName = signupFirstname.getText();
        String lastName = signupLastname.getText();
        String userName = signupUsername.getText();
        String password = signupPassword.getText();
        String location = signupLocation.getText();

        String gender = "";

        if (signupCheckBoxFemale.isSelected()){
            gender = "Female";
        }else{
            gender = "Male";
        }

        User user = new User(firstName, lastName, userName, password, location, gender);

        databaseHandler.signUpUser(user);
    }

}


package sample.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField loginUsername;

    @FXML
    private PasswordField loginPassword;

    @FXML
    private JFXButton loginButton;

    @FXML
    void initialize() {

        loginUsername.setStyle("-fx-text-inner-color: #a0a2ab");
        loginPassword.setStyle("-fx-text-inner-color: #a0a2ab");

        loginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String username = loginUsername.getText().trim();
                String password = loginPassword.getText().trim();
                System.out.println("Username: " + username);
                System.out.println("Password: " + password);
                System.out.println("Login Button Clicked");
                loginUser();
            }
        });
    }

     private void loginUser() {

        //Get the main window
         loginButton.getScene().getWindow().hide();

         if (!loginUsername.getText().toString().equals("") && !loginPassword.getText().toString().equals("")){

             //we're ready to go to next stage

             FXMLLoader loader = new FXMLLoader();
             loader.setLocation(getClass().getResource("/sample/view/details.fxml"));
             try {
                 loader.load();
             } catch (IOException e) {
                 e.printStackTrace();
             }

             Parent root = loader.getRoot();
             Stage stage = new Stage();
             stage.setScene(new Scene(root));

             DetailsController detailsController = loader.getController();
             detailsController.setName(loginUsername.getText(), "Java and App Developer", 20);

             stage.show();


         }
     }

}

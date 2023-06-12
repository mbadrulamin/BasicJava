package sample;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    //MVC - Model - View - Controller
    @FXML
    private JFXButton registerButton;

    @FXML
    private Label myLabel;

    @FXML
    private TextField usernameId;

    @FXML
    private PasswordField passwordId;




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        registerButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                String name = usernameId.getText().trim();
                String password = passwordId.getText().trim();
                myLabel.setText("Thank you for your registration");

                System.out.println("Username: " + name);
                System.out.println("Password: " + password);
            }
        });
    }
}

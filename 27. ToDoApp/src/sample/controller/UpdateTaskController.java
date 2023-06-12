package sample.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;

public class UpdateTaskController {

    @FXML
    private JFXTextField updateTaskField;

    @FXML
    private JFXTextField updateDescriptionField;

    @FXML
    public JFXButton updateTaskButton;

    @FXML
    void initialize() {

    }


    public void setTaskField(String task){
        this.updateTaskField.setText(task);
    }

    public String getTask(){
        return this.updateTaskField.getText().trim();
    }

    public void setUpdateDescriptionField(String description){
        this.updateTaskField.setText(description);
    }

    public String getDescription(){
        return this.updateDescriptionField.getText().trim();
    }
}

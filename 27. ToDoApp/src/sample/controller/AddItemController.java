package sample.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;
import sample.animations.Shaker;
import sample.animations.Transition;

public class AddItemController {

    public static int userId;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView addButton;

    @FXML
    private Label noTaskLabel;

    @FXML
    private AnchorPane rootAnchorPane;

    @FXML
    void initialize() {

        addButton.addEventHandler(MouseEvent.MOUSE_CLICKED,mouseEvent -> {
            Shaker buttonShaker = new Shaker(addButton);
            buttonShaker.shake();

            //FadeTransition fadeTransition = new FadeTransition(Duration.millis(2000), addButton);
            //FadeTransition labelTransition = new FadeTransition(Duration.millis(2000), noTaskLabel);

            Transition addButtonTransition = new Transition(addButton);
            Transition labelTransition = new Transition(noTaskLabel);

            //remove
            System.out.println("Added Clicked");
            addButton.relocate(0,20);
            noTaskLabel.relocate(0,85);


            addButton.setOpacity(0);
            noTaskLabel.setOpacity(0);

//            fadeTransition.setFromValue(1f);
//            fadeTransition.setToValue(0f);;
//            fadeTransition.setCycleCount(1);
//            fadeTransition.setAutoReverse(false);
//            fadeTransition.play();
//
//            labelTransition.setFromValue(1f);
//            labelTransition.setToValue(0f);
//            labelTransition.setCycleCount(1);
//            labelTransition.setAutoReverse(false);
//            labelTransition.play();

            addButtonTransition.fadeOut();
            labelTransition.fadeOut();

            try {
                AnchorPane formPane = FXMLLoader.load(getClass().getResource("/sample/view/addItemForm.fxml"));

                AddItemController.userId = getUserId();

//                AddItemFormController addItemController = new AddItemFormController();
//                addItemController.setUserId(getUserId());

                Transition transition = new Transition(formPane);
                transition.fadeIn();

                rootAnchorPane.getChildren().setAll(formPane);
            } catch (IOException e) {
                e.printStackTrace();
            }

        });

    }

    public void setUserId(int userId){
        this.userId = userId;
        System.out.println("User id is: " + this.userId);
    }

    public int getUserId(){
        return this.userId;
    }

}

package sample;

import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    private Label myLabel;
    private TextField nameTextField;

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Hello JavaFX");
        Button button = new Button();
        button.setText("Click Here");

        myLabel = new Label();
        myLabel.setText("This is my label");

        nameTextField = new TextField();
        nameTextField.setPromptText("Enter your name: ");


        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String name = nameTextField.getText();
                System.out.println(name);
                myLabel.setText(name);
                button.setText("Yes! Clicked");

            }
        });

        FlowPane flowPaneRoot = new FlowPane(10,10);
        flowPaneRoot.setAlignment(Pos.CENTER);

        //StackPane root = new StackPane();
        flowPaneRoot.getChildren().add(button);
        flowPaneRoot.getChildren().add(myLabel);
        flowPaneRoot.getChildren().add(nameTextField);
        Scene scene = new Scene(flowPaneRoot, 200, 250);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}

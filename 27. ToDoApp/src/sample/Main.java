package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.database.DatabaseHandler;

import java.sql.ResultSet;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("view/login.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("view/list.fxml"));
        primaryStage.setTitle("2DO");
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}

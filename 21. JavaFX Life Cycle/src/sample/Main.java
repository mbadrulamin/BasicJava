package sample;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        System.out.println("Starting application");
        primaryStage.setTitle("Life Cycle");

        FlowPane root = new FlowPane(Orientation.VERTICAL);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void init() throws Exception {
        super.init();

        System.out.println("Initialize begin");
    }

    @Override
    public void stop() throws Exception {
        super.stop();

        System.out.println("Exiting application");
    }

    public static void main(String[] args) {
        launch(args);
    }
}




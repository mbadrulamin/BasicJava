package sample;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler{
    private Label title;
    private Label respone;
    private  Label selected;

    private CheckBox bananaCB;
    private  CheckBox mangoCB;
    private CheckBox papayaCB;
    private CheckBox grapefuitCB;

    private String fruits;


    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Favourite Fruits");

        title = new Label("What fruit do you like?");
        respone = new Label("");
        selected = new Label("");

        bananaCB = new CheckBox("Banana");
        mangoCB = new CheckBox("Mango");
        papayaCB = new CheckBox("Papaya");
        grapefuitCB = new CheckBox("Grapefruit");

        //register all of our checkboxes
        bananaCB.setOnAction(this);
        mangoCB.setOnAction(this);
        papayaCB.setOnAction(this);
        grapefuitCB.setOnAction(this);



        //Setup stage and scene
        FlowPane flowPaneRoot = new FlowPane(Orientation.VERTICAL);
        /*flowPaneRoot.setOrientation(Orientation.VERTICAL);*/
        flowPaneRoot.setAlignment(Pos.CENTER);

        //We add all of our controls
        flowPaneRoot.getChildren().add(title);
        flowPaneRoot.getChildren().addAll(bananaCB, mangoCB, papayaCB, grapefuitCB, respone, selected);

        Scene scene = new Scene(flowPaneRoot, 300,300);
        primaryStage.setScene(scene);
        primaryStage.show();

        showAll();

    }

    void showAll(){
        fruits = "";
        if (bananaCB.isSelected()) fruits += " Banana";
        if (mangoCB.isSelected()) fruits += " Mango";
        if (papayaCB.isSelected()) fruits += " Papaya";
        if (grapefuitCB.isSelected()) fruits += " Grapefruit";

        selected.setText("Fruit selected: " + fruits);
    }


    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void handle(Event event) {
        Object fruitChecked = event.getSource();
        if (bananaCB.equals(fruitChecked)){
            if (bananaCB.isSelected()){
                respone.setText("Banana is selected");
            }else{
                respone.setText("Banana is cleared");
            }
            showAll();
        }

        if (mangoCB.equals(fruitChecked)){
            if (mangoCB.isSelected()){
                respone.setText("Mango is selected");
            }else{
                respone.setText("Mango is cleared");
            }
            showAll();
        }

        if (papayaCB.equals(fruitChecked)){
            if (papayaCB.isSelected()){
                respone.setText("Papaya is selected");
            }else{
                respone.setText("Papaya is cleared");
            }
            showAll();
        }

        if (grapefuitCB.equals(fruitChecked)){
            if (grapefuitCB.isSelected()){
                respone.setText("Grapefruit is selected");
            }else{
                respone.setText("Grapefruit is cleared");
            }
            showAll();
        }

    }
}

package sample;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.FlowPane;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler {
    private Button rotateButton;
    private Button blurButton;
    private Button scaleButton;
    private Rotate rotate;
    private double angle;
    private double blurVal;
    private BoxBlur blur;
    private double scaleFactor;
    private Scale scale;
    private Reflection reflection;

    @Override
    public void start(Stage primaryStage) throws Exception{

        reflection = new Reflection();
        scale = new Scale(scaleFactor, scaleFactor);
        blur = new BoxBlur(1, 1, 1);
        rotate = new Rotate();

        rotateButton = new Button("Rotate");
        blurButton = new Button("Blur off");
        scaleButton = new Button("Scale");

        Label reflect = new Label("Reflection Adds Visual Sparkle");

        primaryStage.setTitle("Life Cycle");

        angle = 0.0;
        blurVal = 1.0;
        scaleFactor = 0.4;

        FlowPane root = new FlowPane(15,15);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(rotateButton, blurButton, scaleButton, reflect);
        Scene scene = new Scene(root, 700, 400);
        primaryStage.setScene(scene);
        primaryStage.show();

        //Register all button to EvenHandler
        rotateButton.setOnAction(this);
        blurButton.setOnAction(this);
        scaleButton.setOnAction(this);

        //Setup Transformation
        rotateButton.getTransforms().add(rotate);
        scaleButton.getTransforms().add(scale);

        reflection.setTopOpacity(0.7);
        reflection.setBottomOpacity(0.3);

        reflect.setEffect(reflection);

    }

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void handle(Event event) {
        if (event.getSource().equals(rotateButton)){
            angle += 15.0;
            rotate.setAngle(angle);
            rotate.setPivotX(rotateButton.getWidth()/2);
            rotate.setPivotY(rotateButton.getHeight()/2);

            System.out.println("Button Rotate");
        }

        if (event.getSource().equals(blurButton)){

            //each time button is pressed, its blur will change
            if (blurVal == 10.0){
                blurVal = 1.0;
                blurButton.setEffect(null);
                blurButton.setText("Blur off");
            }else{
                blurVal++;
                blurButton.setEffect(blur);
                blurButton.setText("Blur On");
            }
            blur.setWidth(blurVal);
            blur.setHeight(blurVal);

            System.out.println("Button Blur");
        }

        if (event.getSource().equals(scaleButton)){
            scaleFactor += 0.1;
            if (scaleFactor > 3.0) scaleFactor = 0.4;

            scale.setX(scaleFactor);
            scale.setY(scaleFactor);

            System.out.println("Button Scale");
        }
    }
}

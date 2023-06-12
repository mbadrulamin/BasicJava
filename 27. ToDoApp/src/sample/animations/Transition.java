package sample.animations;

import javafx.animation.FadeTransition;
import javafx.scene.Node;
import javafx.util.Duration;

public class Transition {

    private FadeTransition fadeTransition;

    public Transition(Node node) {
        fadeTransition = new FadeTransition(Duration.millis(1000), node);
        fadeTransition.setFromValue(0f);
        fadeTransition.setToValue(1f);
        fadeTransition.setCycleCount(1);
        fadeTransition.setAutoReverse(false);
    }

    public void fadeIn(){
        fadeTransition.play();
    }

    public void fadeOut(){
        fadeTransition.setFromValue(1f);
        fadeTransition.setToValue(0f);
        fadeTransition.play();
    }
}

package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Sample2 extends Application {
    // align 10 buttons using a flow pane

    private Button[] bt = new Button[10];

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        // create 10 buttons
        for(int i=0; i<bt.length; i++) {
            bt[i] = new Button(Integer.toString(i));
        }

        // create a pane
        FlowPane fp = new FlowPane();

        // add buttons to the pane
        for(int i=0; i<bt.length; i++) {
            fp.getChildren().add(bt[i]);
        }

        // add a scene
        Scene sc = new Scene(fp, 300, 100);

        // add the scene to a stage
        stage.setScene(sc);

        // display the stage
        stage.setTitle("サンプル");
        stage.show();

    }


}

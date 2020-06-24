package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Sample3 extends Application {
    // button layout on a grid pane
    private Button[][] bt = new Button[6][3];

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        // create buttons
        for(int i=0; i<bt.length; i++) {
            for(int j=0; j<bt[i].length; j++) {
                bt[i][j] = new Button(Integer.toString(i) + Integer.toString(j));
            }
        }

        // create a pane
        GridPane gp = new GridPane();

        // add buttons to the pane
        for(int i=0; i<bt.length; i++) {
            for(int j=0; j<bt[i].length; j++) {
                gp.add(bt[i][j], i, j);
            }
        }

        // create a scene
        Scene sc = new Scene(gp, 300, 200);

        // add the scene to a stage
        stage.setScene(sc);

        // display the stage
        stage.setTitle("サンプル");
        stage.show();

    }


}

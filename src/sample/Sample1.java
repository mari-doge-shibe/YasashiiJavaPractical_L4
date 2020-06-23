package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Sample1 extends Application {

    private Button[] bt = new Button[5];

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        // create controls
        bt[0] = new Button("Top");
        bt[1] = new Button("Button");
        bt[2] = new Button("Center");
        bt[3] = new Button("Left");
        bt[4] = new Button("Right");

        // create a pane
        BorderPane bp = new BorderPane();

        // add controls to the pane
        bp.setTop(bt[0]);
        bp.setBottom(bt[1]);
        bp.setCenter(bt[2]);
        bp.setLeft(bt[3]);
        bp.setRight(bt[4]);

        // 範囲内での位置を指定できますというコメントあり
        for(int i=0; i<bt.length; i++) {
            bp.setAlignment(bt[i], Pos.CENTER);
        }

        // create a scene
        Scene sc = new Scene(bp, 300, 200);

        // add the scene to a stage
        stage.setScene(sc);

        // display the stage
        stage.setTitle("サンプル");
        stage.show();

    }

}

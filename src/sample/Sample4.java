package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Sample4 extends Application {
    // display buttons in HBox and VBox
    private Button[] bt = new Button[10];
    private Label[] lb = new Label[5];

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        for(int i=0; i<bt.length; i++) {
            bt[i] = new Button(Integer.toString(i));
        }
        for(int i=0; i<lb.length; i++) {
            lb[i] = new Label(Integer.toString(i));
        }

        // create a pane
        BorderPane bp = new BorderPane();
        HBox hb = new HBox();
        VBox vb = new VBox();

        // add buttons to the pane
        for(int i=0; i<bt.length; i++) {
            hb.getChildren().add(bt[i]);
        }
        for(int i=0; i<lb.length; i++) {
            vb.getChildren().add(lb[i]);
        }

        hb.setAlignment(Pos.CENTER);
        vb.setAlignment(Pos.CENTER);

        bp.setTop(hb);
        bp.setCenter(vb);

        // create a scene
        Scene sc = new Scene(bp, 300, 200);

        // add the scene to a stage
        stage.setScene(sc);

        // display the stage
        stage.setTitle("サンプル");
        stage.show();
        
    }

}

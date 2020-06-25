package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Sample5 extends Application {
    // displaying three labels with text in different colors
    private Label[] lb = new Label[3];

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        for(int i = 0; i < lb.length; i++) {
            lb[i] = new Label("車" + i + "はいかがですか？");
        }

        lb[0].setTextFill(Color.BLACK);
        lb[1].setTextFill(Color.BLUE);
        lb[2].setTextFill(Color.RED);

        BorderPane bp = new BorderPane();
        VBox vb = new VBox();

        for(int i = 0; i < lb.length; i++) {
            vb.getChildren().add(lb[i]);
        }
        bp.setCenter(vb);

        Scene sc = new Scene(bp, 300, 200);

        stage.setScene(sc);

        stage.setTitle("サンプル");
        stage.show();

    }

}

package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Sample11 extends Application {
    // text entered in the bottom text field is displayed in the top label
    private Label lb;
    private TextField tf;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        lb = new Label("いらっしゃいませ。");
        tf = new TextField();

        BorderPane bp = new BorderPane();

        bp.setTop(lb);
        bp.setBottom(tf);

        tf.setOnAction(new SampleEventHandler());

        Scene sc = new Scene(bp, 300, 200);

        stage.setScene(sc);

        stage.setTitle("サンプル");
        stage.show();
    }

    class SampleEventHandler implements EventHandler<ActionEvent> {
        public void handle(ActionEvent e) {
            lb.setText(tf.getText() + "ですね。");
        }
    }
}

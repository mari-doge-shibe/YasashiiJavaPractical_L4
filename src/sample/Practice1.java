package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Practice1 extends Application {
    // selecting a radio button changes the label background color
    private Label lb;
    private RadioButton rb1, rb2, rb3;
    private ToggleGroup tg;

    public static void main(String[] args) {
        launch(args);
    }

    public void start (Stage stage) throws Exception {
        lb = new Label("いらっしゃいませ。");
        rb1 = new RadioButton("黄");
        rb2 = new RadioButton("赤");
        rb3 = new RadioButton("青");
        tg = new ToggleGroup();

        rb1.setToggleGroup(tg);
        rb2.setToggleGroup(tg);
        rb3.setToggleGroup(tg);

        rb1.setSelected(true);
        lb.setBackground(new Background(new BackgroundFill(Color.YELLOW, null, null)));

        BorderPane bp = new BorderPane();
        HBox hb = new HBox();

        hb.getChildren().add(rb1);
        hb.getChildren().add(rb2);
        hb.getChildren().add(rb3);
        hb.setAlignment(Pos.CENTER);

        bp.setTop(lb);
        bp.setCenter(hb);

        rb1.setOnAction(new SampleEventHandler());
        rb2.setOnAction(new SampleEventHandler());
        rb3.setOnAction(new SampleEventHandler());

        Scene sc = new Scene(bp, 300, 200);

        stage.setScene(sc);

        stage.setTitle("サンプル");
        stage.show();
    }

    class SampleEventHandler implements EventHandler<ActionEvent> {
        public void handle(ActionEvent e) {
            RadioButton tmp = (RadioButton) e.getSource();
            if(tmp == rb1) {
                lb.setBackground(new Background(new BackgroundFill(Color.YELLOW, null, null)));
            } else if (tmp == rb2) {
                lb.setBackground(new Background(new BackgroundFill(Color.RED, null, null)));
            } else if (tmp == rb3) {
                lb.setBackground(new Background(new BackgroundFill(Color.BLUE, null, null)));
            }

        }
    }



}

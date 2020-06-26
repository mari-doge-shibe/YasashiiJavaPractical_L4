package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;



public class Sample10 extends Application {

    // radio buttons

    private Label lb;
    private RadioButton rb1, rb2;
    private ToggleGroup tg;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        lb = new Label("いらっしゃいませ。");
        rb1 = new RadioButton("車");
        rb2 = new RadioButton("トラック");
        tg = new ToggleGroup();

        // need to add radio buttons to ToggleGroup
        rb1.setToggleGroup(tg);
        rb2.setToggleGroup(tg);

        rb1.setSelected(true);

        BorderPane bp = new BorderPane();
        HBox hb = new HBox();

        hb.getChildren().add(rb1);
        hb.getChildren().add(rb2);
        hb.setAlignment(Pos.CENTER);

        bp.setTop(lb);
        bp.setCenter(hb);

        rb1.setOnAction(new SampleEventHandler());
        rb2.setOnAction(new SampleEventHandler());

        Scene sc = new Scene(bp, 300, 200);

        stage.setScene(sc);

        stage.setTitle("サンプル");
        stage.show();
    }

    class SampleEventHandler implements EventHandler<ActionEvent> {
        public void handle(ActionEvent e) {
            RadioButton tmp = (RadioButton) e.getSource();
            lb.setText(tmp.getText() + "を選びました。");
        }
    }

}

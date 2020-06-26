package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Sample8 extends Application {
    // displaying a button with a jpg image and pressing the button disables the button

    private Label lb;
    private Button bt;
    private Image im;

    public static void main(String[] args) {
        launch(args);
    }

    public void start (Stage stage) throws Exception {
        lb = new Label("いらっしゃいませ。");
        bt = new Button("購入");

        im = new Image(getClass().getResourceAsStream("car.jpg"));
        bt.setGraphic(new ImageView(im));

        BorderPane bp = new BorderPane();

        bp.setTop(lb);
        bp.setCenter(bt);


        bt.setOnAction(new SampleEventHandler());

        Scene sc = new Scene(bp, 300, 200);

        stage.setScene(sc);

        stage.setTitle("サンプル");
        stage.show();
    }

    class SampleEventHandler implements EventHandler<ActionEvent> {
        public void handle(ActionEvent e) {
            lb.setText("ご購入ありがとうございます。");
            bt.setDisable(true);
        }
    }

}

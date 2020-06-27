package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Practice2 extends Application {
    // selecting a checkbox displays the image on the label
    private Label lb;
    private CheckBox ch;
    private Image im;
    private ImageView iv;


    public static void main(String[] args) {
        launch(args);
    }

    public void start (Stage stage) throws Exception {
        lb = new Label("車です。");
        ch = new CheckBox("画像の表示");
        im = new Image(getClass().getResourceAsStream("car.jpg"));
        iv = new ImageView(im);

        BorderPane bp = new BorderPane();

        bp.setCenter(lb);
        bp.setBottom(ch);

        ch.setOnAction(new SampleEventHandler());

        Scene sc = new Scene(bp, 300, 200);

        stage.setScene(sc);

        stage.setTitle("サンプル");
        stage.show();
    }

    class SampleEventHandler implements EventHandler<ActionEvent> {
        public void handle(ActionEvent e) {
            CheckBox tmp = (CheckBox) e.getSource();
            if (tmp.isSelected() == true) {
                lb.setGraphic(iv);
            } else if (tmp.isSelected() == false) {
                lb.setGraphic(null);
            }
        }
    }

}

package ba.unsa.etf.rpr.lv7lv8;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Main extends javafx.application.Application {
    @Override
    public void start(Stage stage) {
        KorisniciModel korisniciModel = new KorisniciModel();
        korisniciModel.napuni();

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/file.fxml"));
            Controller controller = new Controller(korisniciModel);
            loader.setController(controller);
            Parent root = loader.load();

            stage.setTitle("Korisnici");
            Scene scene = new Scene(root);
            stage.setScene(scene);
            scene.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
            //stage.setScene(new Scene(root, 700, 400));

            stage.initStyle(StageStyle.UNDECORATED);
            stage.setMinWidth(700);
            stage.setMinHeight(400);
            stage.setResizable(true);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}
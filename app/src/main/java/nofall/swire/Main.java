package nofall.swire;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent fxml = FXMLLoader.load(getClass().getResource("fx/swire.fxml"));

        int width = 768*2;
        int height = 512*2;

        stage.setTitle("Swire");
        stage.setMaxWidth(Double.MAX_VALUE);
        stage.setMaxHeight(Double.MAX_VALUE);
        // stage.setResizable(false); // In the meantime.

        stage.setScene(new Scene(fxml, width, height));
        // new Gui().initialize();
        stage.show();
        // throw new UnsupportedOperationException("Unimplemented method 'start'");
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Application.launch(args);
    }
}

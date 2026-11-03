package nofall.swire;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent fxml = FXMLLoader.load(getClass().getResource("fx/swire.fxml"));

        Scene scene;

        int width = 768*2;
        int height = 512*2;

        stage.setTitle("Swire");
        stage.setMaxWidth(Double.MAX_VALUE);
        stage.setMaxHeight(Double.MAX_VALUE);
        // stage.setResizable(false); // In the meantime.
        stage.initStyle(StageStyle.UNDECORATED); // Remove OS window decorations (title bar, borders, etc.)

        stage.setScene(scene = new Scene(fxml, width, height));
        scene.getStylesheets().add(getClass().getResource("style/swire.css").toExternalForm());
        // new Gui().initialize();
        stage.show();
        // throw new UnsupportedOperationException("Unimplemented method 'start'");
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.setProperty("glass.win.uiScale", "2.0"); // Force 200% scaling
        Application.launch(args);
    }
}

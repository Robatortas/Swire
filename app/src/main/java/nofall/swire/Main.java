package nofall.swire;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Swire");
        stage.show();
    }

    public static void launchApp(String[] args) {
        Application.launch(Main.class, args);
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        launchApp(args);
    }
}

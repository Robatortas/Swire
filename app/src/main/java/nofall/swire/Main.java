package nofall.swire;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Swire");
        stage.setWidth(768*2);
        stage.setHeight(512*2);
        stage.setResizable(false); // In the meantime.
        stage.show();
        // throw new UnsupportedOperationException("Unimplemented method 'start'");
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Application.launch(args);
    }
}

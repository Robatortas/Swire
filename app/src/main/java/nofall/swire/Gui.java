package nofall.swire;

import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class Gui {

    @FXML 
    static VBox root;

    @FXML 
    private MenuBar MainToolbar;

    @FXML
    public void initialize() {
        System.out.println("Gui initialized");
        root = new VBox();
        VBox.setVgrow(MainToolbar, Priority.ALWAYS);
    }
}
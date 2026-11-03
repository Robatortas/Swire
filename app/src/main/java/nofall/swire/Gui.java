package nofall.swire;

import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class Gui {

    double globalScale = 30.5; // Scale to 150%

    @FXML 
    static VBox root;

    @FXML 
    private MenuBar MainToolbar;

    @FXML
    public void initialize() {
        System.out.println("Gui initialized");
        root = new VBox();
        VBox.setVgrow(MainToolbar, Priority.ALWAYS);
        setGlobalScale(globalScale);
    }

    public void setGlobalScale(double globalScale) {
        // 2. Wrap it inside a Group to pin the zoom origin to the Top-Left corner
        Group scalingWrapper = new Group(root);

        scalingWrapper.setScaleX(globalScale);
        scalingWrapper.setScaleY(globalScale);
    }
}
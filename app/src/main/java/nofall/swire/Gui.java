package nofall.swire;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class Gui {

    double globalScale = 1.5; // Scale to 150%

    @FXML 
    static VBox root;

    @FXML 
    private MenuBar MainToolbar;

    @FXML
    public BorderPane WindowTopBorder;


    @FXML
        private Button WindowQuit;

    @FXML
    public void initialize() {
        System.out.println("Gui initialized");
        root = new VBox();
        VBox.setVgrow(MainToolbar, Priority.ALWAYS);
        setGlobalScale(globalScale);

        WindowPaneManager windowPaneManager = new WindowPaneManager();
    }

    /**
     * <b>WindowPaneManager</b> class.
     * <br><br>
     * For managing the top window pane, including dragging, resizing, and button logic. 
     * */
    private class WindowPaneManager {

        public WindowPaneManager() {
            initWindowPane();
        }

        public void initWindowPane() {
            setWindowBorderPaneSettings(WindowTopBorder);
            quitLogic();
        }

        public void setWindowBorderPaneSettings(BorderPane borderPane) {
            // borderPane.setOnMousePressed(mouseEvent -> {
            //     double initialX = mouseEvent.getSceneX();
            //     double initialY = mouseEvent.getSceneY();

                
            // });
            // borderPane.setOnMouseDragged(dragEvent -> {
            //         System.out.println("Mouse is being dragged at: " + dragEvent.getSceneX() + ", " + dragEvent.getSceneY());
            // }); 
        }

        public void quitLogic() {
            WindowQuit.setOnAction(e -> {
                    System.out.println("Quitting Swire GUI Client");
                    Platform.exit();
            });
        }
    }

    public void setGlobalScale(double globalScale) {
        // 2. Wrap it inside a Group to pin the zoom origin to the Top-Left corner
        Group scalingWrapper = new Group(root);

        scalingWrapper.setScaleX(globalScale);
        scalingWrapper.setScaleY(globalScale);
    }
}
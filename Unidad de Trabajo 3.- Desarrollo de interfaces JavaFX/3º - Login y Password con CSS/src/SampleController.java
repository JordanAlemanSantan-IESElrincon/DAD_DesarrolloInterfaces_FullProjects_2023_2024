import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

public class SampleController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Pane paneMain;

    @FXML
    void initialize() {
        assert paneMain != null : "fx:id=\"paneMain\" was not injected: check your FXML file 'Sample.fxml'.";

    }

}

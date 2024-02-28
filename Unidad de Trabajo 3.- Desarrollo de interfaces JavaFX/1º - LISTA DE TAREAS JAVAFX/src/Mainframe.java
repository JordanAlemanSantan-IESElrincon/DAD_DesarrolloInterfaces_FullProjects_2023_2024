import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class Mainframe {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonCompletadaTareaListaTareas;

    @FXML
    private Button buttonNuevaTareaListaTareas;

    @FXML
    private Label labelIngresaListaTareas;

    @FXML
    private Label labelListaTareas;

    @FXML
    private ListView<String> listViewListaTareas;

    @FXML
    private Pane panelDerechoListaTareas;

    @FXML
    private Pane panelIzquierdoListaTareas;

    @FXML
    private TextField textFieldIngresaListaTareas;

    @FXML
    private ObservableList<String> tasks = FXCollections.observableArrayList();

    @FXML
    void initialize() {
        assert buttonCompletadaTareaListaTareas != null
                : "fx:id=\"buttonCompletadaTareaListaTareas\" was not injected: check your FXML file 'Sample.fxml'.";
        assert buttonNuevaTareaListaTareas != null
                : "fx:id=\"buttonNuevaTareaListaTareas\" was not injected: check your FXML file 'Sample.fxml'.";
        assert labelIngresaListaTareas != null
                : "fx:id=\"labelIngresaListaTareas\" was not injected: check your FXML file 'Sample.fxml'.";
        assert labelListaTareas != null
                : "fx:id=\"labelListaTareas\" was not injected: check your FXML file 'Sample.fxml'.";
        assert listViewListaTareas != null
                : "fx:id=\"listViewListaTareas\" was not injected: check your FXML file 'Sample.fxml'.";
        assert panelDerechoListaTareas != null
                : "fx:id=\"panelDerechoListaTareas\" was not injected: check your FXML file 'Sample.fxml'.";
        assert panelIzquierdoListaTareas != null
                : "fx:id=\"panelIzquierdoListaTareas\" was not injected: check your FXML file 'Sample.fxml'.";
        assert textFieldIngresaListaTareas != null
                : "fx:id=\"textFieldIngresaListaTareas\" was not injected: check your FXML file 'Sample.fxml'.";

        listViewListaTareas.setItems(tasks);

        // textFieldIngresaListaTareas.setText("Hola");

    }

    @FXML
    private void handleAddTaskButtonAction(ActionEvent event) {
        String task = textFieldIngresaListaTareas.getText();
        if (!task.isEmpty()) {
            tasks.add(task);
            textFieldIngresaListaTareas.clear();
        }
    }

    @FXML
    private void handleCompleteTaskButtonAction(ActionEvent event) {
        int selectedIndex = listViewListaTareas.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            tasks.remove(selectedIndex);
        }
    }

}

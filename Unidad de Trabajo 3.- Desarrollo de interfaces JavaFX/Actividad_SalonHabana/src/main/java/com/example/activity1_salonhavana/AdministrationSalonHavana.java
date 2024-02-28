package com.example.activity1_salonhavana;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AdministrationSalonHavana extends Application implements Initializable {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        phone.setCellValueFactory(new PropertyValueFactory<>("phone"));
        numPersons.setCellValueFactory(new PropertyValueFactory<>("numPersons"));
        selectedDate.setCellValueFactory(new PropertyValueFactory<>("selectedDate"));
        cuisine.setCellValueFactory(new PropertyValueFactory<>("cuisine"));
        eventOption.setCellValueFactory(new PropertyValueFactory<>("event"));

        tableViewReserve.setItems(FXCollections.observableArrayList());
    }

    public void addToReservationTable(Reserve reservation) {
        tableViewReserve.getItems().add(reservation);
        tableViewReserve.refresh();
    }

    @FXML
    private void handleButtonReserve() throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("SpentSalonHavana.fxml"));
        Parent root = loader.load();
        SpentSalonHavana spentSalonHavanaController = loader.getController();
        spentSalonHavanaController.setAdministrationSalonHavana(this);

        Stage stage = new Stage();
        stage.setTitle("Reserva en Salón Havana");
        stage.setScene(new Scene(root));
        stage.setResizable(false);

        stage.initModality(Modality.APPLICATION_MODAL);

        // Get the screen size
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();

        double desiredY = primaryScreenBounds.getMinY();

        // Calculate the X position to center a bit to the right
        double centerX = primaryScreenBounds.getMinX() + primaryScreenBounds.getWidth() / 2;
        double desiredX = centerX + 40; // Adjustment of 50 pixels to the right

        // Set the X and Y position of the window
        stage.setX(desiredX);
        stage.setY(desiredY);

        stage.showAndWait();
    }

    @FXML
    public Pane paneMain;
    @FXML
    public Pane paneTitle;
    @FXML
    public Pane paneBody;
    @FXML
    public Pane paneReserveList;
    @FXML
    public TableView<Reserve> tableViewReserve;
    @FXML
    public TableColumn<Reserve, String> name;
    @FXML
    public TableColumn<Reserve, String> phone;
    @FXML
    public TableColumn<Reserve, String> numPersons;
    @FXML
    public TableColumn<Reserve, String> selectedDate;
    @FXML
    public TableColumn<Reserve, String> cuisine;
    @FXML
    public TableColumn<Reserve, String> eventOption;
    @FXML
    public Button buttonReserve;
}

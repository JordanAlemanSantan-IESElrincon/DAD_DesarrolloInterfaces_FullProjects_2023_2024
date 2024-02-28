package com.example.activity1_salonhavana;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("AdministrationSalonHavana.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        stage.setTitle("Administración de Salon Havana");
        stage.setScene(scene);
        stage.setResizable(false);

        stage.setX(0);
        stage.setY(0);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
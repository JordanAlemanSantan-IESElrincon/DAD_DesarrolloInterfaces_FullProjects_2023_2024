module com.example.actividad1_salonhabana {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.activity1_salonhavana to javafx.fxml;
    exports com.example.activity1_salonhavana;
}
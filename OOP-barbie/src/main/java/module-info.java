module com.example.oopprojekt {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.oopprojekt to javafx.fxml;
    exports com.example.oopprojekt;
}
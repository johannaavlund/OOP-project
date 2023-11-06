module com.example.pacmanapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.pacmanapp to javafx.fxml;
    exports com.example.pacmanapp;
}
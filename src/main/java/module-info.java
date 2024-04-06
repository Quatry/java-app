module com.quatry.posudaapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.quatry.posudaapp to javafx.fxml;
    exports com.quatry.posudaapp;
    exports com.quatry.posudaapp.controller;
    opens com.quatry.posudaapp.controller to javafx.fxml;
}
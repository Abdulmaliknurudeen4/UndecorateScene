module com.example.undecoratescene {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.undecoratescene to javafx.fxml;
    exports com.example.undecoratescene;
}
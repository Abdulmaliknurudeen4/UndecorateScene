package com.example.undecoratescene;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

import java.io.IOException;

public class MainView {

    public AnchorPane content;
    public HBox top;

    public void handleLogout(ActionEvent actionEvent) throws IOException {
        Parent main = FXMLLoader.load(HelloApplication.class.getResource("hello-view.fxml"));
        content.getChildren().removeAll();
        content.getChildren().setAll(main);

    }

    public void minimize_stage(MouseEvent mouseEvent) {
        HelloApplication.stage.setIconified(true);
    }

    public void close_app(MouseEvent mouseEvent) {
        System.exit(0);
    }
}

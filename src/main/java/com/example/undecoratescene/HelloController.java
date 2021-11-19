package com.example.undecoratescene;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {


    @FXML
    private AnchorPane parent;

    @FXML
    private HBox top;

    @FXML
    private Pane content;

    private double xOffset = 0;
    private double yOffset = 0;


    public void initialize(URL url, ResourceBundle rb){
//        makeStageDraggable();

    }

 /*   private void makeStageDraggable(){
        parent.setOnMousePressed(e->{
            xOffset = e.getSceneX();
            yOffset = e.getSceneY();
        });

        parent.setOnMouseDragged(e->{
            System.out.println("Drag");
            HelloApplication.stage.setX(e.getScreenX() - xOffset);
            HelloApplication.stage.setY(e.getScreenY() - yOffset);
            HelloApplication.stage.setOpacity(0.8f);

        });

        parent.setOnDragDone(e->{
            HelloApplication.stage.setOpacity(1.0f);
        });
        parent.setOnMouseReleased(e->{
            HelloApplication.stage.setOpacity(1.0f);
        });

    }*/



    public void minimize_stage(MouseEvent mouseEvent) {
        HelloApplication.stage.setIconified(true);
    }

    public void close_app(MouseEvent mouseEvent) {
        System.exit(0);
    }

    public void handle_loging(ActionEvent actionEvent) throws IOException {
        Parent menu  = FXMLLoader.load(getClass().getResource("MainView.fxml"));
        parent.getChildren().removeAll();
        parent.getChildren().setAll(menu);
    }

    public void onDragDone(DragEvent dragEvent) {
        HelloApplication.stage.setOpacity(1.0f);
    }

    public void onMouseDragged(MouseEvent mouseEvent) {
        HelloApplication.stage.setX(mouseEvent.getScreenX() - xOffset);
        HelloApplication.stage.setY(mouseEvent.getScreenY() - yOffset);
        HelloApplication.stage.setOpacity(0.8f);
    }

    public void onMouseExited(MouseEvent mouseEvent) {
    }

    public void onMousePressed(MouseEvent mouseEvent) {
        xOffset = mouseEvent.getSceneX();
        yOffset = mouseEvent.getSceneY();
    }

    public void onMouseReleased(MouseEvent mouseEvent) {
        HelloApplication.stage.setOpacity(1.0f);
    }
}
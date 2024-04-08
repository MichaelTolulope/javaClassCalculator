package com.example.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MyApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Button button = new Button();
        button.setText("Hi there!");
        Pane pane = new Pane();

        pane.getChildren().add(button);
        Scene scene = new Scene(pane,400,550);
        stage.setScene(scene);
        stage.setResizable(true);
        stage.setTitle("My First Java App!");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

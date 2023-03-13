package com.example.exercise09;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("calculatorUI.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("INFO5100 Calculator");
            stage.setScene(scene);
            stage.show();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}
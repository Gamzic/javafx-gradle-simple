package com.mechanitis.demo.javafxgradle;

import com.gluonhq.charm.glisten.control.ProgressIndicator;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;


public class HelloFX extends Application {

@FXML
private ProgressIndicator progressIndicator;

    @Override
    public void start(Stage stage) throws IOException {
        // String javaVersion = System.getProperty("java.version");


        String javafxVersion = System.getProperty("javafx.version");

    URL url = new File("src/main/resources/1.fxml").toURI().toURL();

        Parent root2 = FXMLLoader.load(url);
        stage.setTitle("Замутили2 приложуху на джаве версии " + javafxVersion);
        stage.setScene(new Scene(root2, 600,600));
        stage.show();

    }


    public static void main(String[] args) {
        launch();
    }

}
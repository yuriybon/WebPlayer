package pl.krakow.bondary;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Player extends Application {

    @Override
    public void start(Stage primaryStage) {
        WebView webView = new WebView();
        WebEngine engine = webView.getEngine();

        // Load the YouTube player from a URL
        String url = "https://www.youtube.com";
        engine.load(url);

        StackPane root = new StackPane();
        root.getChildren().add(webView);

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setTitle("YouTube Player");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Resize the WebView to match its content
        webView.setPrefHeight(500);
    }

    public static void main(String[] args) {
        launch(args);
    }
}

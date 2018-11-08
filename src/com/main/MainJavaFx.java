package com.main;

import com.util.HashMap;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import resource.lang.Lang;
import resource.lang.langage.EN;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class MainJavaFx extends Application {

    private static HashMap<String,String,String> traductor;

    private static Lang langue;

    private static Stage prStage;

    public static Boolean loadedSplash = false;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        traductor = new HashMap<>();
        langue = new EN();

        setPrimaryStage(primaryStage);
        prStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("../gui/NewUI.fxml"));
        prStage.setTitle("Traducteur");
        prStage.initStyle(StageStyle.UNDECORATED);
        Scene scene = new Scene(root, 1280, 720);
        prStage.setScene(scene);
        prStage.setResizable(false);
        prStage.getIcons().add(new Image("/resource/Images/icon.png"));
        scene.getStylesheets().add(getClass().getResource("..//gui/css/NewUICSS.css").toExternalForm());
        prStage.show();
        //loadTrad();
    }

    public static void loadTrad(){
        MainJavaFx.getTraductor().put(" ", "morse", "   ");
        MainJavaFx.getTraductor().put(" ", "l33t", " ");
        try {
            Thread.sleep(4000);
            BufferedReader br = new BufferedReader(new FileReader("./src/resource/dico.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                // process the line.
                String[] str = line.split(" ");
                MainJavaFx.getTraductor().put(str[0], str[1], str[2]);
                System.out.println(line);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static Stage getPrimaryStage() {
        return prStage;
    }

    private void setPrimaryStage(Stage pStage) {
        MainJavaFx.prStage = prStage;
    }

    public static Lang getLangue() {
        return langue;
    }

    public static void setLangue(Lang langue) {
        MainJavaFx.langue = langue;
    }

    public static HashMap<String, String, String> getTraductor() {
        return traductor;
    }
}

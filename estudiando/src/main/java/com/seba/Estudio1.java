package com.seba;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import javafx.stage.Stage;


public class Estudio1 extends Application {
    
    @Override 
    public void start(Stage stage) throws Exception {

        // Aqui van las imagenes que se quieran colocar.
        Image fondoImg = new Image("https://wallpapercave.com/wp/wp12569856.jpg");
        ImageView imgView_fondoImg = new ImageView(fondoImg);
        imgView_fondoImg.setFitHeight(1200);
        imgView_fondoImg.setFitWidth(1920);
        imgView_fondoImg.setPreserveRatio(false);

        // Aqui va el mensaje central de la app.
        Label lblInicioSesion = new Label("¡Bienvenido!");
        lblInicioSesion.setStyle(
          "-fx-font-size: 32px;" 
        + "-fx-font-weight: bold;"
        + "-fx-text-fill: white;"
        + "-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.8), 6, 0, 0, 2)"
        );

        VBox banner = new VBox(lblInicioSesion, imgView_fondoImg);
        banner.setAlignment(Pos.TOP_CENTER);

        Label lblUserName = new Label("Usuario o correo electronico");
        lblUserName.setStyle("-fx-text-fill: white; -fx-font-weight: bold; -fx-font-size: 14px;");
        TextField txfUserName = new TextField();

        txfUserName.setStyle(
        "-fx-background-color: rgba(255, 255, 255, 0.2); " +
        "-fx-border-color: rgba(255, 255, 255, 0.5); " +
        "-fx-border-width: 1px; " +
        "-fx-border-radius: 6px; " +
        "-fx-text-fill: white;" +
        "-fx-prompt-text-fill: rgba(255, 255, 255, 0.7)" +
        "-fx-font-size: 14px;" +
        "-fx-pref-heigt: 40px;" +
        "-fx-font-weight: bold;"
        );

        Label lblPassword = new Label("Contraseña");
        lblPassword.setStyle("-fx-text-fill: white; -fx-font-weight: bold; -fx-font-size: 14px;");
        PasswordField psfPassword = new PasswordField();

        psfPassword.setStyle(
            "-fx-background-color: rgba(255, 255, 255, 0.2); " +
            "-fx-border-color: rgba(255, 255, 255, 0.5); " +
            "-fx-border-width: 1px; " +
            "-fx-border-radius: 6px; " +
            "-fx-background-radius: 6px; " +
            "-fx-text-fill: white;" +
            "-fx-font-size: 14px;" +
            "-fx-pref-heigt: 40px;" +
            "-fx-font-weight: bold;"
        );


        Button btnSingIn = new Button("Iniciar sesion");
        btnSingIn.setStyle(
            "-fx-background-color: linear-gradient(to bottom, #72ceed 0%, #1a82b8 100%);" +
            "-fx-text-fill: white;" +
            "-fx-font-weight: bold;" +
            "-fx-font-size: 15px;" +
            "-fx-pref-height: 42px;" +
            "-fx-padding: 8px 20px;" +
            "-fx-border-color: #0b537d;" + 
            "-fx-border-radius: 8px;" +
            "-fx-background-radius: 8px;" +
            "-fx-cursor: hand;"
        );

        VBox login = new VBox(12, lblInicioSesion, lblUserName, txfUserName, lblPassword, psfPassword, btnSingIn);
        login.setAlignment(Pos.CENTER_LEFT);
        login.setMaxHeight(360);
        login.setMaxWidth(420);
        login.setPadding(new Insets(35));
        login.setStyle(
            "-fx-background-color: rgba(20,30,45,0.55);"+
            "-fx-background-radius: 18px;"+
            "-fx-border-color: rgba(255,255,255,0.35);"+
            "-fx-border-radius: 18px;"+
            "-fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.6), 25, 0, 0, 10);"
        );


        StackPane root = new StackPane(imgView_fondoImg, login);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: transparent;");

        Scene sceneLogin = new Scene(root, 1024, 768);
        
        stage.setScene(sceneLogin);
        stage.setTitle("Frutiger aero login");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

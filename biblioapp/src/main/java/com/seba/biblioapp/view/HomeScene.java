package com.seba.biblioapp.view;

import com.seba.biblioapp.controller.UserController;
import com.seba.biblioapp.model.User;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;


public class HomeScene {
  
    public Scene homeScene(){

        Image fondo = new Image("https://wallpaperaccess.com/full/21319137.jpg");
        ImageView fondoView = new ImageView(fondo);
        fondoView.setFitHeight(1080);
        fondoView.setFitWidth(1920);
        fondoView.setPreserveRatio(false);

        VBox imagenDeFondo = new VBox(fondoView);

        Label lbl_texto_inicial = new Label("BiblioApp user search");
        lbl_texto_inicial.setStyle("-fx-text-fill: white; -fx-font-weight: bold; -fx-font-size: 32px; -fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.8), 6, 0, 0, 2)");

        VBox inicio = new VBox(10, lbl_texto_inicial);
        inicio.setAlignment(Pos.TOP_CENTER);
        
        Label lbl_user_rut = new Label("Rut: ");
        lbl_user_rut.setStyle("-fx-text-fill: white; -fx-font-weight: bold; -fx-font-size: 14px; -fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.8), 6, 0, 0, 2)");

        TextField txf_user_rut = new TextField();
        txf_user_rut.setStyle(
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

        txf_user_rut.setPromptText("ej: 11.111.111-1");
        txf_user_rut.setStyle("-fx-text-fill: black; -fx-font-weight: bold; -fx-font-size: 14px;");

        Button btn_user_search = new Button("Buscar ♥");
        btn_user_search.setStyle(
            "-fx-background-color: linear-gradient(to bottom, #293438 0%, #041c29 100%);" +
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

        HBox hbox_user_search = new HBox(10, lbl_user_rut, txf_user_rut, btn_user_search);
        hbox_user_search.setAlignment(Pos.CENTER);

        Label lbl_user_data_rut =  new Label("Rut: ");
        lbl_user_data_rut.setStyle(
          "-fx-font-size: 14px;" 
        + "-fx-font-weight: bold;"
        + "-fx-text-fill: white;"
        + "-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.8), 6, 0, 0, 2)"
        );
        Label lbl_user_data_nombre =  new Label("Nombre: ");
        lbl_user_data_nombre.setStyle(
          "-fx-font-size: 14px;" 
        + "-fx-font-weight: bold;"
        + "-fx-text-fill: white;"
        + "-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.8), 6, 0, 0, 2)"
        );
        Label lbl_user_data_email =  new Label("Email: ");
        lbl_user_data_email.setStyle(
          "-fx-font-size: 14px;" 
        + "-fx-font-weight: bold;"
        + "-fx-text-fill: white;"
        + "-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.8), 6, 0, 0, 2)"
        );
        Label lbl_user_data_edad =  new Label("Edad: ");
        lbl_user_data_edad.setStyle(
          "-fx-font-size: 14px;" 
        + "-fx-font-weight: bold;"
        + "-fx-text-fill: white;"
        + "-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.8), 6, 0, 0, 2)"
        );
        Label lbl_user_data_puede_pedir =  new Label("¿Puede pedir libros? : ");
        lbl_user_data_puede_pedir.setStyle(
          "-fx-font-size: 14px;" 
        + "-fx-font-weight: bold;"
        + "-fx-text-fill: white;"
        + "-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.8), 6, 0, 0, 2)"
        );

        VBox vbox_user_data = new VBox(5, lbl_user_data_rut, lbl_user_data_nombre, lbl_user_data_email, lbl_user_data_edad, lbl_user_data_puede_pedir);
        vbox_user_data.setAlignment(Pos.CENTER);
        VBox panel = new VBox();
        panel.setPadding(new Insets(35));
        panel.setMaxHeight(360);
        panel.setMaxWidth(420);
        panel.setStyle(
        "-fx-background-color: rgba(255, 255, 255, 0.35);" + 
        "-fx-background-radius: 10;" +                     
        "-fx-border-color: rgba(255, 255, 255, 0.6);" +     
        "-fx-border-radius: 10;" +                           
        "-fx-border-width: 1.5;" +                       
        "-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.15), 15, 0, 0, 5);" 
        );
        VBox dta = new VBox(10, inicio, hbox_user_search, vbox_user_data);
        dta.setAlignment(Pos.CENTER);



        StackPane root = new StackPane(imagenDeFondo, panel, dta);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: transparent;");

        Scene home_scene = new Scene(root, 720, 480);


        btn_user_search.setOnAction(e -> {
            UserController userController = new UserController();
            String rutIngresado = txf_user_rut.getText();
            User usuario = userController.buscarPorRut(rutIngresado);
            if (usuario != null) {
              lbl_user_data_rut.setText("Rut: " + usuario.getRut());
              lbl_user_data_nombre.setText("Nombre: " + usuario.getNombre());
              lbl_user_data_email.setText("Email: " + usuario.getEmail());
              lbl_user_data_edad.setText("Edad: " + usuario.getEdad());
              lbl_user_data_puede_pedir.setText("¿Puede pedir libros? : " + (usuario.isPuede_solicitar_prestamos() ? "Si":"No"));
            }
        });


        return home_scene;

    }    

}

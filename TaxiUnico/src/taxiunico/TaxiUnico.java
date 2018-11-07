/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxiunico;

import java.awt.BorderLayout;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author gabrielcarrion
 */
public class TaxiUnico extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        HBox idBox = new HBox();
        HBox passBox = new HBox();
        
        HBox password = new HBox();
        idBox.setSpacing(10);
        passBox.setSpacing(10);
        
        Label id = new Label ("id");
        Label psw = new Label ("contrasena");
        Label mail = new Label ("mail");
        Label nombre = new Label ("contrasena");
        Label apellido = new Label ("apellido");
        Label telefono = new Label ("telefono");
        
        TextField iden = new TextField ();
        TextField tfP = new TextField ();
        BorderPane Tapp = new BorderPane();
        
        idBox.getChildren().addAll(id, iden);
        passBox.getChildren().addAll(psw, tfP);
       
       HBox areaBotones = new HBox();
       
       
       Button re = new Button("Registrate");
       Button li = new Button("Sign In");
       Button lo = new Button("Log out");
      areaBotones.getChildren().addAll(re, li, lo);
       
        Tapp.setTop(idBox);
        Tapp.setTop(passBox);
        Tapp.setCenter(areaBotones);
        
        
        Button btn = new Button();
        btn.setText("registrate");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("registrate");
            }
        
        });
        
       
        
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Transpaís Taxi");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

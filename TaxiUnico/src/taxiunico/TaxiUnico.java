/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxiunico;

import java.awt.BorderLayout;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
        JLabel id = new JLabel ("id");
        JLabel mail = new JLabel ("email");
        JLabel pass = new JLabel ("contrasena");
        JLabel nom = new JLabel("Nombre");
        JLabel ape = new JLabel ("Apellido");
        JLabel tel = new JLabel ("Telefono");
        
        JTextField inId = new JTextField ("ingresa id");
        JTextField inMa = new JTextField ("ingresa mail");
        JTextField inPa = new JTextField ("ingresa una contraseña");
        JTextField inNom = new JTextField ("ingresa tu nombre");
        JTextField inApe = new JTextField ("ingresa tu apellido");
        JTextField inTel = new JTextField ("ingresa tu numero de telefono");
        
        JPanel paId = new JPanel(new BorderLayout());
        paId.add(id,BorderLayout.WEST);
        paId.add(inId,BorderLayout.CENTER);
        
        JPanel paMa = new JPanel(new BorderLayout());
        paMa.add(mail,BorderLayout.WEST);
        paMa.add(inMa,BorderLayout.CENTER);
        
        JPanel paPsw = new JPanel(new BorderLayout());
        paPsw.add(pass,BorderLayout.WEST);
        paPsw.add(inPa,BorderLayout.CENTER);
        
        JPanel paNom = new JPanel(new BorderLayout());
        paNom.add(nom,BorderLayout.WEST);
        paNom.add(inNom,BorderLayout.CENTER);
        
        JPanel paApe = new JPanel(new BorderLayout());
        paApe.add(id,BorderLayout.WEST);
        paApe.add(inId,BorderLayout.CENTER);
        
        
        JPanel paTel = new JPanel(new BorderLayout());
        paTel.add(tel,BorderLayout.WEST);
        paTel.add(inTel,BorderLayout.CENTER);
        
        Button btn = new Button();
        btn.setText("Sign in");
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

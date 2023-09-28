/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import static javafx.application.Application.launch;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author 2dam
 */
public class JavaFXViewImplementation extends javafx.application.Application implements View, Initializable {

    private static String greeting;

    @FXML
    private TextField textField;

   /* @Override
    public void start(Stage primaryStage) throws Exception {
        // Load FXML view
        // Asi se cargaria si el fxml estubiera en el mismo package
        FXMLLoader loader = new FXMLLoader(getClass().getResource("view.fxml"));
        Parent root = loader.load();
        JavaFXViewImplementation viewController = loader.getController();
        // Create a Scene for view
        Scene scene = new Scene(root);
        viewController.textField.setText(greeting);
        // Put the view on Stage
        primaryStage.setScene(scene);
        // Show the Stage
        primaryStage.show();

    } */
    
        @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            // Load FXML view
            FXMLLoader loader = new FXMLLoader(getClass().getResource("view.fxml"));
            Parent root = loader.load();
            JavaFXViewImplementation viewController = loader.getController();
            
            // Create a Scene for view
            Scene scene = new Scene(root);
            viewController.textField.setText(greeting);
            
            // Put the view on Stage
            primaryStage.setScene(scene);
            
            // Show the Stage
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace(); // Imprime la excepción en la consola
        }
    }

    @Override
    public void showGreeting(String message) {
        greeting = message;
        launch();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }

}


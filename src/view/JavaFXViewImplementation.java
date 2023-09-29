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
 * View implementation for showing the message to the user in a JavaFX window.
 * @author Iñigo and Dani
 */
public class JavaFXViewImplementation extends javafx.application.Application implements View, Initializable {

    private static String greeting;

    @FXML
    private TextField textField;
    /**
	 * Shows a greeting to the user via a JavaFX window.
	 * @param primaryStage The Stage object to show the greeting.
	 * @throws Exception If there's an error during execution.
	 */
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
	/**
	 * Shows a greeting to the user via a JavaFX window.
	 * @param message The greeting to show.
	 */
    @Override
    public void showGreeting(String message) {
        greeting = message;
        launch();
    }
	/**
	 * Initializes the view.
	 * @param location The location needed to initialize the view.
	 * @param resources The resources needed to initialize the view.
	 */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }

}


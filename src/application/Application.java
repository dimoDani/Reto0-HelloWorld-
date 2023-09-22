/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import controller.Controller;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.ModelFactory;
import view.ViewFactory;

/**
 *
 * @author 2dam
 */
public class Application {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		if (args.length==2)
			new Controller().Run(ViewFactory.getView(args[0]), ModelFactory.getModel(args[1]));
	}

	/*@Override
	public void start(Stage primaryStage) throws Exception {
		// Load FXML view
		// Asi se cargaria si el fxml estubiera en el mismo package
		FXMLLoader loader = new FXMLLoader(getClass().getResource("view.fxml"));
		Parent root = loader.load();
		FMXLController viewController = loader.getController();
		viewController.setGreeting(greeting);
		// Create a Scene for view
		Scene scene = new Scene(root);
		// Put the view on Stage
		primaryStage.setScene(scene);
		// Show the Stage
		primaryStage.showAndWait();

	}*/
}

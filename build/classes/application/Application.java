package application;

import controller.Controller;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.ModelFactory;
import view.ViewFactory;

/**
 * Main class of the application. It creates the View and Model objects and runs the application following MVC.
 * @author Dani and Iñigo
 */
public class Application {

	/**
	 * The main method of the application.
	 * @param args The arguments of the application used to choose the View and Model.
	 */
	public static void main(String[] args) {
		if (args.length==2)
			new Controller().Run(ViewFactory.getView(args[0]), ModelFactory.getModel(args[1]));
	}

}

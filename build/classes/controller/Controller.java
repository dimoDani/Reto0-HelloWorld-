package controller;

import view.View;
import model.Model;

/**
 * Controller class to execute the application following MVC.
 * @author Dani and Iñigo
 */
public class Controller  {
    /**
     * Runs the application with the given view and model.
     * 
     * @param view  The View object to show the message to the user.
     * @param model The Model object to obten the message.
     */
	public void Run (View view, Model model)  {
		try {
			if (view != null) {
				if (model == null)
					view.showGreeting("Could not get the message");
				else
					view.showGreeting(model.getGreeting());
			}			
		} catch (Exception e) {
			view.showGreeting(e.getMessage());
		}
	}
}

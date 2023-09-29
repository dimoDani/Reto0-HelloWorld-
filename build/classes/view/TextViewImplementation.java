package view;

/**
 * View implementation for showing the message to the user in the terminal.
 * @author DAani and Iñigo
 */
public class TextViewImplementation implements View{
	/**
	 * Shows a greeting to the user via the terminal.
	 * @param greeting The greeting to show.
	 */
    public void showGreeting(String greeting) {
			System.out.println(greeting);	
	}
}

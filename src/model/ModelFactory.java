package model;

/**
 * Factory class for creating Model objects.
 * @author Inigo and Dani
 */
public class ModelFactory {
	/**
     * Returns a Model object based on the provided option.
     *
     * @param modelOption Either "file" or "database".
     * @return The corresponding Model object.
     */
	private static Model model = null;

	public static Model getModel(String modelOption) {
	if (modelOption.equalsIgnoreCase("file"))
    	model = new FileModelImplementation();
	else if (modelOption.equalsIgnoreCase("database")) 
				model =  new DbModelImplementation();

	return model;
	}
}

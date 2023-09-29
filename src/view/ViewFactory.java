package view;

/**
 * Factory class for creating View objects.
 * @author Dani and Iñigo
 */
public class ViewFactory {
    private static View view = null;
	/*
	 * Returns a View object based on the provided option.
	 * @param viewOption Either "text" or "window".
	 * @return The corresponding View object.
	 */
    public static View getView(String viewOption) {
        if (viewOption.equalsIgnoreCase("text")) {
            view = new TextViewImplementation();
        } else if (viewOption.equals("window")) {
            view = new JavaFXViewImplementation();
        }

        return view;
    }
}
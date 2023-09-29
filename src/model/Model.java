package model;

/**
 * Model interface for getting the message.
 * @author Iñigo and Dani
 */
public interface Model {
	/**
     * Gets a message.
     *
     * @return The message.
     * @throws Exception If there's an error during execution.
     */
    public String getGreeting() throws Exception;
}

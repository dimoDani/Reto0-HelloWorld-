package model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for FileModelImplementation class.
 * @author Inigo y Dani
 */
public class FileModelImplentationTest {
    /**
	 * Constructor for FileModelImplementationTest class.
	 */
    public FileModelImplentationTest() {
    }
	/**
	 * Test of getGreeting method, of class FileModelImplementation.
	 * @throws Exception
	 */
     @Test
    public void testGetGreeting() throws Exception {
        FileModelImplementation db = new FileModelImplementation();
        assertEquals("Hello world!", db.getGreeting());
    }
    /**
	 * Test of getGreeting method, of class FileModelImplementation.
	 * @throws Exception
	 */
    @Test (expected = Exception.class)
    public void testGetGreetingException() throws Exception {
        FileModelImplementation db = new FileModelImplementation();
        assertEquals("Hello world!", db.getGreeting());
    }
    
}

package model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for DbModelImplementation class.
 * @author Inigo y Dani
 */
public class DbModelImplementationTest {
    /**
	 * Constructor for DbModelImplementationTest class.
	 */
    public DbModelImplementationTest() {
    }
	/**
	 * Test of getGreeting method, of class DbModelImplementation.
	 */
    @Test
    public void testGetGreeting() throws Exception {
        DbModelImplementation db = new DbModelImplementation();
        assertEquals("Hello Iñigo", db.getGreeting());
    }
    /**
	 * Test of getGreeting method, of class DbModelImplementation.
	 * @throws Exception If there's an error during execution.
	 */
    @Test (expected = Exception.class)
    public void testGetGreetingException() throws Exception {
        DbModelImplementation db = new DbModelImplementation();
        assertEquals("Hello Iñigo", db.getGreeting());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Inigo y Dani
 */
public class DbModelImplementationTest {
    
    public DbModelImplementationTest() {
    }

    @Test
    public void testGetGreeting() throws Exception {
        DbModelImplementation db = new DbModelImplementation();
        assertEquals("Hello world!", db.getGreeting());
    }
    
    @Test (expected = Exception.class)
    public void testGetGreetingException() throws Exception {
        DbModelImplementation db = new DbModelImplementation();
        assertEquals("Hello world!", db.getGreeting());
    }
}

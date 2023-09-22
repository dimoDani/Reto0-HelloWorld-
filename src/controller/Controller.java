/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.View;
import model.Model;

/**
 *
 * @author Iñigo and Dani
 */
public class Controller  {
    
	public void Run (View view, Model model)  {
		try {
			view.showGreeting(model.getGreeting());
		} catch (Exception e) {
			
		}
	}
}

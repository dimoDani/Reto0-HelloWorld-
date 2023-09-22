/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template Db choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Inigo and Dani
 */
public class ModelFactory {
	private static Model model = null;

	public static Model getModel(String modelOption) {
	if (modelOption.equalsIgnoreCase("file"))
    	model = new FileModelImplentation();
	//else if (modelOption == "database")
	//	model =  new DbModelImplementation();

	return model;
	}
}

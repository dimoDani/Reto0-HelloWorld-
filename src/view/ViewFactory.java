/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author 2dam
 */
public class ViewFactory {
    private static View view = null;

	public static View getView(String viewOption) {
	if (viewOption.equalsIgnoreCase("text"))
    	view = new TextViewImplementation();
	//else if (modelOption == "database")
	//	model =  new DbModelImplementation();

	return view;
	}
}

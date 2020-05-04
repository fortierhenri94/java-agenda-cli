/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**Mathieu Magnan-Deschamps MAGM06039309
 * Vincent Renaud RENV21039508
 * @author Mathieu & Vincent
 *
 */
class Contact extends ContactBasic {
	
    int age;
    Calendar dnaissance;
    ArrayList<String> motscle;


    public Contact(String nom, Calendar dnaissance, Telephone tel, ArrayList<String> motscle) {   
        
        super(nom, tel);                                          
        this.dnaissance = dnaissance;
        this.motscle = motscle;
    }
	
    public String getDonnees() { 
		
        return super.getDonnees()+"Date de naissance : "+ dnaissance.get(Calendar.DATE)+"/"+ dnaissance.get(Calendar.MONTH) + "/"+ dnaissance.get(Calendar.YEAR) + "\nÂge : " + getAge() + "  |  " + "Mots clés : " + this.motscle;
		
    }
	
    public int getAge() {
        
        Calendar aujourdhui=new GregorianCalendar();
	age=aujourdhui.get(Calendar.YEAR)-dnaissance.get(Calendar.YEAR);
        aujourdhui.set(Calendar.YEAR, dnaissance.get(Calendar.YEAR));
        if(aujourdhui.before(dnaissance))
	age--;
	return age;
	  
    }
	
    public ArrayList<String> getMotCle() {

        return this.motscle;
	
    }
	 
	
}
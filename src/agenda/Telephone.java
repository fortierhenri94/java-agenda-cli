/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**Mathieu Magnan-Deschamps MAGM06039309
 * Vincent Renaud RENV21039508
 * @author Mathieu & Vincent
 * 
 */
class Telephone {
	
    String notelephone; 
    String typetelephone; 
	
    public Telephone(String phoneno, String phonetype) {
            
        this.notelephone = phoneno;
        this.typetelephone = phonetype;
        
    }
	
    public String getTelephone() {

        return "Numero de telephone : " + this.notelephone + "  |  " + "Type de telephone : " + this.typetelephone + "  |  ";
    }
	
}
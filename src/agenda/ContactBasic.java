/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *Mathieu Magnan-Deschamps MAGM06039309
 * Vincent Renaud RENV21039508
 * @author Mathieu & Vincent
 */
class ContactBasic {
	
    String nom;
    Telephone tel;
	
    public ContactBasic(String name, Telephone phone) {

        this.nom = name;
	this.tel = phone;
		
    }
	
    public void setNom(String nom) {
	
        this.nom = nom;
	
    }
        
    public String getNom() {
	
        return this.nom;
	
    }
	
    public void setTelephone(Telephone tel) {
	
        this.tel = tel;
        
    }
	
    public String getDonnees() {
        
        return "Nom : " + this.nom + "  |  " + this.tel.getTelephone();
          
    }

	
}

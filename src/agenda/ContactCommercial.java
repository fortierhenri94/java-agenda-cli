/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.util.ArrayList;

/**
 Mathieu Magnan-Deschamps MAGM06039309
 * Vincent Renaud RENV21039508
 * @author Mathieu & Vincent
 */
class ContactCommercial extends ContactBasic {
	
    String nomEntreprise;
    String activite;
    
    ArrayList<Telephone> telephones = new ArrayList<Telephone>();
	
    public ContactCommercial(String nom, String nomEntreprise, String activite, Telephone tel) {
        
        super(nom, tel);                                                  
        this.nomEntreprise = nomEntreprise;
        this.activite = activite;
    }
	
    @Override
    
    public String getDonnees() {
		
        return super.getDonnees() + "Travail chez " + nomEntreprise + ", une entreprise de " + activite;

    }	
	
}

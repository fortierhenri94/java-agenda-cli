/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package agenda;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**Mathieu Magnan-Deschamps MAGM06039309
 * Vincent Renaud RENV21039508
 * @author Mathieu & Vincent
 *
 * 
 */
public class Agenda {
	
    ArrayList<Contact> ListeContacts = new ArrayList<Contact>();
	
    public Agenda() {

    }

    //[A] Creer un contact
    public void inserer() {
		
        Scanner scan = new Scanner(System.in);
	int type_contact;
        
        System.out.println();
        System.out.print("Veuillez entrer son nom : ");
        String nom = scan.nextLine();
        System.out.print("Veuillez entrer son numero de telephone : ");
        String notelephone = scan.nextLine();
        System.out.print("Veuillez entrer le type de telephone (Bureau, Maison, Mobile) ? : ");
        String typetelephone = scan.nextLine();
        System.out.print("Veuillez entrer les mots clés du contact (Utiliser un virgule entre chaque mots clés) : ");
        
		
        ArrayList<String> motscles = new ArrayList<String>();
		
        String motscle = scan.nextLine(); 
        motscles.add(motscle);
		
        Calendar birthday = Calendar.getInstance();
        birthday.setTime(this.getDateFromString());	
        
        
        System.out.print("Veuillez indiquer le type de contact ( 1 - Personnel, 2 - Commercial, 3 - Generique) : ");
        type_contact = scan.nextInt();
        
        
       
        if(type_contact == 1){
        
        
        
        this.ListeContacts.add(new Contact(nom, birthday, new Telephone(notelephone, typetelephone), motscles));
		
        System.out.println();
        System.out.println("Création du contact terminé.");
                
    }if(type_contact == 2){
        
        this.ListeContacts.add(new Contact(nom, birthday, new Telephone(notelephone, typetelephone), motscles));
        
        
        System.out.println();
        System.out.println("Création du contact terminé.");
    }else if (type_contact == 3) {
        
       this.ListeContacts.add(new Contact(nom, birthday, new Telephone(notelephone, typetelephone), motscles));
        
        
        System.out.println();
        System.out.println("Création du contact terminé.");
    }
        
    }    
    Date getDateFromString() {
		
        System.out.print("Veuillez entrer la date de naissance du contact (JJ/MM/AAAA) : "); 
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
		
	try {
            
            SimpleDateFormat parser = new SimpleDateFormat("dd/MM/yyyy");
            return parser.parse(time);   
            
	} 	
        
        catch (ParseException e) {
	
            System.out.println(e.getMessage());
	    return this.getDateFromString();
	    	
	}  

    }
	
    //[B] Rechercher un contact avec son nom  
    public void rechercheNom(String nom) {
		
        for (Contact thisContact : this.ListeContacts) {

            if (nom.equals(thisContact.getNom())) {
                
                System.out.println();
                System.out.println(thisContact.getDonnees());
            }
            
	}
    
    }
        
    //[C] Afficher la liste de tous les contacts
    public void afficherTout() {
		
        for (Contact thisContact : this.ListeContacts) {
            
            System.out.println(thisContact.getDonnees());
	
        }	
		
    }
}

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
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;  

public class TP2 {

    static Agenda monProgramme = new Agenda();
	
    static Scanner scan = new Scanner(System.in);
	
    public static void main(String[] args) {
           
        System.out.println();
        System.out.println("Bonjour! Bienvenue dans votre carnet d'adresses.");

        boolean Finprogramme = false;
		
        while (Finprogramme != true) {
                    
            System.out.println();
            System.out.println(" -----------------------------------------------");
            System.out.println("| Veuillez choisir l'une des options suivantes: |");
            System.out.println(" -----------------------------------------------");
            System.out.println("[A] Creer un contact");
            System.out.println("[B] Rechercher un contact avec son nom");
            System.out.println("[C] Afficher la liste de tous les contacts");
            System.out.println("[D] Fermer le programme");
            System.out.println();
		
            switch (scan.nextLine().charAt(0)) {
			
                //[A] Creer un contact
                case 'A':   monProgramme.inserer();
                            break;
                                
                //[B] Rechercher un contact avec son nom  
                case 'B':   System.out.println();
                            System.out.println("Veuillez entrer son nom : ");
                            monProgramme.rechercheNom(scan.nextLine());
                            System.out.println();
                            break;
                            
                //[C] Afficher la liste de tous les contacts
                case 'C':   System.out.println();
                            monProgramme.afficherTout();
                            System.out.println();
                            break;
                                
                //[D] Fermer le programme       
                case 'D':   System.out.println();
                            Finprogramme = true;
                            System.out.println("Fermeture du programme...");
                            break;

                //Saisie invalide
                default:    System.out.println("Choix non valide, veuillez réessayer!");
                
                
                

            }
				
        }
	
    }
	
}




import java.util.Scanner;

public class Velo {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Donnez l'heure de début de la location (un entier) : ");
        int debut = clavier.nextInt();
        System.out.print("Donnez l'heure de fin de la location (un entier) : ");
        int fin = clavier.nextInt();

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        if(debut<0||fin>24||debut>24||fin<0) {
        	System.out.println("Les heures doivent être comprises entre 0 et 24 !");
        }else {
        	if(debut==fin) {
        		System.out.println("Bizarre, vous n'avez pas loué votre vélo bien longtemps !");
        	}else if(debut>fin) {
        		 System.out.println("Bizarre, le début de la location est après la fin ...");
        	}else {
        		System.out.println("Vous avez loué votre vélo pendant");
    			int d=fin-debut;
        		if(debut <7 ) {
        			if(fin<=7) {
        				
        				 System.out.println(d+" heure(s) au tarif horaire de 1.0 franc(s)");
        				 System.out.print("Le montant total à payer est de ");
        				 System.out.println(1.0*d+" franc(s).");
        				
        			}else{
        				if(fin<=17){ 
        					System.out.println((7-debut)+" heure(s) au tarif horaire de 1.0 franc(s)");
        					System.out.println((fin-7)+" heure(s) au tarif horaire de 2.0 franc(s)");
        					System.out.print("Le montant total à payer est de ");
        					System.out.println(((1.0*(7-debut))+(2.0*(fin-7)))+" franc(s).");	
        				}else {
        					System.out.println((7-debut+fin-17)+" heure(s) au tarif horaire de 1.0 franc(s)");
        					System.out.println(10+ " heure(s) au tarif horaire de 2.0 franc(s)");
        					System.out.print("Le montant total à payer est de ");
        					System.out.println(((1.0*(d-10))+(2.0*(10)))+" franc(s).");	
        				}
        		}
     		
        	}else  {
        		if(debut<17) {
        		if(fin<=17){ 
					System.out.println((d)+" heure(s) au tarif horaire de 2.0 franc(s)");
				
					System.out.print("Le montant total à payer est de ");
					System.out.println(((2.0*(d)))+" franc(s).");	
				}else {
					System.out.println((fin-17)+" heure(s) au tarif horaire de 1.0 franc(s)");
					System.out.println((17-debut)+ " heure(s) au tarif horaire de 2.0 franc(s)");
					System.out.print("Le montant total à payer est de ");
					System.out.println(((1.0*(fin-17))+(2.0*(17-debut)))+" franc(s).");	
				}
        		}
        		
        		
        	else {
        		System.out.println((d)+" heure(s) au tarif horaire de 1.0 franc(s)");
				
				System.out.print("Le montant total à payer est de ");
				System.out.println(((1.0*(d)))+" franc(s).");	
        	}
        }
        
        }
       
        }


        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

        clavier.close();
    }
}
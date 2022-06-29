
import java.util.Scanner;
public class Champi {
	 public static void main(String[] args) {
		 Scanner clavier=new Scanner(System.in);
	System.out.println("Pensez a un champignon : amanite tue mouches, pied bleu, girolle,");
	System.out.println("cèpe de Bordeaux, coprin chevelu ou agaric jaunissant.");
	System.out.println();

	
	
	System.out.print("Est-ce que votre champignon vit en forêt (true : oui, false : non) ? ");
	Boolean isFor=clavier.nextBoolean();
 if(isFor) {

		System.out.print("Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? ");
		Boolean isConv=clavier.nextBoolean();
	 if(isConv) {
		
		 System.out.print("Est-ce que votre champignon a un anneau (true : oui, false : non) ? ");
			Boolean isAnn=clavier.nextBoolean();
 		 if(isAnn) {
				System.out.print("==> Le champignon auquel vous pensez est ");

				System.out.print("l'amanite tue-mouches");
 		 }else {
 			System.out.print("==> Le champignon auquel vous pensez est ");
				System.out.print("le pied bleu"); 
 		 }
		 
	}else {
			System.out.print("Est-ce que votre champignon a des lamelles (true : oui, false : non) ? ");
				Boolean isLam=clavier.nextBoolean();
			if(isLam) {
				System.out.print("==> Le champignon auquel vous pensez est ");
	 				System.out.print("la girolle");
			}else {
	    		System.out.print("==> Le champignon auquel vous pensez est ");
	    		System.out.print("le cèpe de Bordeaux");	 
	        }
			 
	}
 }else {
	 System.out.print("Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? ");
		Boolean isConv=clavier.nextBoolean();
	 if(isConv) {
			System.out.print("==> Le champignon auquel vous pensez est ");

			System.out.print("l'agaric jaunissant");
	 }else {
		 System.out.print("==> Le champignon auquel vous pensez est ");

			System.out.print("le coprin chevelu");
	 }
 }
	
	


}
}
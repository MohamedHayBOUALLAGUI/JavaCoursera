import java.util.Scanner;

public class Paques {
	
	private final static Scanner CLAVIER = new Scanner(System.in);
	/*Entrez une annee (1583-4000) :
		*2006
		*Date de Paques en 2006 : 16 avril*/
	
	
//une méthode statique demanderAnnee
	public static int demanderAnnee() {
		int ann;
		do {
		System.out.println("Entrez une annee (1583-4000) :");
		ann = CLAVIER.nextInt();
		}while(ann<1583|| ann>4000);
		
		return ann;
		
	}
	
	//une méthode statique afficheDate
	public static void afficheDate(int ann,int j) {
		int jour;
		String mois;
		if(j<= 31) {
			mois = "mars";
			 jour = j;
			
		}else {
			mois="avril";
			jour=j-31;
		}
		System.out.println("Date de Paques en " + ann +" : "+jour+" "+mois);
	}
	
	//une méthode statique datePaques
	public static int datePaques(int ann) {
		
		int siecle=ann/100;
		int p= ((13+(8*siecle))/25);
		int q=siecle/4;
		int m=(15-p+siecle-q)%30;
		int n=(4 + siecle - q)% 7;
		
		int d= (m+ 19*(ann%19))%30;
	
		int e=(2 * (ann % 4) + 4 * (ann % 7) + 6 * d + n) % 7;

		int jour = e + d +22;
		
		
		
		if((e==6)&&((d==29)||((d==28)&&(((11*(m+1))%30)<19)))) {
			jour-=7;
		}
		return jour;
	}
	
	//prog principal
	
	public static void main(String[] args) {
		
		int year=demanderAnnee();
		int days = datePaques(year);
		afficheDate(year,days);
		
	}

}

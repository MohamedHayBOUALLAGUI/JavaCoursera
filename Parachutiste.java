import java.util.Scanner;

class Parachutiste {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        double masse = 80.0;
        do {
            System.out.print("masse du parachutiste (>= 40) ? ");
            masse = clavier.nextDouble();
        } while (masse < 40.0);

        double h0 = 39000.0;
        do {
            System.out.print("hauteur de depart du parachutiste (>= 250) ? ");
            h0 = clavier.nextDouble();
        } while (h0 < 250.0);

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        final double g=9.81;
        double v0=0.0,t0=0.0;
        double vitesse,hauteur,accel,surface=2.0,t=t0;
        double s=surface/masse;
        double q;
        q=Math.exp((-s)*(t-t0));
        vitesse=(g/s)*(1-q)+v0*q;
        hauteur=h0-((g/s)*(t-t0))-(((v0-(g/s))/s)*(1-q));
        accel=g-(s*vitesse);
        System.out.printf("%.0f, %.4f, %.4f, %.5f\n",t, hauteur, vitesse, accel);

t=t+1;
int occ=0,acc=0,par=0;
        do {
               q=Math.exp((-s)*(t-t0));
               vitesse=(g/s)*(1-q)+v0*q;
               hauteur=h0-((g/s)*(t-t0))-(((v0-(g/s))/s)*(1-q));
               accel=g-(s*vitesse);
        	
               if(vitesse>343){
                   occ+=1;
                   if(occ==1){
                   System.out.println("## Felix depasse la vitesse du son");
                   }
               }
               if(accel<0.5){
                   acc+=1;
                   if(acc==1){
                     System.out.println("## Felix a atteint sa vitesse maximale");  
                   }
               }
               if(hauteur<2500){
                   par+=1;
                   if(par==1){
                       System.out.println("## Felix ouvre son parachute"); 
                       s=25.0/masse;
                       t0=t;
                       v0=vitesse;
                       h0=hauteur;
                       
                   }
                   
               }
               if(hauteur>0){
               System.out.printf("%.0f, %.4f, %.4f, %.5f\n",t, hauteur, vitesse, accel);
               }
               
               t++;
        }while(hauteur>0);

        
        
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        clavier.close();
    }
}
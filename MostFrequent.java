class MostFrequent {

    public static void main(String[] args) {
        int[] tab1 = {2, 7, 5, 6, 7, 1, 6, 2, 1, 7, 6};
        int taille = tab1.length;

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        int maxf=tab1[0],occ=1,occf=1,max=tab1[0];
        
        for (int i=0;i<taille;i++){
            occ=1;
            for (int j=i+1;j<taille;j++){
                
                if(tab1[i]==tab1[j]){
                    max=tab1[i];
                    occ+=1;
                    
                }
                
                }
                if(occ>occf){
                occf=occ;
                maxf=max;
                }
                
        
        
    }
    System.out.println("Le nombre le plus frequent dans le tableau est le :");
    System.out.println(maxf+ " ("+occf+" x)");


        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

    }
}
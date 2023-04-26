public class DNA {

    public static void proteina(String dna){
        dna.toUpperCase();
        int codoninicio =  dna.indexOf("ATG");
        int codonfinal = dna.indexOf("TGA");
        if(dna.length()%3==0&&codonfinal%3==0){
            if(codoninicio==0){
            System.out.println("sequencia de DNA completo  "+dna);
            }else{
            System.out.println("So proteina encontrada: "+dna);
            }
            
        }
        else{
            System.out.println("nao completo dna: "+dna);
        }

    
  
    }
    public static void main(String[]args){
        //A - Adenina
        //C - Citosina
        //G - Guanina
        //T - Timina
        
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";
    //codon inicio "ATG"
    //codon parada "TGA"
    //proteina tem que ser divisivel por 3
    //substring 
    //indexOf("ATG");A
    //indexOf("TGA");A length -3 = T
    // comparar usando && 
        proteina(dna1);
        proteina(dna2);
        proteina(dna3);
    }
}

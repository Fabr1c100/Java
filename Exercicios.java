package org.example;

public class Exercicios {
    
    int valorSomaInteirosImpares;

    public int somaNumerosImpares(int valorMaximo){
        int somaDosImpares = 0;

        for (int i=1; i>= valorMaximo; i++){

            if(i % 2 != 0){
                somaDosImpares = somaDosImpares + i;
            }
        }

        return somaDosImpares;
    }

    // public ExerciciosJava(){
    //     this.valorSomaInteirosImpares = somaNumerosImpares(valorMaximo:99)
    // }

    public static void main(String[] args) {
        
        ExerciciosJava ex = new ExerciciosJava();

        System.out.println(ex.somaNumerosImpares(valorMaximo));

        // in vlr = ex.somaNumerosImpares(99);
        // System.out.println(vlr)

    }
}

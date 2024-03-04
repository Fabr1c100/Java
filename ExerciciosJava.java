public class ExerciciosJava {

    public static void main(String[] args) {
        // 1a) 
        System.out.println("1a)");

        int soma = 0;
        for (int i = 1; i <= 99; i += 2) {
            soma += i;
        }
        System.out.println("Soma dos ímpares de 1 a 99: " + soma);
        System.out.println(' ');

        // 1b)
        System.out.println("b)");

        int i = 1;
        while (i <= 20) {
            System.out.print(i + " ");
            if (i % 5 == 0) {
                System.out.println();
            }
            i++;
        }
        System.out.println(' ');

        // 1c)
        System.out.println("c)");

        for (i = 1; i <= 20; i++) {
            System.out.print(i + " ");
            if (i % 5 == 0) {
                System.out.println();
            }
        }

        //2a) erro no ";" que deveria ser "{}"

        System.out.println("2a)");
        i = 1;
        while (i <= 10){
            i++;
        }
        System.out.println(" ");

        //b) k precisa ser declarado como double
        System.out.println("b)");
        
        double k;
        for (k = 0.1; k < 0.2; k += 0.1) {
            System.out.println(k);
        }
        System.out.println(" ");

        //c) falta o "break no primeiro case"
        // falta declarar 'n'
        System.out.println("c)");

        char n = 1;
        switch (n) {
            case 1:
                System.out.println("The number is 1");
                break;
            case 2:
                System.out.println("The number is 1");
                break;
            default:
                System.out.println("the number is 1 or 2");
                break;
        }
        System.out.println(" ");

        // d) é necessário uso de {}
        System.out.println("d)");

        n = 1;

        while (n <  10){
            System.out.println(n++);
        }
        System.out.println(" ");

        // // a) é necessário uso de ; e {}
        // System.out.println("a)");

        // for(i = 100; i>=1; i++){
        //     System.out.println(i);
        // }

        // System.out.println(" ");


        // b) é necessário mudar a regra final para subtrair 2
        System.out.println("b)");
            
            for (i = 19; i>=1;i-=2){
                System.out.println(i);
            }

        System.out.println(" ");

        // c) necessário declarar counter como int
        System.out.println("c)");

            int counter = 2;

            do{
                System.out.println(counter);
                counter += 2;
            } while (counter < 100);

        System.out.println(" ");

        // Expressões lógicas 
        System.out.println("Expressões lógicas");

            i = 1;
            int j = 2;
            k = 3;
            int m = 2;

            System.out.println(i == 1);
            System.out.println(j == 3);
            System.out.println((i >= 1) && (j < 4));
            System.out.println((m <= 99) & (k < m));
            System.out.println((j >= i) || (k == m));
            System.out.println(( k + m < j) | (3 - j >=k));
            System.out.println(!(k > m));

        System.out.println(" ");

         // Operções Matemáticas
        System.out.println("Operções Matemáticas");
        System.out.println("a)");

        int produto = 1;
        for (int numero = 1; numero < 15; numero += 2) {
            produto *= numero;
        }

        System.out.println(produto);

        System.out.println(" ");

        System.out.println("b)");

        
        long fatorial = 1;
        for (int a = 1; a <= 20; a++) {
            fatorial *= a;
        }
        System.out.println(fatorial);

        System.out.println(" ");

        System.out.println("c)");

        System.out.println("o tipo long não é o suficiente para armazenar o fatorial de 100");

        System.out.println(" ");

        System.out.println("Impressões em Loop");

        System.out.println("a)");

        int linhas = 9; // Número de linhas da pirâmide

        for (int e = 1; e <= linhas; e++) {
            for (int f = 1; f <= 2 * e - 1; f++) {
                System.out.print("*");
            }
            System.out.println();
        }
    

        System.out.println(" ");


        System.out.println("b)");

        int linhasNovo = 9; // Número de linhas da pirâmide

        for (int g = linhasNovo; g >= 1; g--) {
            for (int h = 1; h <= 2 * g - 1; h++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println(" ");

    }

}

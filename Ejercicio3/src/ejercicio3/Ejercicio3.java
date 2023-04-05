package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        /* Guillermo tiene N dolares. Luis tiene la mitad de lo que posee Guillermo.
        Juan tiene la mitad de lo que tiene Luis u Guillermo juntos. Hacer un programa
        que calcule e imprima la cantidad de dinero que tienen entre los tres.*/
        
        Scanner entrada = new Scanner(System.in);
        float G, L, J, total;
        
        System.out.println("Digite cuanto dinero tiene G:");
        G = entrada.nextFloat();
        
        L = G/2;    //luis tiene la mita de lo Guillermo.
        J = (G+L)/2;
        total = G+L+J;
        System.out.println("La cantidad de dinero entre los 3 es: "+total);
        
        
    }

}

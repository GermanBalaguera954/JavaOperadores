package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        //Hacer un programa que calcule e imprima la suma de tres calificaciones
        Scanner entrada = new Scanner(System.in);
        float cal1, cal2, cal3, suma;
                
        System.out.println("Digite 3 calificaciones:");
            
        // Guardamos la tres calificaciones.
        cal1 = entrada.nextFloat();
        cal2 = entrada.nextFloat();
        cal3 = entrada.nextFloat();
        
        suma = cal1 + cal2 + cal3;
        
        System.out.println("\nEl total de las notas es:"+suma);
         
    }

}

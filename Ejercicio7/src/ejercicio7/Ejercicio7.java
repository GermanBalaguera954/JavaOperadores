
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        /*Construir un programa que, dado un numero total de horas, devuelve el numero de semanas, dias
        y horas equivalentes. Por ejemplo dado un total de 1000 horas debe de mostrar 5 semanas
        6 dias y 16 horas*/
        
        Scanner entrada = new Scanner(System.in);
        int totalHoras,semanas, dias, horas;
        
        System.out.println("Digite el numero de horas: ");
        totalHoras = entrada.nextInt();
        
        semanas = totalHoras / 168;
        dias = totalHoras % 168 / 24;
        horas = totalHoras % 24;
        
        System.out.println("\nEl equivalente es: ");
        System.out.println("Semanas: "+semanas);
        System.out.println("Dias: "+dias);
        System.out.println("Horas: "+horas);
    }
    
}

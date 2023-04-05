package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        /*La calificación final de un estudiante de Informática se calcula con base a las
        calificaciones de cuatro aspectos de su rendimiento académico: participación, primer
        examen parcial, segundo examen parcial y examen final.Sabiendo que las calificaciones
        anteriores entran a la calificación final con ponderaciones del 10%, 25%, 25% y 40%,
        Hacer un programa que calcule e imprima la calificación final obtenida por un estudiante.*/
        
        Scanner entrada = new Scanner(System.in);
        float n1,n2,n3,n4,nFinal;
        
        System.out.println("Digite la 4 notas:\n");
        n1 = entrada.nextFloat();
        n2 = entrada.nextFloat();
        n3 = entrada.nextFloat();
        n4 = entrada.nextFloat();
        
        nFinal = (float) ((n1*0.1)+(n2*0.25)+(n3*0.25)+(n4*0.4));
        
        System.out.println("\nLa calificacion obtenida es:"+nFinal);
        
    }

}

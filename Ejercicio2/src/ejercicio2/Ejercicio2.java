package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        /*Hacer un programa que calcule e imprima el salario semanal de un empleado
        a partir de sus horas semanales trabajadas y de su salario por hora*/
        
        Scanner entrada = new Scanner(System.in);
        int horasSemana;
        float salarioHora, salarioTotal;
        
        System.out.println("Digite la horas semanales trabajadas: ");
        horasSemana = entrada.nextInt();
        System.out.println("Digite el salario que gana por hora");
        salarioHora = entrada.nextFloat();
        
        salarioTotal = salarioHora * horasSemana;
        System.out.println("El salario total es: "+salarioTotal);
        
        
        

    }

}

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        /*Una compañia de venta de carros usados paga a su personal de ventas un salario
        de $1000 mensuales, mas una comision de $150 por cada carro vendido, mas el 5% del valor
        de la venta por carro.Cada mes el capturista  de la empresa ingresa en la computadora
        los datos pertinentes. Hacer un programa que calcule e imprima el salario mensual de un
        vendedor dado*/
        
        Scanner entrada = new Scanner(System.in);
        final int salario = 1000;
        int nCarrosVendidos;
        float costoCarro, salarioTotal;

        System.out.println("Digite numero de carros vendidos: ");
        nCarrosVendidos = entrada.nextInt();
        System.out.println("Digite el costo del carro: ");
        costoCarro = entrada.nextFloat();

        salarioTotal = salario + (nCarrosVendidos * 150) + (0.05f * costoCarro * nCarrosVendidos);
        System.out.println("El salario total del empleado es: " + salarioTotal);

    }

}

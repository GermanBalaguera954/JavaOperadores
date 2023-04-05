
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        /*Construir un programa que calcule y muestre por pantalla la raices de la ecuacion de segundo 
        grado de coeficientes reales*/
        
        Scanner entrada = new Scanner(System.in);
        double a,b,c, resultado1, resultado2;
        
        System.out.println("Digite el valor de a: ");
        a = entrada.nextDouble();
        System.out.println("Digite el valor de b: ");
        b = entrada.nextDouble();
        System.out.println("Digite el valor de c: ");
        c = entrada.nextDouble();
        
        resultado1 = (-b+Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
        resultado2 = (-b-Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
        
        System.out.println("\nLa raiz numero uno es: "+resultado1);
        System.out.println("\nLa raiz numero dos es: "+resultado2);
        
    }
    
}

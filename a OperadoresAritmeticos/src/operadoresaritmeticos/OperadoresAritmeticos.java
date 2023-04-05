package operadoresaritmeticos;

import java.util.Scanner;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numero1, numero2, suma, resta, mult, div,resto;
        
        System.out.println("Digite 2 numeros:");
        numero1 = entrada.nextFloat();
        numero2 = entrada.nextFloat();
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        mult = numero1 * numero2;
        div = numero1 / numero2;
        resto = numero1 % numero2;
        
        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El resultado de la resta es: "+resta);
        System.out.println("El resultado de la multiplicación es: "+mult);
        System.out.println("El resultado de la división es: "+div);
        System.out.println("El resultado de la residuo es: "+resto);
        
        
        

    }

}

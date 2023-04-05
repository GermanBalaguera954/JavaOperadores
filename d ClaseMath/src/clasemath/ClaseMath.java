package clasemath;

public class ClaseMath {

    public static void main(String[] args) {
        // Math sqrt para hallar la raiz de un numero
        double raiz = Math.sqrt(99.23);
        System.out.println(raiz);

        // Math pow eleva un numero a su exponente
        double base = 4, exponente = 3;
        double resultado = Math.pow(base, exponente);
        System.out.println(resultado);

        // Math round redondea un numero
        float numero = 4.56f;
        int resulta = Math.round(numero);
        System.out.println(resulta);

        // Math rando muestra un numero al azar
        double num = Math.random();
        System.out.println(num);

    }
}

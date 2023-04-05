package incrementodecremento;

public class IncrementoDecremento {

    public static void main(String[] args) {
        int x = 5;
        x++;//Incremento
        System.out.println(x);

        int y = 5;
        y--;//Decremento
        System.out.println(y);
        
        int w = 4, z;
        z = ++w;
        z = --w;
        System.out.println(z);
        System.out.println(w);
    }

}

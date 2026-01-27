import java.util.Scanner;

class Laptop {
    int precio;
    int calidad;

    public Laptop(int precio, int calidad) {
        this.precio = precio;
        this.calidad = calidad;
    }
}

public class C456A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int calidad, precio;
        Laptop[] laptops = new Laptop[n];

        for (int i = 0; i < n; i++) {
            precio = sc.nextInt();
            calidad = sc.nextInt();
            laptops[i] = new Laptop(precio, calidad);
        }
        bubbleSort(laptops);

        //Alex piensa que hay dos laptops, de modo que el precio de la primera es menor
        //  (estrictamente menor) que el de la segunda, 
        // pero la calidad de esta es mayor (estrictamente mayor).

        boolean alexIsHappy = false;
        for (int i = 0; i < laptops.length - 1; i++) {
            System.out.println(laptops[i].precio + " **** " + laptops[i + 1].precio);
            if (laptops[i].precio < laptops[i + 1].precio
                && laptops[i].calidad > laptops[i + 1].calidad
            ) {
                System.out.println("Happy Alex");
                alexIsHappy = true;
                break;
            }
        }

        if (alexIsHappy == false) {
            System.out.println("Poor Alex");
        }

    }

    public static void bubbleSort(Laptop[] laptops){
        int limite = laptops.length;
        for (int i = limite; i >=1; i--) {
            for (int j = 0; j < i - 1; j++) {

                if (laptops[j].precio > laptops[j + 1].precio) {
                    //swap
                    Laptop aux = laptops[j];
                    laptops[j] = laptops[j + 1];
                    laptops[j + 1] = aux;
                }
            }
        }
    }

}


/*

4
1 2
2 4
4 6
5 7

*/
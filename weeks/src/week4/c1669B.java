import java.util.Scanner;

public class c1669B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        System.out.println(t);
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int vec[] = new int[n];
            int acumulada[] = new int[n + 1];
             boolean esRespuesta = false;
            int respuesta = -1;
            for (int j = 0; j < n; j++) {
                vec[j] = sc.nextInt(); //se lee
                acumulada[vec[j]]++; //Se contabiliza los elementos
                if (acumulada[vec[j]] >= 3) { //Si es mayor a 3 termina el conteo
                    esRespuesta = true;
                    respuesta = vec[j];
                    break; //SAlimos del ciclo
                }
            }
            System.out.println("***************");

           
            for (int j = 0; j < n; j++) {
                if (acumulada[j] != 0) {
                    System.out.print(" " + acumulada[j] + " ");
                }
            }
            System.out.println();
            System.out.println("ddddddddddddd");
            if (esRespuesta) {
                System.out.println(respuesta);
            } else {
                System.out.println(-1);
            }
        }
    } 

}

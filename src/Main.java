import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[][] asientos = new char[10][10];
        boolean bandera = false;
        Scanner teclado = new Scanner(System.in);
        int fila, asiento;

        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 10; c++) {
                asientos[f][c] = 'L';
            }
        }

        System.out.println("----------BIENVENIDO AL SISTEMA DE RESERVAS---------");

        while (bandera != true) {
            System.out.println("Ingrese Fila y Asiento a reservar");
            System.out.print("Fila (entre 0 y 9): ");
            fila = teclado.nextInt();
            System.out.print("Asiento (entre 0 y 9): ");
            asiento = teclado.nextInt();
        }
    }
}
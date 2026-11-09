package EjercicioJava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Es perro o gato?");
        String tipo = sc.nextLine().toLowerCase();
        System.out.println("¿Como quieres que se llame?");
        String nombre = sc.nextLine();

        Mascota mascota = new Mascota(nombre, tipo);

        mostrarMenu();

        boolean salir = false;
        boolean muerta = false;

        while (!salir && !muerta) {
            System.out.println("Escoge acción (escribe el número de la acción)");
            int accion = sc.nextInt();
            sc.nextLine();

            //las acciones de la mascota :v
            if (accion == 1) {
                mascota.dormir();
            } else if (accion == 2) {
                mascota.jugar();
            } else if (accion == 3) {
                mascota.comer();
            } else if (accion == 4) {
                mascota.duchar();
            } else if (accion == 5) {
                System.out.println("¿Cuántos golpes?");
                int golpes = sc.nextInt();
                sc.nextLine();
                mascota.atacar(golpes);
            } else if (accion == 6) {
                salir = true;
            } else {
                System.out.println("Esa no es una acción válida");
            }

            mascota.mostrarAtributos();
            // para saber si se ha muerto o no
            if (mascota.muerto()) {
                muerta = true;
            }
        }

        if (muerta) {
            System.out.println("Se ha muerto la mascota");
        }
        System.out.println("FIN");
    }

    static void mostrarMenu() {
        System.out.println("1. Dormir");
        System.out.println("2. Jugar");
        System.out.println("3. Comer");
        System.out.println("4. Duchar");
        System.out.println("5. Atacar");
        System.out.println("6. Salir de la aplicación");
    }
}
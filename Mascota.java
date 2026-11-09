package EjercicioJava;
import java.util.Random;

public class Mascota {
    //atributos
    public String nombre;
    public String tipo;
    public int energia;
    public int higiene;
    public int peso;
    public int animo;

    //constructores

    public Mascota(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        Random random = new Random();
        this.energia = 40 + random.nextInt(21);
        this.higiene = 40 + random.nextInt(21);
        this.peso = 40 + random.nextInt(21);
        this.animo = 40 + random.nextInt(21);
    }

    //metodos
    public void dormir() {
        if (tipo.equals(("perro"))) {
            energia += 25;
        } else{
            energia += 20;
        }
        animo += 10;
    }

    public void jugar() {
            energia -= 20;
            animo += 20;
            peso -= 10;
    }

    public void comer() {
        energia += 10;
        higiene -= 15;
        peso += 10;
    }

    public void duchar() {
        if (tipo.equals(("perro"))) {
            energia -= 10;
            animo -= 15;
        } else{
            energia -= 5;
            animo += 5;
        }
        higiene += 25;
    }

    public void atacar(int golpes) {
        for (int contador = 0; contador < golpes; contador++) {
            energia += 3;
            higiene += 3;
            animo += 3;
        }
    }

    public boolean muerto() {
        return energia < 0 || energia > 100
                || higiene < 0 || higiene > 100
                || peso < 0 || peso > 100
                || animo < 0 || animo > 100;
    }

    public void mostrarAtributos() {
        System.out.println("--- " + nombre + " (" + tipo + ") ---");
        System.out.println("Energía: " + energia);
        System.out.println("Higiene: " + higiene);
        System.out.println("Peso: " + peso);
        System.out.println("Ánimo: " + animo);
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mascota m = new Mascota("Luna", "Perro", 3, 8.5, true);



        System.out.println(">> Crear Mascota:");
        m.mostrarFicha();

        int opcion = 0;

        List<Mascota> lstNombre = new ArrayList<>();
        int op;
        do{
            System.out.println("selecciona una opción");
            op = sc.nextInt();
            System.out.println("1. crear la mascota");
            System.out.println("2. mostrar la lista");
            System.out.println("3. salir");

            switch (op){
                case 1:
                    System.out.println("1, crear la mascota");
                    String Mascota = sc.next();

                    System.out.println("ingrese la especie de la mascota");
                    String especie = sc.next();


                    System.out.println("ingrese el nombre de la mascota");
                    String nombre = sc.next();

                    System.out.println("ingrese el peso de la mascota");
                    Double peso = sc.nextDouble();

                    System.out.println("ingrese la edad de la mascota");
                    int edad = sc.nextInt();
                    break;

                case 2:
                    System.out.println("2. Mostrar la ficha");
                    for (Mascota p: lstNombre){
                        System.out.println(p);
                    }
                    break;
                case 3:
                    System.out.println("3. salir");


            }
        } while (op != 3);

        do {

            System.out.println("====== MENÚ ======");
            System.out.println("1. Modificar edad");
            System.out.println("2. Modificar peso");
            System.out.println("3. Enfermar");
            System.out.println("4. Curar");
            System.out.println("5. Salir");
            System.out.println("==================");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(">> ANTES:");
                    m.mostrarFicha();
                    System.out.print("¿Cuántos años quieres sumar? (negativo para restar): ");
                    int anios = sc.nextInt();
                    if (anios > 0) {
                        for (int i = 0; i < anios; i++) {
                            m.cumplirAnios();
                        }
                    } else if (anios < 0) {
                        m.setEdad(m.getEdad() + anios);
                    }
                    System.out.println(">> DESPUÉS:");
                    m.mostrarFicha();
                    break;

                case 2:
                    System.out.println(">> ANTES:");
                    m.mostrarFicha();
                    System.out.print("¿Cuántos kg quieres sumar? (negativo para restar): ");
                    double kilos = sc.nextDouble();
                    if (kilos > 0) {
                        for (int i = 0; i < kilos; i++) {
                            m.engordar();
                        }
                    } else if (kilos < 0) {
                        m.setPeso(m.getPeso() + kilos);
                    }
                    System.out.println(">> DESPUÉS:");
                    m.mostrarFicha();
                    break;

                case 3:
                    System.out.println(">> ANTES:");
                    m.mostrarFicha();
                    m.enfermar();
                    System.out.println(">> DESPUÉS:");
                    m.mostrarFicha();
                    break;

                case 4:
                    System.out.println(">> ANTES:");
                    m.mostrarFicha();
                    m.recuperarSalud();
                    System.out.println(">> DESPUÉS:");
                    m.mostrarFicha();
                    break;

                case 5:
                    System.out.println("chao uwu");
                    break;

                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 5);

        sc.close();




    }
}
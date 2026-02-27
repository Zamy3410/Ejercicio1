import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int opcion = 0;

        List<Mascota> lstNombre = new ArrayList<>();
        int op;
        do{
            System.out.println("selecciona una opción");
            op = sc.nextInt();
            System.out.println("1. crear la mascota");
            System.out.println("2. mostrar la lista");
            System.out.println("3. buscar datos");
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
                    String nombre1;
                    System.out.println("3. buscar por nombre a modificar");
                    nombre1 = sc.next();

                    if (lstNombre.isEmpty()){
                        System.out.println("la lista no tiene elementos");
                    }

                    Mascota masc1 = null;

                    for (Mascota p: lstNombre){
                        if (p.getNombre().equalsIgnoreCase(nombre1)) {
                            System.out.println(p);
                        }
                    }

                    do {

                        System.out.println("====== SUB-MENÚ ======");
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
                                masc1.mostrarFicha();
                                System.out.print("¿Cuántos años quieres sumar? (negativo para restar): ");
                                int anios = sc.nextInt();
                                if (anios > 0) {
                                    for (int i = 0; i < anios; i++) {
                                        masc1.cumplirAnios();
                                    }
                                } else if (anios < 0) {
                                    masc1.setEdad(masc1.getEdad() + anios);
                                }
                                System.out.println(">> DESPUÉS:");
                                masc1.mostrarFicha();
                                break;

                            case 2:
                                System.out.println(">> ANTES:");
                                masc1.mostrarFicha();
                                System.out.print("¿Cuántos kg quieres sumar? (negativo para restar): ");
                                double kilos = sc.nextDouble();
                                if (kilos > 0) {
                                    for (int i = 0; i < kilos; i++) {
                                        masc1.engordar();
                                    }
                                } else if (kilos < 0) {
                                    masc1.setPeso(masc1.getPeso() + kilos);
                                }
                                System.out.println(">> DESPUÉS:");
                                masc1.mostrarFicha();
                                break;

                            case 3:
                                System.out.println(">> ANTES:");
                                masc1.mostrarFicha();
                                masc1.enfermar();
                                System.out.println(">> DESPUÉS:");
                                masc1.mostrarFicha();
                                break;

                            case 4:
                                System.out.println(">> ANTES:");
                                masc1.mostrarFicha();
                                masc1.recuperarSalud();
                                System.out.println(">> DESPUÉS:");
                                masc1.mostrarFicha();
                                break;

                            case 5:
                                System.out.println("chao uwu");
                                break;

                            default:
                                System.out.println("Opción inválida");
                        }
                    } while (opcion != 5);




            }
        } while (op != 4);

        sc.close();


    }
}
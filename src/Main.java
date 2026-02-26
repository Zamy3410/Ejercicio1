import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mascota m = new Mascota("Luna", "Perro", 3, 8.5, true);

        System.out.println(">> DATOS DE LUNA:");
        m.mostrarFicha();

        int opcion = 0;

        while (opcion != 5) {

            System.out.println("\n====== MENÚ ======");
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
                    System.out.println("\n>> ANTES:");
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
                    System.out.println("\n>> DESPUÉS:");
                    m.mostrarFicha();
                    break;

                case 2:
                    System.out.println("\n>> ANTES:");
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
                    System.out.println("\n>> DESPUÉS:");
                    m.mostrarFicha();
                    break;

                case 3:
                    System.out.println("\n>> ANTES:");
                    m.mostrarFicha();
                    m.enfermar();
                    System.out.println("\n>> DESPUÉS:");
                    m.mostrarFicha();
                    break;

                case 4:
                    System.out.println("\n>> ANTES:");
                    m.mostrarFicha();
                    m.recuperarSalud();
                    System.out.println("\n>> DESPUÉS:");
                    m.mostrarFicha();
                    break;

                case 5:
                    System.out.println("chao uwu");
                    break;

                default:
                    System.out.println("Opción inválida");
            }
        }

        sc.close();




    }
}
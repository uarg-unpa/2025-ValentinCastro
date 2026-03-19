package Minas;
import java.time.LocalDate;
import java.util.Scanner;

public class TestMina {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Mineria direccion = new Mineria (100);

        int opcion;

        do {
            System.out.println("\n===== DIRECCIÓN DE MINERÍA =====");
            System.out.println("1. Agregar mina");
            System.out.println("2. Mostrar minas activas");
            System.out.println("3. Buscar minas por propietario");
            System.out.println("4. Minas con extracción <= 30%");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println("\n--- Nueva Mina ---");

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Propietario: ");
                    String propietario = sc.nextLine();

                    System.out.print("Mineral: ");
                    String mineral = sc.nextLine();

                    System.out.print("Reservas (toneladas): ");
                    double reservas = sc.nextDouble();

                    System.out.print("Cantidad extraída (toneladas): ");
                    double extraida = sc.nextDouble();

                    System.out.print("Área de excavación (km2): ");
                    double area = sc.nextDouble();

                    System.out.print("Cantidad de pozos: ");
                    int pozos = sc.nextInt();

                    System.out.print("Vida esperada (años): ");
                    int vida = sc.nextInt();

                    System.out.print("Latitud: ");
                    double lat = sc.nextDouble();

                    System.out.print("Longitud: ");
                    double lon = sc.nextDouble();

                    System.out.print("¿Está activa? (true/false): ");
                    boolean activa = sc.nextBoolean();
                    sc.nextLine();

                    LocalDate fechaApertura = LocalDate.now();
                    LocalDate fechaCierre = null;

                    Mina mina = new Mina(nombre, propietario, mineral,
                            reservas, extraida,
                            fechaApertura, fechaCierre,
                            activa, area, pozos, vida,
                            lat, lon);

                    direccion.addMinas(mina);
                    break;

                case 2:
                    System.out.println("\n--- Minas Activas ---");
                    Mina[] activas = direccion.minasActivas();
                    for (Mina m : activas) {
                        System.out.println("- " + m);
                    }
                    break;

                case 3:
                    System.out.print("\nIngrese propietario: ");
                    String prop = sc.nextLine();

                    Mina[] porProp = direccion.minaPorPropietario(prop);

                    for (Mina m : porProp) {
                        System.out.println("• " + m);
                    }
                    break;

                case 4:
                    System.out.println("\n--- Minas con extracción <= 30% ---");

                    Mina[] bajas = direccion.minasBajaExtraccion();

                    for (Mina m : bajas) {
                        System.out.println("• " + m);
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}

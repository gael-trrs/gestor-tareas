import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Tarea> listaTareas = new ArrayList<>();
    private static int contadorId = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        System.out.println("--- GESTOR DE TAREAS ---");

        while (!salir) {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Registrar nueva tarea");
            System.out.println("2. Listar tareas");
            System.out.println("3. Completar tarea");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            try {
                // Leemos como String y convertimos a número para evitar bugs con el Scanner
                int opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1:
                        registrarTarea(scanner);
                        break;
                    case 2:
                        listarTareas();
                        break;
                    case 3:
                        completarTarea(scanner);
                        break;
                    case 4:
                        salir = true;
                        System.out.println("Saliendo del gestor...");
                        break;
                    default:
                        System.out.println("Error: Opción no válida. Ingresa un número del 1 al 4.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor ingresa un número válido, no letras.");
            } catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: " + e.getMessage());
            }
        }
        scanner.close();
    }

    private static void registrarTarea(Scanner scanner) {
        System.out.print("Ingresa la descripción de la tarea: ");
        String descripcion = scanner.nextLine();

        if (descripcion.trim().isEmpty()) {
            System.out.println("La descripción no puede estar vacía.");
            return;
        }

        Tarea nuevaTarea = new Tarea(contadorId, descripcion);
        listaTareas.add(nuevaTarea);
        contadorId++;
        System.out.println("¡Tarea registrada con éxito!");
    }

    private static void listarTareas() {
        if (listaTareas.isEmpty()) {
            System.out.println("No hay tareas registradas en este momento.");
            return;
        }

        System.out.println("\n--- Lista de Tareas ---");
        for (Tarea tarea : listaTareas) {
            System.out.println(tarea.toString());
        }
    }

    private static void completarTarea(Scanner scanner) {
        listarTareas();

        if (listaTareas.isEmpty()) {
            return;
        }

        System.out.print("\nIngresa el ID (número) de la tarea que deseas completar: ");
        try {
            int id = Integer.parseInt(scanner.nextLine());
            boolean encontrada = false;

            for (Tarea tarea : listaTareas) {
                if (tarea.getId() == id) {
                    if (tarea.isCompletada()) {
                        System.out.println("Esta tarea ya estaba completada.");
                    } else {
                        tarea.marcarComoCompletada();
                        System.out.println("¡Tarea marcada como completada!");
                    }
                    encontrada = true;
                    break;
                }
            }

            if (!encontrada) {
                System.out.println("Error: No se encontró ninguna tarea con ese ID.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Debes ingresar el número de ID válido.");
        }
    }
}
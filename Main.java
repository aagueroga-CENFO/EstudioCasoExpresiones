import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PilaTokens pila = new PilaTokens();
        int opcion = 0;

        System.out.println("==================================================");
        System.out.println("   ANALIZADOR DE EXPRESIONES ARITMÉTICAS (PILA)   ");
        System.out.println("==================================================");


        while (opcion != 5) {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Ingresar token a la pila (PUSH)");
            System.out.println("2. Extraer token de la pila (POP)");
            System.out.println("3. Ver token en el tope (PEEK)");
            System.out.println("4. Mostrar estado completo de la pila");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");


            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor ingrese un número válido.");
                continue;
            }


            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor del token (ej. '5', '+', '('): ");
                    String valor = scanner.nextLine();

                    System.out.println("Seleccione el tipo de token:");
                    System.out.println("1. Número | 2. Operador | 3. Paréntesis");
                    System.out.print("Tipo: ");
                    int tipo;
                    try {
                        tipo = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Tipo inválido. Se asignará tipo 0 por defecto.");
                        tipo = 0;
                    }

                    pila.push(valor, tipo);
                    System.out.println("Token [" + valor + "] agregado a la pila con éxito.");
                    break;

                case 2:
                    NodoToken extraido = pila.pop();
                    if (extraido != null) {
                        System.out.println("Se extrajo el token: " + extraido.getValor());
                    }
                    break;

                case 3:
                    NodoToken tope = pila.peek();
                    if (tope != null) {
                        System.out.println("El token en el tope es: " + tope.getValor());
                    }
                    break;

                case 4:
                    pila.mostrarPila();
                    break;

                case 5:
                    System.out.println("Saliendo del programa. ¡Éxitos en tu estudio de caso!");
                    break;

                default:
                    System.out.println("Opción no válida. Intente seleccionando un número del 1 al 5.");
            }
        }


        scanner.close();
    }
}

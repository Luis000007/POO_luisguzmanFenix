public class Main {
    public static void main(String[] args) {
        Matriz matriz = crearMatriz();
        CalculadoraMatriz.contarParesImparesFilas(matriz);
        CalculadoraMatriz.contarParesImparesColumnas(matriz);
        int suma = CalculadoraMatriz.calcularSuma(matriz);
        System.out.println("La suma de todos los números en la matriz es: " + suma);
    }

    public static Matriz crearMatriz() {
        int filas, columnas;
        do {
            filas = pedirEntero("Ingrese el número de filas: ");
            columnas = pedirEntero("Ingrese el número de columnas: ");
            if (filas != columnas) {
                System.out.println("El número de filas y columnas debe ser igual. Por favor, ingrese nuevamente.");
            }
        } while (filas != columnas);

        return new Matriz(filas, columnas);
    }

    public static int pedirEntero(String mensaje) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print(mensaje);
        return scanner.nextInt();
    }
}
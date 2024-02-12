public class CalculadoraMatriz {
    public static void contarParesImparesFilas(Matriz matriz) {
        System.out.println("Conteo de números pares e impares por filas:");
        for (int i = 0; i < matriz.getFilas(); i++) {
            int pares = 0;
            int impares = 0;
            for (int j = 0; j < matriz.getColumnas(); j++) {
                if (matriz.getMatriz()[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
            System.out.println("Fila " + (i + 1) + ": Pares = " + pares + ", Impares = " + impares);
        }
    }

    public static void contarParesImparesColumnas(Matriz matriz) {
        System.out.println("Conteo de números pares e impares por columnas:");
        for (int j = 0; j < matriz.getColumnas(); j++) {
            int pares = 0;
            int impares = 0;
            for (int i = 0; i < matriz.getFilas(); i++) {
                if (matriz.getMatriz()[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
            System.out.println("Columna " + (j + 1) + ": Pares = " + pares + ", Impares = " + impares);
        }
    }

    public static int calcularSuma(Matriz matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.getFilas(); i++) {
            for (int j = 0; j < matriz.getColumnas(); j++) {
                suma += matriz.getMatriz()[i][j];
            }
        }
        return suma;
    }
}
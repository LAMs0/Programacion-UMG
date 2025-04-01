
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.progra1.programacion.ejercicios;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class    Formulas {
    public static int palindromo;
    public static String palabraNormal;
    public static int ecuacuionCuadratica;
    /**
     * Ejercicio: Formula Cuadratica
     * Resuelva una formula cuadratica
     * Calcular las racies reales utilizando formula cuadratica
     * Consideraciones
     *  Dos soluciones reales si el discrimiantes es = b2 - 4ac es positivo
     *  Sin soluciones reales si el discriminantre es menor a cero
     *  Validar los parametros recibidos
     */

    public static void ecuacionCuadratica (double a,double b,double c) {
        double discriminante = Math.pow(b, 2) - 4 * a * c;
        System.out.println("Ecuacion: " + a + "x2 + " + b + "x + " + c + " = 0");
        System.out.println("Descrimiante = " + discriminante);

        if (discriminante > 0 ){
            double x1 = (-b + Math.sqrt(discriminante))/ (2 * a);
            double x2 = (-b - Math.sqrt(discriminante))/ (2 * a);
            System.out.println("Soluciones Reales: ");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            System.out.println("Solucion unica (raiz doble): ");
            System.out.println("x = " + x);
        }else {
            System.out.println("No hay soluciones relaes (discriminante < 0). ");
            System.out.println("Soluciones complejas: ");
            double parteReal = -b / (2 * a);
            double parteImaginaria = Math.sqrt(-discriminante) / (2 * a);
            System.out.println("x1 = " + parteReal + " + " + parteImaginaria + " i ");
            System.out.println("x2 = " + parteReal + " - " + parteImaginaria + " i ");
        }

    }






    /**
     * Ejercicio: Numero palindrome
     * Metodo que verifique si un numero es palindromo: Se lee igual de izquierda a derecha y de derecha a izquierda
     *
     * @return
     */

    public static boolean palindromo(int numero){
        String numeroPalindromo = Integer.toString(numero);
        String numeroInverso = new StringBuilder(numeroPalindromo).reverse().toString();
        return numeroPalindromo.equals(numeroInverso);
    }

    
    /**
     * Ejercicio: Palabra palindrome
     * Metodo que verifique si una palabra es palindromo: Se lee igual de izquierda a derecha y de derecha a izquierda
     */
    public static boolean palabraPalindrome(String palabra) {
        String normal = palabra.replaceAll("\\s+", "").toLowerCase();
        String invertida = new StringBuilder(normal).reverse().toString();
        return normal.equals(invertida);

    }
    
    /**
     * Ejercicio: Numero Vampiro con Colmillos
     * 
     * Un numero vampiro es un numero entero positivo que puede ser factorizado en dos numeros mas pequeños, llamados colmillos, de tal manera que:
     *  los colmillos no pueden terminar ambos en cero
     *  al multiplicar los colmillos el resultado debe ser el numero vampiro
     *  la contatenacion de los digitos colmillos en cualquier orden, debe coincidir con los digitos del numero vampiro
     * 
     * Ejemplo:
     *  el numero 1260 es un numero vampiro, porque:
     *  los digitos 21 y 60 juntos (2,1,6,0) pueden reorganizarse para formar el 1260
     *  sus colmillos son 21 y 60 porque 21 * 60 = 1260
     * 
     * El Programa debe encontrar y mostrar el primer numero vampiro dentro de un rango dado.
     */

    public static boolean validarColmillos(int numero, int[] colmillos) {
        // Verificar que ambos colmillos no terminen en cero
        if (colmillos[0] % 10 == 0 && colmillos[1] % 10 == 0) {
            return false;
        }

        // Verificar que la multiplicación sea igual al número
        if (colmillos[0] * colmillos[1] != numero) {
            return false;
        }

        // Verificar que los dígitos coincidan
        String numStr = Integer.toString(numero);
        String colmStr = Integer.toString(colmillos[0]) + Integer.toString(colmillos[1]);

        if (numStr.length() != colmStr.length()) {
            return false;
        }

        char[] numDigits = numStr.toCharArray();
        char[] colmDigits = colmStr.toCharArray();

        Arrays.sort(numDigits);
        Arrays.sort(colmDigits);

        return Arrays.equals(numDigits, colmDigits);
    }

    public static List<int[]> obtenerNumerosColmillos(int numero) {
        List<int[]> resultados = new ArrayList<>();
        String numStr = Integer.toString(numero);
        int length = numStr.length();

        // Solo números con cantidad par de dígitos pueden ser vampiros
        if (length % 2 != 0) {
            return resultados;
        }

        int mitadDigitos = length / 2;
        int limite = (int) Math.sqrt(numero);

        for (int i = (int) Math.pow(10, mitadDigitos - 1); i <= limite; i++) {
            if (numero % i == 0) {
                int j = numero / i;
                if (Integer.toString(j).length() == mitadDigitos) {
                    int[] colmillos = {i, j};
                    if (validarColmillos(numero, colmillos)) {
                        resultados.add(colmillos);
                    }
                }
            }
        }

        return resultados;
    }


}

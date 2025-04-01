/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package umg.edu.gt.progra1.programacion;

import umg.edu.gt.progra1.programacion.ejercicios.Formulas;

import java.util.Scanner;
import java.util.List;

/**
 *
 * @author wcord
 */
public class Programacion {

    public static void main(String[] args) {
        System.out.println("Hola bienvenidos a Progra 1");
        //testLoop();
        //palindromo();
        //palabraPalindrome();
        //ecuacionCuadratica();
        obtenerNumerosColmillos();


    }


    /*private static void palindromo() {
        Scanner numero1 = new Scanner(System.in);
        System.out.println("Ingrese un numero para verrificar si es palindromo: ");
        int numero = numero1.nextInt();

        System.out.println(numero + " Es palindromo? " + Formulas.palindromo(numero));
    }*/

    /*private static void palabraPalindrome(){
        Scanner palabra1 = new Scanner(System.in);
        System.out.println("Ingrese una palabra para verificar si es palindrome: ");
        String palabra = palabra1.nextLine();
        System.out.println(palabra + " Es una palabra palindrome? " + Formulas.palabraPalindrome(palabra));
    }*/

    /*private static void ecuacionCuadratica() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Resolución de ecuación cuadrática: ax² + bx + c = 0");
        System.out.print("Ingrese el coeficiente a (diferente de cero): ");
        double a = scanner.nextDouble();
        if (a == 0) {
            System.out.println("Error: 'a' no puede ser cero.");
            scanner.close();
            return;
        }

        System.out.print("Ingrese el coeficiente b: ");
        double b = scanner.nextDouble();
        System.out.print("Ingrese el coeficiente c: ");
        double c = scanner.nextDouble();

        Formulas.ecuacionCuadratica(a, b, c);


        scanner.close();
    }*/

    private static void obtenerNumerosColmillos(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Buscador de Números Vampiro");
        System.out.println("---------------------------");
        System.out.print("Ingrese el límite inferior del rango: ");
        int min = scanner.nextInt();
        System.out.print("Ingrese el límite superior del rango: ");
        int max = scanner.nextInt();

        System.out.println("\nBuscando números vampiro en el rango [" + min + ", " + max + "]...");

        boolean encontrado = false;
        for (int num = min; num <= max; num++) {
            List<int[]> paresColmillos = Formulas.obtenerNumerosColmillos(num);
            if (!paresColmillos.isEmpty()) {
                System.out.println("\n¡Número vampiro encontrado: " + num + "!");
                for (int[] colmillos : paresColmillos) {
                    System.out.println("Colmillos: " + colmillos[0] + " y " + colmillos[1]);
                    System.out.println("Comprobación:");
                    System.out.println(colmillos[0] + " × " + colmillos[1] + " = " + num);
                    System.out.println("Dígitos: " + colmillos[0] + colmillos[1] + " → " + num);
                }
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("\nNo se encontraron números vampiro en el rango especificado.");
        }

        scanner.close();
    }



    /*
    // IF ELSE
    public static void testTriangulo() {
        
        IfElseExample ifElseExamp = new IfElseExample();        
        ifElseExamp.validarTriangulo(5, 5, 5);        
        ifElseExamp.validarTriangulo(6, 6, 4);        
        ifElseExamp.validarTriangulo(3, 4, 5);
        ifElseExamp.validarTriangulo(2, 2, 5);
    }
    
    public static void testIfSimple() {
        // Istanciar clase como objeto
        // NombreClase nombreObjeto = new NombreClase();
        IfElseExample ifElseExamp = new IfElseExample();
        
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Ingrese un numero: ");
        int numero = scanner.nextInt();        
        ifElseExamp.example(numero);
        
        System.out.println("Ingrese un numero: ");
        numero = scanner.nextInt();        
        ifElseExamp.example(numero);
        
        System.out.println("Ingrese un numero: ");
        numero = scanner.nextInt();        
        ifElseExamp.example(numero);
        scanner.close();
    }
    
    // Switch
    public static void testSwitchSimple() {
        
        SwitchCaseExample switchExample = new SwitchCaseExample();
        String diaEnLetras = switchExample.getDiaSemana(4);
        System.out.println("El resultado es: " + diaEnLetras);
    }
    
    public static void testSwitchReducido() {
        SwitchCaseExample switchExample = new SwitchCaseExample();
        boolean esLaboral = switchExample.getDiasNoLaborales("Sabado");
        System.out.println("El dia es laboral: " + esLaboral);
    }
    
    public static void testLoop() {
        
        LoopExample test = new LoopExample();
        
        test.breakExample();
        test.continueExample();
        
    }
    */


}
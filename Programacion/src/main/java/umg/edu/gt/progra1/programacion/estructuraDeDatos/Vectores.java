/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.progra1.programacion.estructuraDeDatos;

/**
 *
 * @author wcord
 */
public class Vectores {
    
    // Vectores o arreglos
    // Son de tamaño fijo
    public void exampleArray() {
        
        // Sin inicializar        
        int[] numeros = new int[5];
        numeros[1] = 1;
        numeros[2] = 2;
        numeros[3] = 3;
        numeros[4] = 4;
        numeros[0] = 5;
        
        //int[] numeros = { 5, 1, 2, 3, 4};

        for(int num: numeros) {
             System.out.print(num + " ");
        }
        System.out.println(" ");
        // Inicializado
        String[] palabras = { "Walter", "Anibal", "Cordova", "Zeceña" };
        for(String palabra: palabras) {
             System.out.print(palabra + " ");
        }
        
    }
    
    // Arreglos bidimensionales
    // Matrices
    public static void matrizExample() {
        
        int[][] matriz = {
            { 1, 2, 3},
            { 4, 5, 6},
            { 7, 8, 9}
        };
        //int[][] matrices = {{ 1, 2, 3},{ 4, 5, 6},{ 7, 8, 9}};
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }            
        }

        
    }
    
}

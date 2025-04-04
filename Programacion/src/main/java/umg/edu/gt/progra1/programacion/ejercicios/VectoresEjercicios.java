/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.progra1.programacion.ejercicios;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author wcord
 */
public class VectoresEjercicios {

    /**
     * 📜 Descripción: Dado un vector de números enteros, encuentre la suma más pequeña y la suma más grande posibles al sumar (N-1) elementos del vector.
        🔹 Instrucciones:
        Leer un vector de N números enteros.
        Calcular la suma mínima excluyendo el número más grande.
        Calcular la suma máxima excluyendo el número más pequeño.
        Imprimir ambas sumas.
        * Ejemplo de entrada: [1, 3, 5, 7, 9]
        * Ejemplo de salida: 
          Suma mínima: 16  
          Suma máxima: 24  
     */

    public static int[] sumaDeVectores (int [] vector){
        if (vector.length == 0){
            return new int [] {0,0};
        }
        int min = vector[0];
        int max = vector[0];
        int sumaTotal = 0;

        for (int num : vector){
            sumaTotal += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }

        return new int[] {sumaTotal - max, sumaTotal - min};

    }

    
    /**
     * Reordenamiento de Números Pares e Impares
        📜 Descripción: Reordene un vector de enteros colocando primero los pares y luego los impares, manteniendo el orden relativo de aparición en cada grupo.
        🔹 Instrucciones:
        Leer un vector de N números enteros.
        Crear un nuevo vector donde los pares aparezcan primero y los impares después.
        No utilizar estructuras adicionales como listas o colecciones.
        * Ejemplo de entrada: [3, 1, 2, 4, 5, 6]
        * Ejemplo de salida: [2, 4, 6, 3, 1, 5]
     */

     public static void ordenamientoDeNumeros (int[] vector1){
         int inicialPar = 0;

         for (int i = 0; i < vector1.length; i ++){
             if (vector1[i] % 2 == 0 ){
                 int intercambiarElementos = vector1 [inicialPar];
                 vector1[inicialPar] = vector1[i];
                 vector1[i] = intercambiarElementos;
                 inicialPar++;
             }
         }

         for ( int i = inicialPar, j = i; i < vector1.length; i++){
             if(vector1 [i] % 2 != 0){
                 int intercambiarElementos = vector1 [j];
                 vector1[j] = vector1[i];
                 vector1[i] = intercambiarElementos;
                 j++;
             }
         }


     }
    
    /**
     * Encuentra los Dos Números que Suman un Valor
        📜 Descripción: Dado un vector de enteros y un número objetivo, encuentre dos elementos del vector cuya suma sea igual al número objetivo.
        🔹 Instrucciones:
        Leer un vector de N enteros y un número X.
        Identificar dos números dentro del vector cuya suma sea X.
        Imprimir ambos números o indicar si no existen.
        * Ejemplo de entrada:
        *  Vector: [2, 7, 11, 15]  
            X = 9
        * Ejemplo de salida: Par encontrado: (2, 7)
     */
    public static int[] encontrarLaSumaDeDosNumeros (int[] vector2, int numeroObjetivo){
        for (int i = 0; i < vector2.length; i ++){
            for ( int j = i + 1; j < vector2.length; j++){
                if (vector2[i] + vector2[j] == numeroObjetivo){
                    return new int[]{vector2[i], vector2[j]};
                }
            }
        }
        return null;
    }
    
    /**
     * Rotación Circular de un Vector
        📜 Descripción: Desplace circularmente los elementos de un vector k posiciones hacia la derecha.
        🔹 Instrucciones:
        Leer un vector de N enteros y un número k.
        Rotar el vector k posiciones hacia la derecha.
        * Ejemplo de entrada:
        Vector: [1, 2, 3, 4, 5]  
        k = 2
        * Ejemplo de salida: [4, 5, 1, 2, 3]
     */

    public static void rotarUnVector (int [] vector, int K){
        if (vector == null || vector.length == 0){
            return;
        }

        K = K % vector.length;
        if (K == 0 ){
            return;
        }

        revertir(vector, 0, vector.length - 1);
        revertir(vector, 0, K - 1);
        revertir(vector, K, vector.length - 1);
    }

    public static void revertir(int[] vector, int inicio, int fin ){
        while ( inicio < fin){
            int rotacion = vector[inicio];
            vector[inicio] = vector[fin];
            vector[fin] = rotacion;
            inicio ++;
            fin --;
        }
    }

    /**
     * Subsecuencia Más Larga de Números Consecutivos
        📜 Descripción: Encuentre la subsecuencia más larga de números consecutivos en un vector desordenado.
        🔹 Instrucciones:
        Leer un vector de N números enteros.
        Determinar la longitud de la mayor subsecuencia de números consecutivos (no necesariamente contiguos en el vector).
        * Ejemplo de entrada: [100, 4, 200, 1, 3, 2]
        * Ejemplo de salida: Mayor subsecuencia consecutiva: 4 (1, 2, 3, 4)
     */

    public static int subsecuenciaMasLarga (int[] numero){

        if (numero == null || numero.length == 0 ){
            return 0 ;
        }

        Set<Integer> conjunto = new HashSet<>();
        for(int num : numero){
            conjunto.add(num);
        }

        int maximaLongitud = 0;

        for (int num : conjunto){
            if (!conjunto.contains(num - 1)){

                int longitudActual = 1;
                int siguiente = num +1;

                while (conjunto.contains(siguiente)){
                    longitudActual++;
                    siguiente++;
                }

                maximaLongitud = Math.max(maximaLongitud, longitudActual);

            }
        }

        return maximaLongitud;

    }

}

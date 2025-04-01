/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.progra1.programacion.estructuraDeControl.example;

/**
 *
 * @author wcord
 */
public class LoopExample {
    
    /**
    * Tarea: Implementación de estructuras de control de flujo en Java.
    *
    * Instrucciones:
    * - En esta clase, deberá escribir ejemplos de cómo funcionan las siguientes estructuras de control:
    *   1. `do-while`: Mostrar un caso donde el bloque de código se ejecute al menos una vez.
    *   2. `while`: Implementar un ciclo que se repita mientras se cumpla una condición.
    *   3. `for`: Escribir un bucle que itere un número determinado de veces.
    *   4. `break`: Incluir un ejemplo donde se interrumpa un bucle bajo una condición específica.
    *   5. `continue`: Demostrar cómo omitir una iteración sin salir del bucle.
    *
    * - Comente cada ejemplo para explicar su funcionamiento.
    * - Asegúrese de que el código sea claro y fácil de entender.
    */
    
    //1. `do-while`: Mostrar un caso donde el bloque de código se ejecute al menos una vez.
    public void doWhileExample() {
        int numero;
        do {
            //ejecucion
            numero = (int) (Math.random() * 100); // numero aleatorio entre 0 y 99
            System.out.println("Numero encontrado: " + numero);
            
        } while (numero % 5 != 0);
        
        System.out.println("Se encontro un multiplo de 5, fin del bluque");        
    }
    
    public void whileExample() {
        int contador = 10;
        
        while(contador >= 1) {
            //ejecucion
            System.out.println("Contador: " + contador);
            contador--;
        }        
        System.out.print("Despegue!");
        
    }
    
    public void forExample() {
        
        int suma = 0;
        
        for(int i = 1; i <= 100; i++) {
            suma = suma + i;
        }
        
        System.out.print("La suma de los primeros 10 numeros es: " + suma);
        
    }
    
    // break; 
    public void breakExample() {        
        int limite = 50;
        boolean esPrimo = false;   
        int numero = 0;
        for(int i =  2; i <= limite; i++) {
            numero = i;
            esPrimo = true;            
            for (int j = 2; j < i; j++) {
                esPrimo = false;
                break; // si encontramos un divisor, salimos del bucle
            }            
        }   
        System.out.println("El numero " + numero + " Es Primo: " + esPrimo);
    }
    
    // continue;
    public void continueExample() {
         
        for(int i =  1; i <= 10; i++) {
            if(i % 3 == 0) {
                continue;
            }
            System.out.println("Numero: " + i);
        }
    }
    
}

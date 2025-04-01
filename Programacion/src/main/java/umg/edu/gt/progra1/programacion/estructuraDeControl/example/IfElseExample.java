/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.progra1.programacion.estructuraDeControl.example;

/**
 *
 * @author wcord
 */
public class IfElseExample {
    
    public void example(int numero) {
        if(numero > 0) {
            System.out.println("El numero es positivo");
        } else if(numero < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es cero");
        }        
    }
    
    /*
    Crear un metodo que reciba los tres lados de un triangulo
    Determinar:
        Equilatero: lados iguales
        Isosceles: dos lados iguales
        Escaleno: todos los lados diferentes
        No es un triangulo: si no cumple con las codiciones    
    */
    public void validarTriangulo(int a, int b, int c) {        
        if(a + b > c && a + c > b && b + c > a) {            
            if(a == b && b == c) {
                System.out.println("Es un equilatero");
            } else if(a == b || a == c || b == c) {
                System.out.println("Es un isosceles");
            } else {
                System.out.println("Es un escaleno");
            }            
        } else {
             System.out.println("No es un triangulo valido");
        }
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.progra1.programacion.estructuraDeControl.example;

/**
 *
 * @author wcord
 */
public class SwitchCaseExample {
    
    public String getDiaSemana(int dia) {
        String diaEnLetras = "";
        
        switch(dia) {  
            case 1: 
                diaEnLetras = "Domingo";
                break;
            case 2: 
                diaEnLetras = "Lunes";
                break;
            case 3: 
                diaEnLetras = "Martes";
                break;
            case 4: 
                diaEnLetras = "Miercoles";
                break;
            case 5: 
                diaEnLetras = "Jueves";
                break;
            case 6: 
                diaEnLetras = "Viernes";
                break;
            case 7: 
                diaEnLetras = "Domingo";
                break;
            default:
                diaEnLetras = "Dia no valido";
            
        }
        return diaEnLetras;
        
    } 
    
    public boolean getDiasNoLaborales(String dia) {
        boolean esLaboral;
        
        switch(dia) {  
            case "Sabado": 
            case "Domingo": 
                esLaboral = false;
                break;
            case "Lunes": 
            case "Martes": 
            case "Miercoles": 
            case "Jueves": 
            case "Viernes": 
                esLaboral = true;
                break;                
            default:
                esLaboral = false;
            
        }
        return esLaboral;
        
    } 
    
    /*
    Ejercicio 1:
    El programa solicita dos números y una operación (+, -, *, / o %).
    Luego, usa switch para realizar la operación y mostrar el resultado.

    */    
    public void operacionesSwitch(int n1, int n2, String operacion){
        double r;
        switch (operacion){
            case "+":
                r = n1 + n2;
                System.out.print("El resultado es: " + r);
                break;
            case "-":
                r = n1 - n2;
                System.out.print("El resultado es: " + r);
                break;
            case "*":
                r = n1 * n2;
                System.out.print("El resultado es: " + r);
                break;
            case "/":
                r = n1 / n2;
                System.out.print("El resultado es: " + r);
                break;
            case "%":
                r = n1 % n2;
                System.out.print("El resultado es: " + r);
                break;
        }
    }
    
    

}

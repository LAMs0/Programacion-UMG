package umg.edu.gt.progra1.programacion.impl;

import umg.edu.gt.progra1.programacion.impl.dto.Producto;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Inventario {

    public List<String> inicializarInventario() {
        Producto[] productos = new Producto[5];
        productos[0] = new Producto("Maseca", 100, 10.5, "Masa", true);
        productos[1] = new Producto("Coca cola", 0, 20, "Bebida", false);
        productos[2] = new Producto("Pepsi cola", 500, 15, "Bebida", true);
        productos[3] = new Producto("Galleta", 200, 7.25, "Golosinas", true);
        productos[4] = new Producto("Pinguino", 0, 7.25, "Golosinas", false);

        // como calcular el precio de todo el inventario?
        System.out.println("Precio total: " + calcularTotalInventario(productos));

        // Cuantos productos estan fuera de inventario?
        System.out.println("Productos agotados " + totalInventario(productos));

        // Cuales son los productos disponibles?

        List<String> disponibles = new ArrayList<>();
        for (Producto prod: productos){
            if (prod.getCantidad() > 0 && prod.isEstado()){
                disponibles.add(prod.getNombre());
            }

        }

        // Hacer una tabla para mostrar el inventario total

        return disponibles;
    }


    private double calcularTotalInventario(Producto[] productos) {
        double precioTotal = 0;
        for(Producto prod: productos) {
            precioTotal = precioTotal + prod.calcularValorTotal();
        }
        return precioTotal;
    }

    private int  totalInventario(Producto[] productos){
        int contador = 0;
        for (Producto prod: productos) {
            if (prod.getCantidad() == 0 || !prod.isEstado()) {
                contador++;
            }
        }
         return contador;
    }






}

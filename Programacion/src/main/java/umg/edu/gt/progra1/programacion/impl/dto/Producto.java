package umg.edu.gt.progra1.programacion.impl.dto;

public class Producto {
    // atributos
    private String nombre;
    private int cantidad;
    private double precio;
    private String tipo;
    // estados: existente (true), agotado (false)
    private boolean estado;

    // toString

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + ", tipo=" + tipo + ", estado=" + estado + '}';
    }

    // constructor
    public Producto() {
    }

    public Producto(String nombre, int cantidad, double precio, String tipo, boolean estado) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.tipo = tipo;
        this.estado = estado;
    }

    // getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    // comportamiento (metodos o funciones): agregar, quitar
    public double calcularValorTotal() {
        return precio * cantidad;
    }

    public boolean totalInventario(){
        return cantidad == 0 || !estado;
    }

    public boolean productosDisponible (){
        return cantidad > 0 && estado;
    }

}

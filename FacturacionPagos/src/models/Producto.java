public class Producto {
    private String nombre;
    private double precio;
    private double impuesto;

    public double calcularPrecioConImpuesto() {
        return precio + impuesto;
    }
}

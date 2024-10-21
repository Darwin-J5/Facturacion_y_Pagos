import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Factura {
    private String numeroFactura;
    private Date fechaEmision;
    private double total;
    private double descuentos;
    private double impuestos;
    private List<Producto> productos;

    public Factura() {
        productos = new ArrayList<>();
    }

    public void calcularTotal() {
        // Implementación para calcular el total
    }

    public void agregarProducto(Producto producto, int cantidad) {
        // Implementación para agregar un producto
    }

    public void aplicarDescuento(double descuento) {
        // Implementación para aplicar descuento
    }

    public void generarComprobante() {
        // Generar comprobante
    }

    public void enviarComprobantePorEmail() {
        // Implementar envío por email
    }
}

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RegistroFacturas {
    private List<Factura> facturas;

    public RegistroFacturas() {
        facturas = new ArrayList<>();
    }

    public void agregarFactura(Factura factura) {
        facturas.add(factura);
    }

    public List<Factura> consultarPorFecha(Date fecha) {
        // Implementar consulta por fecha
        return new ArrayList<>();
    }

    public List<Factura> consultarPorCliente(Cliente cliente) {
        // Implementar consulta por cliente
        return new ArrayList<>();
    }

    public List<Factura> consultarPorMonto(double monto) {
        // Implementar consulta por monto
        return new ArrayList<>();
    }
}

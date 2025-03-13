package modelo;
import modelo.MetodoPago;
public class pagoCredito implements MetodoPago{
    @Override
    public double calcularPago(double monto) {
        return monto*1; //sin descuento
    }
}


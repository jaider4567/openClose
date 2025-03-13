package modelo;
import modelo.MetodoPago;
public class pagoNequi implements MetodoPago{
    @Override
    public double calcularPago(double monto) {
        return monto*0.95; //descuento del 5%
    }
}

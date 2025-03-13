package modelo;
import modelo.MetodoPago;
public class pagoEfectivo implements MetodoPago{
    @Override
    public double calcularPago(double monto) {
        return monto*0.85; //descuento del 15%
    }
}

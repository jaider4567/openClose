package controlador;
import vista.Vista;
import modelo.Modelo;

public class Controlador {

    private Vista vista;
    private Modelo modelo;

    public Controlador(Vista Vista, Modelo modelo){
        this.vista = vista;
        this.modelo = modelo;
    }
}

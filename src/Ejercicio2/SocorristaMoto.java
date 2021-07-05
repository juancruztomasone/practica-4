package Ejercicio2;

public class SocorristaMoto extends Vehiculo implements ISocorrista<Vehiculo>{

    public SocorristaMoto(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente) {
        super(velocidad, aceleracion, anguloDeGiro, patente, 300.0, 2);
    }


    @Override
    public void socorrer(Vehiculo vehiculo) {
        System.out.println("Socorriendo moto con patente "+vehiculo.getPatente());
    }
}

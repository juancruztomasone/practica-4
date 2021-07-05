package Ejercicio2;

public class SocorristaAuto extends Vehiculo implements ISocorrista<Vehiculo>{

    public SocorristaAuto(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente) {
        super(velocidad, aceleracion, anguloDeGiro, patente, 1000.0, 4);
    }

    @Override
    public void socorrer(Vehiculo vehiculo) {
        System.out.println("Socorriendo auto con patente "+vehiculo.getPatente());
    }
}

package Ejercicio2;

public class Main {

    public static void main(String[] args) {
        SocorristaAuto socorristaDeAutos = new SocorristaAuto(200.3,40.2,90.0,"WIN-111");
        SocorristaMoto socorristaDeMotos = new SocorristaMoto(250.5,50.2,90.0,"WIN-222");

        Carrera finalTournament = new Carrera(50.0,10000.0,"Gran final internacionar DAKAR", 4, socorristaDeAutos, socorristaDeMotos);

        finalTournament.darDeAltaAuto(120.2,20.3,70.7,"SRV-123");
        finalTournament.darDeAltaAuto(100.0,50.3,80.5,"AAA-858");
        finalTournament.darDeAltaMoto(200.0,10.3,90.5,"JML-666");
        finalTournament.darDeAltaMoto(100.4,5.3,23.4,"GGG-423");
        finalTournament.darDeAltaAuto(180.3,50.3,20.5,"GWD-572");

        finalTournament.eliminarVehiculoConPatente("GGG-423");

        finalTournament.darDeAltaAuto(180.3,50.3,20.5,"GWD-572");

        finalTournament.socorrerAuto("SRV-123");
        finalTournament.socorrerMoto("SRV-123");
        finalTournament.socorrerMoto("JML-666");

        Vehiculo ganador = finalTournament.obtenerGanador();
        System.out.println("El ganador es: "+ganador.getPatente()+"!!!!!!");
    }
}

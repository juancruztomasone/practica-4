package Ejercicio2;

import java.util.ArrayList;

public class Carrera {
    Double distancia;
    Double premioEnDolares;
    String nombre;
    Integer cantidadDeVehiculosPermitidos;
    ArrayList<Vehiculo> listaVehiculos;
    SocorristaAuto socorristaAutos;
    SocorristaMoto socorristaMotos;

    public Carrera(Double distancia, Double premioEnDolares, String nombre, Integer cantidadDeVehiculosPermitidos, SocorristaAuto socorristaAutos, SocorristaMoto socorristaMotos) {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
        this.listaVehiculos = new ArrayList<Vehiculo>();
        this.socorristaAutos = socorristaAutos;
        this.socorristaMotos = socorristaMotos;

        System.out.println("Carrarta '"+nombre+"' creada exitosamente!");
    }

    public void darDeAltaAuto(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente){
        if(this.listaVehiculos.size() < this.cantidadDeVehiculosPermitidos){
            Auto newCar = new Auto(velocidad,aceleracion,anguloDeGiro,patente);
            this.listaVehiculos.add(newCar);
            System.out.println("El auto se registro correctamente en la carrera!");
        }else{
            System.out.println("Ya no hay cupos libres para esta carrera :(");
        }
    }

    public void darDeAltaMoto(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente){
        if(this.listaVehiculos.size() < this.cantidadDeVehiculosPermitidos){
            Moto newMotorcycle = new Moto(velocidad,aceleracion,anguloDeGiro,patente);
            this.listaVehiculos.add(newMotorcycle);
            System.out.println("La moto se registro correctamente en la carrera!");
        }else{
            System.out.println("Ya no hay cupos libres para esta carrera :(");
        }
    }

    public void eliminarVehiculo(Vehiculo vehiculo){
        if(this.listaVehiculos.contains(vehiculo)){
            this.listaVehiculos.remove(vehiculo);
            System.out.println("Vehiculo eliminado de la carrera correctamente!");
        }else{
            System.out.println("El vehiculo no se encontro en la carrera.");
        }
    }

    public void eliminarVehiculoConPatente(String patente){
        boolean found = false;
        for(int i=0; i<this.listaVehiculos.size()+1; i++){
            if(this.listaVehiculos.get(i).getPatente() == patente){
                this.listaVehiculos.remove(i);
                found = true;
            }
        }

        if(found){
            System.out.println("Vehiculo eliminado de la carrera correctamente!");
        }else{
            System.out.println("El vehiculo no se encontro en la carrera.");
        }
    }

    public Vehiculo obtenerGanador(){
        Double bestResult = 0.0;
        Vehiculo winner = null;

        for(int i=0; i<this.listaVehiculos.size(); i++){
            Vehiculo vehiculo = this.listaVehiculos.get(i);
            Double result = vehiculo.velocidad * 1/2 * vehiculo.aceleracion / (vehiculo.anguloDeGiro*(vehiculo.peso-vehiculo.ruedas*100));

            if(result > bestResult){
                bestResult = result;
                winner = vehiculo;
            }
        }

        return winner;
    }

    public void socorrerAuto(String patente){
        Vehiculo auto = null;
        boolean found = false;

        for(int i=0; i<this.listaVehiculos.size(); i++){
            if(this.listaVehiculos.get(i).getPatente() == patente && this.listaVehiculos.get(i) instanceof Auto){
                found = true;
                auto = this.listaVehiculos.get(i);
            }
        }

        if(found){
            socorristaAutos.socorrer(auto);
        }else{
            System.out.println("El auto no se encontro en la carrera para socorrerlo.");
        }
    }

    public void socorrerMoto(String patente){
        Vehiculo moto = null;
        boolean found = false;

        for(int i=0; i<this.listaVehiculos.size(); i++){
            if(this.listaVehiculos.get(i).getPatente() == patente && this.listaVehiculos.get(i) instanceof Moto){
                found = true;
                moto = this.listaVehiculos.get(i);
            }
        }

        if(found){
            socorristaMotos.socorrer(moto);
        }else{
            System.out.println("La moto no se encontro en la carrera para socorrerla.");
        }
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public Double getPremioEnDolares() {
        return premioEnDolares;
    }

    public void setPremioEnDolares(Double premioEnDolares) {
        this.premioEnDolares = premioEnDolares;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidadDeVehiculosPermitidos() {
        return cantidadDeVehiculosPermitidos;
    }

    public void setCantidadDeVehiculosPermitidos(Integer cantidadDeVehiculosPermitidos) {
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }
}

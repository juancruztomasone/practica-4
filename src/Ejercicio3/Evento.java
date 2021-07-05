package Ejercicio3;

import Ejercicio2.Moto;

import java.util.ArrayList;

public class Evento {
    ArrayList<Invitados> listaInvitados;
    ArrayList<FuegosArtificiales> listaFuegosArtificiales;

    public Evento(ArrayList<Invitados> listaInvitados, ArrayList<FuegosArtificiales> listaFuegosArtificiales) {
        this.listaInvitados = listaInvitados;
        this.listaFuegosArtificiales = listaFuegosArtificiales;
    }

    public void soplarVelas(){

    }

    public ArrayList<FuegosArtificiales> obtenerListaFuegosArtificiales(){
        return this.listaFuegosArtificiales;
    }

    public void repartirTorta(){
        for(int i=0; i<this.listaInvitados.size(); i++){
                this.listaInvitados.get(i).
        }
    }
}

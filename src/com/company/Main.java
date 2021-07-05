package com.company;

import Ejercicio1.Campera;
import Ejercicio1.GuardaRopa;
import Ejercicio1.Prenda;
import Ejercicio1.Remera;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Prenda campera1 = new Campera("Columbia", "Slim");
        Prenda remera2 = new Remera("Levis","Temporada 2021");

        ArrayList<Prenda> prendas = new ArrayList();
        prendas.add(campera1);
        prendas.add(remera2);


        GuardaRopa guardaRopa = new GuardaRopa();

        guardaRopa.mostrarPrendas();
        guardaRopa.guardarPrendas(prendas);
        guardaRopa.mostrarPrendas();
    }
}

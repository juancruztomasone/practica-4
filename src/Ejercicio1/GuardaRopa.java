package Ejercicio1;

import java.util.*;

public class GuardaRopa {
    private static HashMap<Integer, ArrayList<Prenda>> ropero;

    public GuardaRopa() {
        this.ropero = new HashMap<Integer, ArrayList<Prenda>>();
    }

    public Integer guardarPrendas(ArrayList<Prenda> listaDePrenda){
        this.ropero.put(this.ropero.size()+1,listaDePrenda);
        return this.ropero.size();
    }

    public void mostrarPrendas(){
        if(this.ropero.size() <= 0) {
            System.out.println("El guardaropa esta vacio");
        }else{
            for(Map.Entry<Integer, ArrayList<Prenda>> entry : this.ropero.entrySet()) {
                Integer key = entry.getKey();
                ArrayList<Prenda> prendas = entry.getValue();

                System.out.println("Nº "+key+" --------------------------");
                for (int i=0; i<prendas.size(); i++) {
                    System.out.println("Prenda: "+prendas.get(i));
                }
                System.out.println("-------------------------------");
            }
        }
    }

    public List<Prenda> devolverPrendas(Integer numero){
        ArrayList<Prenda> prendas = this.ropero.get(numero);
        this.ropero.remove(numero);

        return prendas;
    }
}

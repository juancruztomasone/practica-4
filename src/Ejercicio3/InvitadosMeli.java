package Ejercicio3;

public class InvitadosMeli extends Invitados implements IComerTorta{

    public InvitadosMeli(String nombre) {
        super(nombre);
    }

    @Override
    public void comer() {
        this.comioTorta = true;
        System.out.println("Comiendo torta. Viva la Chiqui!!");
    }
}

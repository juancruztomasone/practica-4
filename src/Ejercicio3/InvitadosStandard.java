package Ejercicio3;

public class InvitadosStandard extends Invitados implements IComerTorta{

    public InvitadosStandard(String nombre) {
        super(nombre);
    }

    @Override
    public void comer() {
        this.comioTorta = true;
        System.out.println("Comiendo torta.");
    }
}

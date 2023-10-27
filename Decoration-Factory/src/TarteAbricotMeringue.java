public class TarteAbricotMeringue extends GateauxFactory implements Observateur {
    @Override
    public void Creation() {
        gateaux = new Abricot(new Meringue(new Tartes()));
    }

    @Override
    public void update(int seuil) {
        if (seuil > 0)
        {
            System.out.println("Tarte Abricot Meringue : " + seuil + " restant(s)");
        }
        else
        {
            System.out.println("Tarte Abricot Meringue : Plus de tarte disponible");
        }
    }

}
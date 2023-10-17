public class TarteAbricotMeringue extends GateauxFactory {
    @Override
    public void Creation() {
        gateaux = new Abricot(new Meringue(new Tartes()));
    }

}
public class TarteAbricotMeringue extends GateauxFactory {
    @Override
    public Gateaux Creation() {
        gateaux = new Abricot(new Meringue(new Tartes()));
        return gateaux;
    }

}
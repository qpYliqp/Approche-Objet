public class TartePommeNoisetteMeringue extends GateauxBuilder{
    @Override
    public void Creation() {
        gateaux = new Pomme(new Noisette(new Meringue(new Tartes())));
    }
}

public class TartePommeNoisetteMeringue extends GateauxBuilder{
    @Override
    public void Creation() {
        gateaux = new Tartes();
    }

    @Override
    public void setBase() {
        gateaux = new Pomme(gateaux);
    }

    @Override
    public void setTopping()
    {
        gateaux = new Meringue(new Noisette(gateaux));
    }
}

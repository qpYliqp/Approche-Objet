public class ChouxChocolatAmandes extends GateauxBuilder{
    @Override
    public void Creation() {
        gateaux = new Choux();
    }

    @Override
    public void setBase() {
        gateaux = new Chocolat(gateaux);
    }

    @Override
    public void setTopping()
    {
        gateaux = new Amandes(gateaux);
    }

}

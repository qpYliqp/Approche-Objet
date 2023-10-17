public class ChouxVanilleChantilly extends GateauxBuilder{
    @Override
    public void Creation() {
        gateaux = new Choux();
    }

    @Override
    public void setBase() {
        gateaux = new Vanille(gateaux);
    }

    @Override
    public void setTopping()
    {
        gateaux = new Chantilly(gateaux);
    }
}

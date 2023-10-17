public class ChouxChocolatAmandes extends GateauxBuilder{
    @Override
    public void Creation() {
        gateaux = new Chocolat(new Amandes(new Chocolat(new Choux())));
    }

}

public class ChouxChocolatNoisette extends GateauxFactory  {
    @Override
    public void Creation() {
        gateaux = new Chocolat(new Noisette(new Chocolat(new Choux())));
    }





}
public class ChouxChocolatNoisette extends GateauxFactory  {
    @Override
    public Gateaux Creation() {
        gateaux = new Chocolat(new Noisette(new Chocolat(new Choux())));
        return gateaux;
    }





}
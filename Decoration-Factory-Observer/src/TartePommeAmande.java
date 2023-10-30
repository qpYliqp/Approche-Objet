public class TartePommeAmande extends GateauxFactory  {
    @Override
    public Gateaux Creation() {
        gateaux = new Pomme(new Amandes(new Tartes()));
        return gateaux;

    }


}


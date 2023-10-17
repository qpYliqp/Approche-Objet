public class Patissier {

    private GateauxBuilder gateauxBuilder;
    public void setGateauxBuilder(GateauxBuilder gb)
    {
        this.gateauxBuilder = gb;
    }

    public Gateaux getGateaux()
    {
        return this.gateauxBuilder.getGateaux();
    }

    public void constructGateau()
    {
        this.gateauxBuilder.Creation();
    }
    public static void main(String[] args) {

        GateauxBuilder gb = new TartePommeNoisetteMeringue();
        Patissier p = new Patissier();
        p.setGateauxBuilder(gb);
        p.constructGateau();
        Gateaux g = p.getGateaux();
        System.out.println(g.getDescription());

    }

}

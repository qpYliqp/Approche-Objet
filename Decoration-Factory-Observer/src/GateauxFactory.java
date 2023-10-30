public abstract class GateauxFactory {
    protected Gateaux gateaux;
    public Gateaux getGateaux()
    {
        return this.gateaux;
    }

    public abstract Gateaux Creation();


}

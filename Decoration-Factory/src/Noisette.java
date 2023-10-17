public class Noisette extends Ingredients{

    public Noisette(Gateaux gateau)
    {
        super(gateau);
    }

    @Override
    public String getDescription() {
        return gateau.getDescription() + ", noisettes";
    }
}

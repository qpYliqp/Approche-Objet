public class Vanille  extends Ingredients{

    public Vanille(Gateaux gateau)
    {
        super(gateau);
    }
    @Override
    public String getDescription() {
        return gateau.getDescription() + "à la vanille";
    }
}

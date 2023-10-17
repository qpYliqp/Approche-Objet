public class Meringue extends Ingredients{

    public Meringue(Gateaux gateau)
    {
        super(gateau);
    }

    @Override
    public String getDescription() {
        return gateau.getDescription() + ", meringue";
    }
}
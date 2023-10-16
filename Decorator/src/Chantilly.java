public class Chantilly extends Ingredients{

    public Chantilly(Gateaux gateau)
    {
        super(gateau);
    }
    @Override
    public String getDescription() {

        if(gateau.getDescription().contains("Tarte"))
        {
            throw new IllegalArgumentException("Il ne peut y avoir de chantilly sur une tarte");
        }
        return gateau.getDescription() + ", chantilly";
    }
}

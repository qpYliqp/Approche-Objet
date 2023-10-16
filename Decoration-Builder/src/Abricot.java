public class Abricot extends Ingredients {

    public Abricot(Gateaux gateau) {
        super(gateau);
    }

    @Override
    public String getDescription() {


        if(gateau.getDescription().contains("Choux"))
        {
            throw new IllegalArgumentException("Les choux ne peuvent être aux abricots");
        }
        return gateau.getDescription() + "aux abricots";
    }
}
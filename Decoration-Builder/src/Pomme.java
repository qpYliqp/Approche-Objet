public class Pomme extends Ingredients {

    public Pomme(Gateaux gateau) {
        super(gateau);
    }

    @Override
    public String getDescription() {

        if(gateau.getDescription().contains("Choux"))
        {
            throw new IllegalArgumentException("Les choux ne peuvent être aux pommes");
        }
        return gateau.getDescription() + ", pommes";
    }
}
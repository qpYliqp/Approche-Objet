public class Choux extends Gateaux{

    public Choux()
    {
        this.name = "Tarte";
    }

    public void addIngredient(Ingredients ingredient)
    {
        if(ingredient.getDescription().contains("Chocolat") || ingredient.getDescription().contains("Vanille"))
        {
            System.out.println("Nous ne pouvons pas ajouter cet ingrédient : " + ingredient.getDescription() +" pour une Tarte");
        }
        else
        {
            this.ingredients.add(ingredient);

        }
    }
}

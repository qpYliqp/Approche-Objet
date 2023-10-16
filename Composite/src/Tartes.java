public class Tartes extends Gateaux{

    public Tartes()
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

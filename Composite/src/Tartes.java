public class Tartes extends Gateaux{

    public Tartes()
    {
        this.name = "Tarte";
    }

    public void addIngredient(Ingredients ingredient)
    {
        if(ingredient.description.contains("Chocolat") || ingredient.description.contains("Vanille"))
        {
            System.out.println("Nous ne pouvons pas ajouter cet ingrédient : " + ingredient.description +" pour une Tarte");
        }
        else
        {
            this.ingredients.add(ingredient);

        }
    }


}

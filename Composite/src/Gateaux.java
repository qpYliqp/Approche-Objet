import java.util.ArrayList;

public abstract class Gateaux {

   ArrayList<Ingredients> ingredients = new ArrayList<Ingredients>();
   protected String name;

   public void addIngredient(Ingredients ingredient)
   {
      ingredients.add(ingredient);
   }

   public Ingredients getIngredient(int index)
   {
      return ingredients.get(index);
   }

   public void Afficher()
   {
      System.out.println("Gateaux : " + this.name +"\n Ingredients :" );
      for(Ingredients ingredient : ingredients)
      {
         System.out.println(" " + ingredient.description);
      }
   }

    
}

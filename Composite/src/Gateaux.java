import java.util.ArrayList;

public abstract class Gateaux implements Ingredients{

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

   @Override
   public String getDescription()
   {
      String result = name;
      for(Ingredients ingredient : ingredients)
      {
         result += ingredient.getDescription();
      }
      return result;
   }

    
}

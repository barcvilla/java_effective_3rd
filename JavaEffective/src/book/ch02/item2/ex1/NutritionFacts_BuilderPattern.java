/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.ch02.item2.ex1;

/**
 * NutritionFacts_BuilderPattern inmutable class y todos los parametros con valores por defecto estan en un solo lugar
 * Lo metodos setter del builder retorna el builder mismo, asi las invocaciones pueden ser encadenados, lo que nos da
 * como resultado un API fluente
 * @author barcvilla
 */
public class NutritionFacts_BuilderPattern 
{
   private final int servingSize;
   private final int servings;
   private final int calories;
   private final int fat;
   private final int sodium;
   private final int carbohydrate;
   
   public static class Builder
   {
      // parametros requeridos
      private final int servingSize;
      private final int servings;
      
      // Parametros opcionales - inicializado a valores por defecto
      private int calories = 0;
      private int fat = 0;
      private int sodium = 0;
      private int carbohydrate = 0;
      
      public Builder(int servingSize, int servings)
      {
          this.servingSize = servingSize;
          this.servings = servings;
      }
      
      public Builder calories(int val)
      {
          calories = val;
          return this;
      }
      
      public Builder fat(int val)
      {
          fat = val;
          return this;
      }
      
      public Builder sodium(int val)
      {
          sodium = val;
          return this;
      }
      
      public Builder carbohydrate(int val)
      {
          carbohydrate = val;
          return this;
      }
      
      public NutritionFacts_BuilderPattern build()
      {
          return new NutritionFacts_BuilderPattern(this);
      }
   }
  
   private NutritionFacts_BuilderPattern(Builder builder)
   {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
   }    
   
   @Override
   public String toString()
   {
       return "Nutrition Facts: ServingSize: " + servingSize + " servings: " + servings +
               " calories: " + calories + " fat: " + fat + " sodium: " + sodium + 
               " carbohydrate: " + carbohydrate;
   }
   
    public static void main(String[] args) {
        NutritionFacts_BuilderPattern cocaCola = new NutritionFacts_BuilderPattern.Builder(240, 8)
                .calories(100).fat(32).sodium(35).carbohydrate(27).build();
        System.out.println(cocaCola.toString());
    }
}

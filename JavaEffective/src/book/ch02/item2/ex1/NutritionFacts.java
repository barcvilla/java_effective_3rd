/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.ch02.item2.ex1;

/**
 * ITEM 2. CONSIDERAR UN BUILDER CUANDO NOS ENFRENTAMOS CON CONSTRUCTORES CON MUCHOS PARAMETROS
 * Patron de constructor teslecopio - no escala bien
 */
public class NutritionFacts 
{
   private final int servingSize;
   private final int servings;
   private final int calories;
   private final int fat;
   private final int sodium;
   private final int carbohydrate;
   
   public NutritionFacts(int servingSize, int servings)
   {
       this(servingSize, servings, 0);
   }
   
   public NutritionFacts(int servingSize, int servings, int calories)
   {
       this(servingSize, servings, calories, 0);
   }
   
   public NutritionFacts(int servingSize, int servings, int calories, int fat)
   {
       this(servingSize, servings, calories, fat, 0);
   }
   
   public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium)
   {
       this(servingSize, servings, calories, fat, sodium, 0);
   }
   
   public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate)
   {
       this.servingSize = servingSize;
       this.servings = servings;
       this.calories = calories;
       this.fat = fat;
       this.sodium = sodium;
       this.carbohydrate = carbohydrate;
   }
}

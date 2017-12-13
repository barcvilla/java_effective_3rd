/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.ch02.item2;

/**
 * Nutrition Facts - Version 1 : JavaBeans Pattern
 * Este patron tiene la desventaja del patron constructor telescopio
 */
public class NutritionFacts_V1 
{
    // Los parametros inicializados a valores por defecto
   private int servingSize = -1;
   private int servings = -1;
   private int calories = 0;
   private int fat = 0;
   private int sodium = 0;
   private int carbohydrate = 0;
   
   public NutritionFacts_V1()
   {
   }
   public void setServingSize(int val)  
   { 
       servingSize = val; 
   }
   
   public void setServings(int val)     
   { 
       servings = val; 
   }
   
   public void setCalories(int val)     
   { 
       calories = val; 
   }
   
   public void setFat(int val)          
   { 
       fat = val; 
   }
   
   public void setSodium(int val)       
   { 
       sodium = val; 
   }
   
   public void setCarbohydrate(int val)  
   { 
       carbohydrate = val; 
   }
}

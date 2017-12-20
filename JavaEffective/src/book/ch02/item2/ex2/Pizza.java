/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.ch02.item2.ex2;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * Builder Pattern encaja bien con las clases jerarquicas
 * @author barcvilla
 */
public abstract class Pizza 
{
    public enum Topping{HAM, MUSHROOM, ONION, PEPPER, SAUSAGE};
    final Set<Topping> toppings = null;
    
    abstract static class Builder<T extends Builder<T>>
    {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        public T addTopping(Topping topping)
        {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }
        
        abstract Pizza build();
        // Subclasses deben override este metodo para retornar "this"
        protected abstract T self();
    }
    
    Pizza(Builder<?> builder)
    {
        
    }
}

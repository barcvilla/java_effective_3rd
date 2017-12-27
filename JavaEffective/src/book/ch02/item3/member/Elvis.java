/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.ch02.item3.member;

/**
 * Segunda propuesta de clase Singleton: El miembro publico es un metodo static factory.
 * La ventaja de este enfoque es que da la flexibilidad de cambiar de opinion sobre si la clase es un singleton
 * sin cambiar su API. El metodo factory devuelve la unica instancia, pero podria modificarse para que devuelva por ejm
 * una instancia separada por cada hilo que la invoque.
 * Otra ventaja es que puede escribir una fabrica de singleton generica si la app lo requiere.
 * @author barcvilla
 */
public class Elvis 
{
    private static final Elvis INSTANCE = new Elvis();
    
    private Elvis()
    {
    }
    
    public static Elvis getInstance()
    {
        return INSTANCE;
    }
    
    public void leaveTheBuilding()
    {
        System.out.println("Hi baby");
    }
    
    /**
     * Todas las llamadas a Elvis.getInstance() devuelven la misma referencia de objeto y de Elvis no se creara
     * ninguna otra instancia.
     * @param args 
     */
    public static void main(String[] args) {
        Elvis elvis = Elvis.getInstance();
        elvis.leaveTheBuilding();
    }
}

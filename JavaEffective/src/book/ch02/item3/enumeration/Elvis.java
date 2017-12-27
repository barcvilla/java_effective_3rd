/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.ch02.item3.enumeration;

/**
 * Enum Singleton - La propuesta preferida
 * Esta propuesta puede parecer un poco antinatural pero un emun type single-element es a menudo la mejor forma de 
 * implementar un singleton. Note que no podra usar esta propuesta si su singleton class debe extender una superclass
 * que no sea Enum
 * @author barcvilla
 */
public enum Elvis 
{
    INSTANCE;
    
    public void leaveTheBuilding()
    {
        System.out.println("Hi baby");
    }
    
    public static void main(String[] args)
    {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }
}

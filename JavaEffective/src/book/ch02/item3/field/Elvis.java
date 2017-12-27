/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.ch02.item3.field;

/**
 * Clase Singleton con campo final public. La ventaja de este metodo de singleton es que la API deja claro que la clase
 * es unica, el campo publico static es final, por lo que siempre tendra la misma referencia al objeto.
 * La segunda venta es que es mas simple,
 * @author barcvilla
 */
public class Elvis 
{
    public static final Elvis INSTANCE = new Elvis();
    
    private Elvis()
    {
    }
    
    public void leaveTheBuilding()
    {
        System.out.println("Hi baby!");
    }
    
    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }
}

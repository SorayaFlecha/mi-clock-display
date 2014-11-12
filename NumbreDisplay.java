
/**
 * Write a description of class NumbreDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumbreDisplay
{
    // instance variables - replace the example below with your own
    private int display;
    
    private int limite;

    /**
     * Constructor for objects of class NumbreDisplay
     */
    public NumbreDisplay(int limit)
    {
        // initialise instance variables
        limite = limit;
        display = 0;
        
    }
    
    /**
     * Metodo que devuelve el valor del display
     */
    public void setValue(int valorLim)
    {
        // put your code here
        display = valorLim;
    }
    
    /**
     * Metodo que devuelve el valor del display como entero.
     */
    public int getValue()
    {
        // put your code here
        return display;
    }
    
    /**
     * Metodo que devuelve el valor actual del display en forma de 2 caracteres
     */
    public int getDisplayValue()
    {
     String menor;        
     if (display > 10)
     {
            menor = "0" + display;
     }
     else
     {
            menor = "" + display;
     }
     return display;
    }
    
    /**
     * Metodo que incrementa el display en 1 y cuando llega al limite se pone a 0.
     */
    public void increment()
    {
        if(display < limite)
        {
            display = display + 1;
        }
        else
        {
            display = 0;
        }
    }
    
    
}

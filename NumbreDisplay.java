
/**
 * Write a description of class NumbreDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumbreDisplay
{
    // instance variables - replace the example below with your own
    private int value;
    
    private int limite;

    /**
     * Constructor for objects of class NumbreDisplay
     */
    public NumbreDisplay(int newLimit)
    {
        // initialise instance variables
        
        limite = newLimit;
        value = 0;
        
    }
   
    
    /**
     * Metodo que devuelve el valor de value.
     */
    public void setValue(int valorLim)
    {
       if(valorLim < limite && (valorLim >= 0))
       {
          value = valorLim; 
       }
       else
       {
           System.out.println("El valor no puede esceder del limite que es " + limite);
       }
    }// put your code her
   
    
    /**
     * Metodo que devuelve el valor del display como entero.
     */
    public int getValue()
    {
        // put your code here
        return value;
    }
    
    /**
     * Metodo que devuelve el valor actual del display en forma de 2 caracteres
     */
    public String getDisplayValue()
    {
        if (value > 10)
             {
                    return "0" + value;
             }
             else
             {
                    return "" + value;
             }
        
    }
    
    /**
     * Metodo que incrementa el display en 1 y cuando llega al limite se pone a 0.
     */
    public void increment()
    {
        //value = (value + 1) % limite; esto es igual k poner lo de abajo.
        if(value < (limite - 1))
        {
            value = value + 1;
        }
        else
        {
            value = 0;
        }
    }
    
    
}

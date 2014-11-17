
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // instance variables - replace the example below with your own
    private NumbreDisplay horas;
    
    private NumbreDisplay minutos;
    
    private String almacen5c;
    
    /**
     * Constructor.
     */
    public ClockDisplay()
    {
        horas = new NumbreDisplay(24);
        minutos = new NumbreDisplay(60);

        
    }
    
    /**
     * Constructor 2.
     */
    public ClockDisplay( int newHoras, int newMinutos)
    {
        horas = new NumbreDisplay(24);
        minutos = new NumbreDisplay(60);
        horas.setValue(newHoras);
        minutos.setValue(newMinutos);
            
        
                
    }
    
   
            
    public String setTime(int h, int m)
    {
        String menor;
        if(h < 10 || m < 10)
        {
            menor = "0" + h + ":" + "0" + m;
        }
        else
        {
            menor = "" + h + ":" + "" + m;
        }
        return menor;
    }
    
}
   
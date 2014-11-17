
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
        horas = new NumbreDisplay(23);
        minutos = new NumbreDisplay(59);
        almacen5c = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
        
    }
    
    /**
     * Constructor 2.
     */
    public ClockDisplay( int newHoras, int newMinutos)
    {
        horas = new NumbreDisplay(23);
        minutos = new NumbreDisplay(59);
        horas.setValue(newHoras);
        minutos.setValue(newMinutos);
          
        
                
    }
    
    public void setTime(int hNew, int mNew)
    {
        horas = new NumbreDisplay (hNew);
        minutos = new NumbreDisplay (mNew);
        
    }
    
    public String getTime()
    {
       almacen5c = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
       return almacen5c;
    }

    public void timeTick()
    {
        minutos. increment();
    }

}         
   
    

   
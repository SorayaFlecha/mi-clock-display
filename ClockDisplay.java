
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // Objeto NumbreDisplay que nos guarda las horas.
    private NumbreDisplay horas;
     // Objeto NumbreDisplay que nos guarda los minutos.
    private NumbreDisplay minutos;
     // Objetoque nos da las horas y los minuto separados por dos puntos.
    private String almacen5c;
    
    /**
     * Constructor 1.
     */
    public ClockDisplay()
    {
        horas = new NumbreDisplay(24);
        minutos = new NumbreDisplay(60);
        updateAlmacen5c();
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
        updateAlmacen5c();
    }
    
    public void setTime(int hNew, int mNew)
    {
        horas.setValue(hNew);
        minutos.setValue(mNew);
        updateAlmacen5c();
    }
    
    public String getTime()
    {
       return almacen5c; 
    }

    public void timeTick()
    {
        minutos. increment();
        if(minutos.getValue() == 0)
        {
            horas.increment();
            
        }
    }
    
    private void updateAlmacen5c()
    {
        if(horas.getValue() > 12)
       {
           int nuevasHoras;
           nuevasHoras = horas.getValue() - 12;
           almacen5c = nuevasHoras + ":" + minutos.getDisplayValue() + "pm"; 
       }
       else if(horas.getValue() == 12)
       {
           almacen5c = horas.getDisplayValue() + ":" + minutos.getDisplayValue() + "pm";
       }
       else if(horas.getValue() == 0)
       {
           int nuevasHoras;
           nuevasHoras = 12;
           almacen5c = nuevasHoras + ":" + minutos.getDisplayValue() + "am";
       }
       else
       {
           almacen5c = horas.getDisplayValue() + ":" + minutos.getDisplayValue() + "am"; 
       }
    }
    
   

}         
   
    

   
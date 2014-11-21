
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
    
    private NumbreDisplay mes;
    
    private NumbreDisplay dia;
    
    private NumbreDisplay año;
    
    private String newFecha;
    
    /**
     * Constructor 1.
     */
    public ClockDisplay()
    {
        horas = new NumbreDisplay(24);
        minutos = new NumbreDisplay(60);
        dia = new NumbreDisplay(31);
        mes = new NumbreDisplay(13);
        año = new NumbreDisplay(100);
        updateAlmacen5c();
        calendario();
        
    }
    
    /**
     * Constructor 2.
     */
    public ClockDisplay( int newHoras, int newMinutos, int adia, int ames, int aaño)
    {
        horas = new NumbreDisplay(24);
        minutos = new NumbreDisplay(60);
        horas.setValue(newHoras);
        minutos.setValue(newMinutos);
        dia = new NumbreDisplay(31);
        mes = new NumbreDisplay(13);
        año = new NumbreDisplay(100);
        dia.setValue(adia);
        mes.setValue(ames);
        año.setValue(aaño);
        updateAlmacen5c();
        calendario();
    }
    
    public void setTime(int hNew, int mNew, int bdia, int bmes, int baño)
    {
        horas.setValue(hNew);
        minutos.setValue(mNew);
        dia.setValue(bdia);
        mes.setValue(bmes);
        año.setValue(baño);
        updateAlmacen5c();
        calendario();
    }
    
    public String getTime()
    {
        return almacen5c + " " + newFecha;
    }

    public void timeTick()
    {
        minutos. increment();
        if(minutos.getValue() == 0)
        {
            horas.increment();
            
            if(horas.getValue() == 00)
            {
                dia.increment();
            
                if(dia.getValue() == 00)
                {
                    dia.increment();
                    mes.increment();
                    
                    if(mes.getValue() == 00)
                    {
                        mes.increment();
                        año.increment();
                    }
                }
            }
            updateAlmacen5c();
            calendario();
        }
        
    }
    
    private void updateAlmacen5c()
    {
       if(horas.getValue() > 12)
       {
           int nuevasHoras;
           nuevasHoras = horas.getValue() - 12;
           if((horas.getValue() - 12) < 10)
           {
               almacen5c = "0" + nuevasHoras + ":" + minutos.getDisplayValue() + " pm ";
           }
           else
           {
               almacen5c = nuevasHoras + ":" + minutos.getDisplayValue() + " pm ";
           }
       }
       else if(horas.getValue() == 12)
       {
           almacen5c = horas.getDisplayValue() + ":" + minutos.getDisplayValue() + " pm ";
       }
       else if(horas.getValue() == 0)
       {
           int nuevasHoras;
           nuevasHoras = 12;
           almacen5c = nuevasHoras + ":" + minutos.getDisplayValue() + " am ";
       }
       else
       {
            almacen5c = horas.getDisplayValue() + ":" + minutos.getDisplayValue() + " pm ";
       }
    }
    
    private void calendario()
    {
        newFecha = dia.getDisplayValue() + "/" + mes.getDisplayValue() + "/" + año.getDisplayValue();
    }
    
   

}         
   
    

   
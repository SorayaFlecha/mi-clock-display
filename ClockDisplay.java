
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
    
    private int mes;
    
    private int dia;
    
    private int año;
    
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
    public ClockDisplay( int newHoras, int newMinutos, int adia, int ames, int aaño)
    {
        horas = new NumbreDisplay(24);
        minutos = new NumbreDisplay(60);
        horas.setValue(newHoras);
        minutos.setValue(newMinutos);
     
        if(adia > 0 && adia <=30)
        {
            dia = adia;
        }
        else
        {
            System.out.println("El dato debe de estar entre 0 y 30");
        }
        if(ames >= 1 && ames <=12)
        {
            mes = ames;
        }
        else
        {
            System.out.println("El dato debe de estar entre 1 y 12");
        }
        año = aaño;
        updateAlmacen5c();
    }
    
    public void setTime(int hNew, int mNew, int adia, int ames, int aaño)
    {
        horas.setValue(hNew);
        minutos.setValue(mNew);
        
        if(adia > 0 && adia <=30)
        {
            dia = adia;
        }
        else
        {
            System.out.println("El dato debe de estar entre 0 y 30");
        }
        if(ames >= 1 && ames <= 12)
        {
            mes = ames;
        }
        else
        {
            System.out.println("El dato debe de estar entre 1 y 12");
        }
        año = aaño;
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
            dia = dia + 1;
            if(dia > 30)
            {
                mes = mes + 1;
                dia = 1;
            }
            else
                if(mes > 12)
                {
                    año = año + 1;
                    mes = 1;
                }
            
        }
    }
    
    private void updateAlmacen5c()
    {
       if(horas.getValue() > 12)
       {
           int nuevasHoras;
           nuevasHoras = horas.getValue() - 12;
           almacen5c = nuevasHoras + ":" + minutos.getDisplayValue() + " pm " + dia + "/" + mes + "/" + año; 
       }
       else if(horas.getValue() == 12)
       {
           almacen5c = horas.getDisplayValue() + ":" + minutos.getDisplayValue() + " pm " + dia + "/" + mes + "/" + año;
       }
       else if(horas.getValue() == 0)
       {
           int nuevasHoras;
           nuevasHoras = 12;
           almacen5c = nuevasHoras + ":" + minutos.getDisplayValue() + " am " + dia + "/" + mes + "/" + año;
       }
       else
       {
           almacen5c = horas.getDisplayValue() + ":" + minutos.getDisplayValue() + " am " + dia + "/" + mes + "/" + año; 
       }
    }
    
   

}         
   
    

   
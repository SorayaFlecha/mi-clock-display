
/**
 * Write a description of class ClockDispley here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDispley
{
    // instance variables - replace the example below with your own
    private int horas;
    
    private int minutos;
    
   
    
    
   /**
     * Metodo que nos devuelve en una cadena de caracteres la hor ay los minutos.
     * 
    */
   //public  ClockDispley()
   //{    
       // horas =  0;
        //minutos = 0;
   //}
    
    
    /**
     * Metodo que nos devuelve en una cadena de caracteres la hor ay los minutos.
     * 
    */
   public void setTime(int hora, int minuto)
   {    
       if(hora < 24 && hora >= 0)
       {
           horas =  hora;
       }
       else
       {
           System.out.println("Hora debe ser menor a 24");
       }
        
       if(minuto < 60 && minuto >= 0)
       {
           minutos = minuto;
       }
       else
       {
           System.out.println("Los minutos deben ser menor a 60");
       }
       
   }
   
    /**
     * Metodo que nos devuelve la hora y los minutos.
     * 
    */
   public String getTime()
   { 
     String menor = "";        
     if (horas < 10)
     {
          menor = "0" + horas;
     }
     else
     {
          menor = "" + horas;
     }
     
     menor = menor + ":";
     
     if (minutos < 10)
     {
          menor = menor + "0" + minutos;
     }
     else
     {
          menor = menor + minutos;
     }
     
     return menor;
   }
   
   /**
     * Metodo que suma 1 a los minutos siempre y cuando no excedean de 60
   */
  
   public void timeTick()
   {    
      if(minutos < 59)
       {
           minutos =  minutos + 1;
       }
       else
       {
           minutos = 0;
           if(horas < 23)
           {
               horas = horas + 1;
            }
           else
           {
               horas = 0;
           }    
       }
   }
    
}

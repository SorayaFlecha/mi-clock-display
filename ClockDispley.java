
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
   public void setTime(int hora, int minuto)
   {    
       if(hora<24 && minuto<60)
       {
           horas =  hora;
           minutos = minuto;
       }
       
   }
   
    /**
     * Metodo que nos devuelve la hora y los minutos.
     * 
    */
   public String getTime()
   { 
     String menor;        
     if (horas > 10)
     {
          menor = "0" + horas;
     }
     else
     {
          menor = "" + horas;
     }
     if (minutos > 10)
     {
          menor = "0" + minutos;
     }
     else
     {
          menor = "" + minutos;
     }
     
     return horas + ":" + minutos;
   }
   
   /**
     * Metodo que suma 1 a los minutos siempre y cuando no excedean de 60
   */
  
   public void timeTick()
   {    
      if(minutos <= 58)
       {
           minutos =  minutos + 1;
       }
       else
       {
           minutos = 0;
           
       }
   }
    
}

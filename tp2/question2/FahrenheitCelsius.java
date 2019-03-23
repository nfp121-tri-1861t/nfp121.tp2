package question2;


/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entr�e de cette application, 
      * dont le commentaire est � compl�ter
      *
      *  @param args ...
      */
     public static void main(String[] args){
       try{
           
          for(int i=0;i<args.length;i++){
              System.out.println(args[i] + "\u00B0F -> " + fahrenheitEnCelsius((Integer.parseInt(args[i])))+ "\u00B0C");   
            }
        
      
       }catch(NumberFormatException nfe){
           System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
       }
       
     }
     
     
     /** 
      * la m�thode � compl�ter. 
      *   @param f la valeur en degr� Fahrenheit
      *   @return  la conversion en degr� Celsius
      */
     public static float fahrenheitEnCelsius( int f){
       float resultat,r;  
       resultat = ((f - 32) * 5) / 9f;          
       r=(float)((int)( resultat *10f ))/10f;
       
       return r;
     
     }

}

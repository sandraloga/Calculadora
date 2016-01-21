
/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculadora
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Calculadora
     */
    public Calculadora()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void multipesOfFive()
    {
        int cinco;
        cinco=5;
        int cont;
        cont=3;
        int resul;
        resul=10;
       while (resul <90)
       {   
            resul=cont*cinco;
            System.out.println(resul);
            cont=cont+1;
          
        }
        
    }
    public void sumValues()
    {
       
        int cont;
        cont=1;
        int resul;
        resul=0;
        while (cont<11)
        {
         resul=resul+cont;
         cont=cont+1;
        }
        System.out.println("La suma de los umeros comrendidos entre 0 y 10(incluidos) es: "+resul);
    }
    public void sumValuesInterval(int a, int b)
    {
     int resul;
     resul = 0;
     int rango;
     rango=b+1;
     int cont;
     cont=a;
     
        while (cont<(b+1))
        {
        resul=resul+cont;
        cont++;
        }
         System.out.println("La suma de los umeros comrendidos entre " + a + " y " +b + " es : "+resul);
    }
}

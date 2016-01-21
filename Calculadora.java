
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
        int num;
        int cont;
        num=0;
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
}

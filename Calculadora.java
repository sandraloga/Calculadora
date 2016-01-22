
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
     * Metodo que suma los numeros multiplos de 5 entre 10 y 95 (No incluidos)
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
    /**
     * Metodo que suma los valores comprendidos entre 0 y 10 (incluidos)
     */
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
        System.out.println("La suma de los numeros comprendidos entre 0 y 10(incluidos) es: "+resul);
    }
    /**
     * metodo que suma lo valores que hay entre dos numeros dados (ellos inncluidos),
     * comprueba que que sean positivos y si a es mayor que b , intercambia sus valores
     */
    public int sumValuesInterval(int a, int b)
    {
        int resul;
        //resul = 0;
        //int aux;
       //aux=0;
        //int cont;
        //cont=a;
        
        //Faltaria la comprobaciom del numero valido y return-1
        if (a >=0 && b>=0)
        {
            if (a>b)
            {
                int aux =a;
                a= b;
                b = aux;
            }
            resul=a;
            while (a<b)
            {
                a++;
                resul=resul+a;
            }
           
        }
        else
        {
               System.out.println("Debe meter un numero positivo!!!");
               resul= -1;
        }
       return resul;
    }
    
    /**
     * realizar multiplicaciones entre enteros positivo
     */
    
    public int multiplica (int a, int b)
    
    {
           int resul=0;
           int cont=1;
           
           if (a<=0 && b>=0)
           {
               resul=-1;
               System.out.print ("Error");
            }
            else
            {
                while (cont!=b+1)
                {
                resul=resul+a;
                cont++;
                }
           }
           return resul;
    }
    /**
     * Metodo que devuelva verdadero si el parámetro `n` es primo o falso en caso contrario.
     * Se comprueba que el parámetro es mayor que 1; en caso contrario se informa por pantalla del error y se devuelve `false`
     */
    public boolean isPrime (int num)
    {
       
        int divisor;
        divisor = 2;
        boolean primo;
        primo=true;
        if (num<=1)
        {
           

           primo= false;
           System.out.println ("ERROR!!!!!!! El numero debe ser mayor de 1");
        }
        else {
            while (divisor<=num-1 && primo==true)
            {
                if (num % divisor == 0)
                {
                   primo = false;
                }
                divisor++;
            }
        }
        
        return primo;
    }
    
}

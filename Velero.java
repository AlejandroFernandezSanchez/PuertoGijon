
/**
 * Write a description of class Velero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Velero extends Barco
{
    // instance variables - replace the example below with your own
    private int numeroDeMastiles;    

    /**
     * Constructor for objects of class Velero
     */
    public Velero(float eslora, String matricula, int anoFabricacion, int numeroDeMastiles)
    {
        super(eslora, matricula, anoFabricacion);
        this.numeroDeMastiles=numeroDeMastiles;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
   public int coeficienteBernua()
    {
        return numeroDeMastiles;
    }
    
     public String toString()

    {
        return super.toString() + "\nTipo: Velero --> Nº de Mástiles: " + numeroDeMastiles;
    }
}

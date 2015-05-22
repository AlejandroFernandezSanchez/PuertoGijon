
/**

/**
 * Write a description of class Velero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmbarcacionAMotor extends Barco
{
    // instance variables - replace the example below with your own
    private int potencia;    

    /**
     * Constructor for objects of class Velero
     */
    public EmbarcacionAMotor(float eslora, String matricula, int anoFabricacion, int potencia)
    {
        super(eslora, matricula, anoFabricacion);
        this.potencia=potencia;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int coeficienteBernua()
    {
        return potencia;
    }

    public String toString()

    {
        return super.toString() + "\nTipo: Embarcación a Motor --> Potencia: " + potencia;
    }
}

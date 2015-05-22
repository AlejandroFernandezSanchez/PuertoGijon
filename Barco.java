
/**
 * Write a description of class Barco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Barco
{
    // instance variables - replace the example below with your own
    private int anoFabricacion;
    private float eslora;
    private String matricula;

    /**
     * Constructor for objects of class Barco
     */
    public Barco(float eslora, String matricula, int anoFabricacion)
    {
        this.anoFabricacion=anoFabricacion;
        this.matricula=matricula;
        this.anoFabricacion=anoFabricacion;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int coeficienteBernua()
    {
        return -1;
    }
    
    public float getEslora()
    {
        return eslora;
    }
    
    public String toString()
    {
        return "Barco: \nAño de fabricación: " + anoFabricacion + "\n Eslora: " +eslora + "\nMatricula: "+matricula;
    }
}

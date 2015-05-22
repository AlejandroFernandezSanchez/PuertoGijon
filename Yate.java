
public class Yate extends EmbarcacionAMotor
{
    // instance variables - replace the example below with your own
    private int numeroCamarotes;    

    /**
     * Constructor for objects of class Velero
     */
    public Yate(float eslora, String matricula, int anoFabricacion, int potencia, int numeroCamarotes)
    {
        super(eslora, matricula, anoFabricacion, potencia);
        this.numeroCamarotes=numeroCamarotes;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
   public int coeficienteBernua()
    {        
        return super.coeficienteBernua()+numeroCamarotes;
    }
    
    public String toString()

    {
        return super.toString() + "\nSubtipo: Yate --> Nº de Camarotes: " + numeroCamarotes;
    }
}
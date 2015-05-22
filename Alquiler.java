
/**
 * Write a description of class Alquiler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alquiler
{
    // instance variables - replace the example below with your own
    private Barco barco;
    private Cliente cliente;
    private int numeroDeDias;
    private static final float VALOR_METROS_DE_ESLORA = 10f;
    private static final float COEFICIENTE_EN_EUROS= 300f;

    /**
     * Constructor for objects of class Alquiler
     */
    public Alquiler(Cliente cliente, Barco barco, int numeroDeDias)
    {
        this.numeroDeDias=numeroDeDias;
        this.cliente=cliente;
        this.barco=barco;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public float getCoste()
    {        
        return numeroDeDias+(VALOR_METROS_DE_ESLORA*barco.getEslora())+ COEFICIENTE_EN_EUROS* (float) barco.coeficienteBernua();
    }
    
    public String toString()
    {
        return cliente.toString()+ "\n" + barco.toString() + "\n Días de alquiler: " + numeroDeDias + "\n Coste total: "+ getCoste();
    }
}


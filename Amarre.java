
/**
 * Write a description of class Amarre here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Amarre
{
    // instance variables - replace the example below with your own
    private Alquiler alquiler;
    private int posicion;    

    /**
     * Constructor for objects of class Amarre
     */
    public Amarre(int posicion)
    {
        this.posicion=posicion;
        this.alquiler = null;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void desocupar()
    {
        alquiler=null;
    }

    public void ocupar(Alquiler alquiler)
    {
        this.alquiler=alquiler;
    }

    public boolean disponible()
    {
        return alquiler == null;
    }

    public float precioAlquilerActual()
    {
        float coste;
        if (alquiler == null)
        {
            coste = -1;
        }
        else
        {
            coste = alquiler.getCoste();
        }
        return coste;
    }

    public String toString()
    {
        String string = "";
        if (alquiler!=null)

            string+= alquiler.toString();  
        else
            string+= "No hay ningún alquiler en este amarre";
        return string;        
    }
}

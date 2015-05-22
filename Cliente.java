
/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente
{
    // instance variables - replace the example below with your own
    private String dni;
    private String nombre;

    /**
     * Constructor for objects of class Cliente
     */
    public Cliente(String nombre, String dni)
    
    {
        this.nombre=nombre;
        this.dni=dni;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     * 
     */
    @Override
    public String toString()
    {
        return "Nombre de Cliente: " + nombre + "\tDNI: " +dni;
    }
}

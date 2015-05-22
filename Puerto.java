import java.util.ArrayList;
/**
 * Write a description of class Puerto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puerto
{
    // instance variables - replace the example below with your own
    private ArrayList<Amarre> amarres;

    /**
     * Constructor for objects of class Puerto
     */
    public Puerto(int numeroDeAmarres)
    {
        // initialise instance variables
        amarres = new ArrayList<>();
        for (int i = 0; i<numeroDeAmarres; i++)
        {
            amarres.add(new Amarre(i));
        }            
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void alquilar(Cliente cliente, Barco barco, int numeroDeDias)
    {
        Alquiler alquiler = new Alquiler(cliente, barco, numeroDeDias);
        if(posicionPrimerAmarreLibre()!=-1)
        {
            amarres.get(posicionPrimerAmarreLibre()).ocupar(alquiler);            
        }        
    }

    public boolean hayAmarresLibres()
    {
        boolean hayLibres = true;
        if (posicionPrimerAmarreLibre()==-1)
        {
            hayLibres=false;
        }
        return hayLibres;
    }

    public void liquidarAmarre(int numeroAmarre)
    {
        amarres.get(numeroAmarre).desocupar();
    }

    public int posicionPrimerAmarreLibre()
    {
        int cont = 0;
        boolean found = false;
        Amarre amarre = null;
        do {
            amarre = amarres.get(cont);
            if(amarre.disponible())
                found=true; 
            else
                cont++;
        }while(found==false && cont<amarres.size());
        if(found==false && cont==amarres.size())
            cont=-1;
        return cont;
    }

    public void mostrarEstado()
    {

        Amarre amarre = null;
        for (int i = 0; i<amarres.size(); i++)
        {
            amarre = amarres.get(i);
            if (amarre.disponible())
            {
                System.out.println("\nEl amarre " + i +" está disponible");                
                System.out.println("---------------------------------------------------------\n");
            }
            else
            {
                System.out.println("El amarre " + i +" no está disponible:");
                System.out.println("\n" + amarre.toString());
                System.out.println("---------------------------------------------------------\n");
            }
        }
    }
}

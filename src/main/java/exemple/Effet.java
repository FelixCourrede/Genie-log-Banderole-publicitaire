package exemple;
import bandeau.Bandeau;
public abstract class Effet {
    protected int idEffet;
    
    public Effet(int i){
        idEffet=i;
    }
    public abstract void effectuer();
}

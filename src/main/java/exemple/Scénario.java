package exemple;
 import java.util.ArrayList;
 import bandeau.Bandeau;

public class Scénario {
    ArrayList<Effet> T = new ArrayList<Effet>();
    Bandeau B;
    public Scénario(Bandeau Ba){
        B=Ba;
    }

    public void ajouterEffet(Effet E){T.add(E);}

    public void lancer(){
        for (Effet k : this.T){
            k.effectuer();
        }
        B.sleep(2000);
        B.close();
    }
}

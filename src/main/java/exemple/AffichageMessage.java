package exemple;

import bandeau.Bandeau;

public class AffichageMessage extends Effet{
    String texte;
    int taille;
    public AffichageMessage(int i, String t){
        super(i);
        texte=t;
    }
    public void AfficherMessage(Bandeau B){
        B.setMessage(texte);
    }
}
package exemple;

import bandeau.Bandeau;

public class AffichageMessage extends Effet{
    protected String texte;
    protected int taille;
    Bandeau B;
    public AffichageMessage(int i, String t, Bandeau Ba){
        super(i);
        texte=t;
        B=Ba;
    }
    public void effectuer(){B.setMessage(texte);}
}
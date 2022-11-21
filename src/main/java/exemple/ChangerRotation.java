package exemple;

import bandeau.Bandeau;

class ChangerRotation extends Effet{
    SensRotat sens=SensRotat.Horaire;
    float degres=0.0f;

    public ChangerRotation(int i, int d){
        super(i);
        degres=d;
    }
    public ChangerRotation(int i, SensRotat s, int d){
        this(i, d);
        sens=s;
    }
    enum SensRotat {Horaire, AntiHoraire;}
    public void rotater(Bandeau B){
        if (sens==SensRotat.Horaire){
            B.setRotation(degres);
        }
        else{
            B.setRotation(-1*degres);
        }
    }
}
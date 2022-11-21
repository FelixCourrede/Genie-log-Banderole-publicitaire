package exemple;

import bandeau.Bandeau;

class Tournicoti extends Effet{
    protected SensRotat sens=SensRotat.Horaire;
    protected float degres=0.0f;
    Bandeau B;

    public Tournicoti(int i, Bandeau Ba){
        super(i);
        B=Ba;
    }
    public Tournicoti(int i, SensRotat s, Bandeau Ba){
        this(i, Ba);;
        sens=s;
    }
    enum SensRotat {Horaire, AntiHoraire;}
    public void effectuer(){
        if (sens==SensRotat.Horaire){
            for (int i=0; i<101; i++){
                double k=i;
                this.B.setRotation((k/100)*2*(Math.PI));
                this.B.sleep(1);
            }
        }
        else{
            for (int i=0; i<100; i++){
                double k=i;
                this.B.setRotation(-(k/100)*2*(Math.PI));
                this.B.sleep(1);

             }
        }
    }
}
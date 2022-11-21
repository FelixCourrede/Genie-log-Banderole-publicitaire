package exemple;
import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;

public class Clignoter extends Effet {
    Bandeau B;
    public Clignoter(int i, Bandeau Ba){
        super(i);
        B=Ba;
    }

    public void effectuer(){
        Color C= B.getForeground();
        Color Y= B.getBackground();
        for (int k=0; k<=20; k++){
            B.setForeground(Y);
            B.sleep(50);
            B.setForeground(C);
            B.sleep(50);
        }
    }
    
}

package exemple;
import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;

public class ChangerTheme extends Effet {
    Color avant;
    Color fond;
    Bandeau B;
    public ChangerTheme(int i, Color a, Color b, Bandeau Ba){
        super(i);
        avant=a;
        fond=b;
        B=Ba;
    }
    public void effectuer(){B.setBackground(fond);B.setForeground(avant);}
}

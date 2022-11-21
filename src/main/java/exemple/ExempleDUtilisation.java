package exemple;

import bandeau.Bandeau;
import exemple.Tournicoti.SensRotat;

import java.awt.Color;
import java.awt.Font;

public class ExempleDUtilisation {

    public static void main(String[] args) {
 
        new ExempleDUtilisation().exemple();
    }

    public void exemple() {
        Bandeau monBandeau = new Bandeau();
        Tournicoti C= new Tournicoti(1, monBandeau);
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();

        monBandeau.setMessage("Hello");
        monBandeau.sleep(1000);
        AffichageMessage A = new AffichageMessage(2, "Tournicoti", monBandeau);
        AffichageMessage W = new AffichageMessage(23,"Tournicota", monBandeau);
        monBandeau.sleep(100);
        ChangerTheme T = new ChangerTheme(3, Color.blue, Color.ORANGE, monBandeau);
        ChangerTheme K = new ChangerTheme(45,Color.DARK_GRAY, Color.red, monBandeau);
        Scénario S = new Scénario(monBandeau);
        Clignoter R = new Clignoter(6, monBandeau);
        Clignoter fin = new Clignoter(65, monBandeau);
        Tournicoti L= new Tournicoti(1, SensRotat.AntiHoraire, monBandeau);
        S.ajouterEffet(A);
        S.ajouterEffet(C);
        S.ajouterEffet(T);
        S.ajouterEffet(R);
        S.ajouterEffet(W);
        S.ajouterEffet(L);
        S.ajouterEffet(K);
        S.ajouterEffet(fin);
        S.lancer();
        monBandeau.close();
    }
}
        /*monBandeau.setMessage("On va changer de police");
        monBandeau.sleep(1000);
        monBandeau.setMessage("Monospaced 15 Bold");
        monBandeau.setFont(new Font("Monospaced", Font.BOLD, 15));
        monBandeau.sleep(1000);
        monBandeau.setMessage("SansSerif 15");
        monBandeau.setFont(new Font("SansSerif", Font.PLAIN, 15));
        monBandeau.sleep(1000);
        monBandeau.setMessage("On va zoomer");
        monBandeau.sleep(1000);
        monBandeau.setMessage("Zoom........");
        for (int i = 5; i < 60; i += 5) {
            monBandeau.setFont(new Font("Dialog", Font.BOLD, 5 + i));
            monBandeau.sleep(100);
        }
        monBandeau.sleep(1000);

        monBandeau.setFont(new Font("Courier new", Font.PLAIN, 15));
        monBandeau.setMessage("On va tourner");
        monBandeau.sleep(1000);
        monBandeau.setMessage("On tourne de 45°...");
        monBandeau.setRotation(Math.PI / 2.0f);
        monBandeau.sleep(1000);
        monBandeau.setRotation(0.0f);
        monBandeau.close();
    }
}*/
/*
        monBandeau.setMessage("On va changer de couleur de fond");
        monBandeau.sleep(1000);
        monBandeau.setBackground(Color.DARK_GRAY);
        monBandeau.setMessage("On va changer de couleur");
        monBandeau.sleep(1000);
        monBandeau.setForeground(Color.YELLOW);
        monBandeau.sleep(1000);
        monBandeau.setFont(font);
        monBandeau.setForeground(fore);
        monBandeau.setBackground(back);
        monBandeau.setMessage("Terminé");
        monBandeau.sleep(3000);
        monBandeau.close();
    }
}*/
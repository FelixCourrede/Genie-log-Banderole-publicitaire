package exemple;
class ChangerRotation extends Effet{
    String sens;
    float degres=0.0f;

    public ChangerRotation(int i, String s, int d){
        super(i);
        sens=s;
        degres=d;
    }
    
}
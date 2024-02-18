package navetur;

public class Yate extends Embarcacion{

    private int camarotes;


    public Yate(Capitan capitan, int valor, int anioFabricacion, int eslora, int valorAdicional, int camarotes) {
        super(valor, anioFabricacion, eslora,valorAdicional);
        this.camarotes = camarotes;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }
    public String compareCamarotes(Yate yate) {
        int comparison = Integer.compare(this.camarotes, yate.camarotes);
        if (comparison == 0) {
            return "IGUALES";
        } else if (comparison > 0) {
            return "MAS LUJOSO";
        } else {
            return "MENOS LUJOSO";
        }
    }


}

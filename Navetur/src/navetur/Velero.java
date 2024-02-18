
package navetur;
public class Velero extends Embarcacion {
    private int mastiles;

    public Velero(Capitan capitan, int valor, int anioFabricacion, int eslora, int valorAdicional, int mastiles) {
        super(valor, anioFabricacion, eslora, valorAdicional);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }


    public String esGrande() {
        if (mastiles > 4) {
            return "GRANDE";
        } else {
            return "PEQUENIO";
        }
    }

}



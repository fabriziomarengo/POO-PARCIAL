package navetur;

public class Embarcacion {
    private int valor;
    private int anioFabricacion;
    private int eslora;
    private int valorAdicional;



    public Embarcacion(int valor, int anioFabricacion, int eslora, int valorAdicional) {
        this.valor = valor;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
        this.valorAdicional = valorAdicional;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(int valorAdicional) {
        this.valorAdicional = valorAdicional;
    }


    public double calcularValorAlquiler() {
        double monto = valor;
        if (anioFabricacion > 2020) {
            monto += valorAdicional;
        }
        return monto;
    }
}


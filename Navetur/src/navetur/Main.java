package navetur;

public class Main {
    public static void main(String[] args) {

        Capitan capitan = new Capitan("Juan", "Perez", "12345");

        Velero velero = new Velero(capitan, 1000, 200, 2019, 15, 3);
        System.out.println("El monto del alquiler del velero es: $" + velero.calcularValorAlquiler());
        System.out.println("¿El velero es grande? " + velero.esGrande());

        // Crear dos instancias de yate
        Yate yate1 = new Yate(capitan, 2000, 300, 2022, 20, 10);
        Yate yate2 = new Yate(capitan, 2500, 400, 2023, 25, 10);

        String resultadoComparacion = yate1.compareCamarotes(yate2);
        System.out.println(resultadoComparacion);
    }
    }






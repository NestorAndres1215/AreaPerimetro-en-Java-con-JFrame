package figura;

public class Rombo extends Figura {
    private double diagonal1;
    private double diagonal2;

    public Rombo(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    public double calcularArea() {
        return (diagonal1 * diagonal2) / 2;
    }

    @Override
    public double calcularPerimetro() {
        double lado = Math.sqrt(Math.pow(diagonal1 / 2, 2) + Math.pow(diagonal2 / 2, 2));
        return 4 * lado;
    }
}

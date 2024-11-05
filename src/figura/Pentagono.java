package figura;


public class Pentagono extends Figura {
    private double lado;

    public Pentagono(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (1.0 / 4) * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 5 * lado;
    }
}

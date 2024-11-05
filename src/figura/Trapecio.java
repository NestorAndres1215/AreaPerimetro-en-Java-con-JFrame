package figura;

public class Trapecio extends Figura {
    private double base1;
    private double base2;
    private double altura;
    private double lado1;
    private double lado2;

    public Trapecio(double base1, double base2, double altura, double lado1, double lado2) {
        this.base1 = base1;
        this.base2 = base2;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calcularArea() {
        return (base1 + base2) * altura / 2;
    }

    @Override
    public double calcularPerimetro() {
        return base1 + base2 + lado1 + lado2;
    }
}


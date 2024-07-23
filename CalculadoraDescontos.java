package src;

public class CalculadoraDescontos {

    private DescontoStrategy desconto;

    public CalculadoraDescontos(DescontoStrategy desconto) {
        this.desconto = desconto;
    }

    public double calcularDesconto(double consumo) {
        return desconto.calcularDesconto(consumo);
    }

}
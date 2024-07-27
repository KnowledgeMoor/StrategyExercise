
public class App {

    public static void main(String[] args) {
        CalculadoraDescontos calculadoraRegulares = new CalculadoraDescontos(new DescontoClienteRegular());
        CalculadoraDescontos calculadoraVip = new CalculadoraDescontos(new DescontoClienteVip());
        CalculadoraDescontos calculadoraFuncionario = new CalculadoraDescontos(new DescontoFuncionario());

        Double valorConsumoTest = 100.0;

        System.out.println("Valor final do cliente regular: " + calculadoraRegulares.calcularDesconto(valorConsumoTest));
        System.out.println("Valor final do cliente Vip: " + calculadoraVip.calcularDesconto(valorConsumoTest));
        System.out.println("Valor final do functionario: " + calculadoraFuncionario.calcularDesconto(valorConsumoTest));
    }
}

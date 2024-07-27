
public class DescontoFuncionario implements DescontoStrategy {

    @Override
    public Double calcularDesconto(double consumo) {

        return consumo * 0.30;
    }

}

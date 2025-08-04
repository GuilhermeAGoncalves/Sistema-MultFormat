package solid.relatorio;

/**
 * Implementação concreta da interface IRelatorio.
 * Interface IEnviavel para marcar a classe como um possivel para envio
 * Aplica SRP: responsabilidade única de gerar relatório financeiro.
 * Aplica OCP: aberto para extensão, pois novas classes de relatório podem ser criadas sem alterar essa.
 */
public class RelatorioFinanceiro implements IRelatorio {


    @Override
    public String gerar() {
        return "Gerando relatorio financeiro";
    }

    @Override
    public Boolean deveSerEnviado() {
        return true;
    }
}

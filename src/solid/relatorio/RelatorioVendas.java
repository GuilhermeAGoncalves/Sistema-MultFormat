package solid.relatorio;

/**
 * Implementação concreta da interface IRelatorio.
 * Aplica SRP: responsabilidade única de gerar relatório vendas.
 * Aplica OCP: aberto para extensão, pois novas classes de relatório podem ser criadas sem alterar essa.
 */
public class RelatorioVendas implements IRelatorio {

    @Override
    public String gerar() {
        return "Gerando relatorio vendas";
    }

    @Override
    public Boolean deveSerEnviado() {
        return false;
    }
}

package solid.relatorio;

/**
 * Implementação concreta da interface IRelatorio.
 * Aplica SRP: responsabilidade única de gerar relatório RH.
 * Aplica OCP: aberto para extensão, pois novas classes de relatório podem ser criadas sem alterar essa.
 */
public class RelatorioRH implements IRelatorio {
    @Override
    public String gerar() {
        return "Gerando relatório de RH";
    }

    @Override
    public Boolean deveSerEnviado() {
        return false;
    }
}

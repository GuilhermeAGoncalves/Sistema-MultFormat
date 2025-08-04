package solid.service;

import solid.formatador.IFormatador;
import solid.notificador.INotificador;
import solid.relatorio.IRelatorio;

/**
 * Classe que orquestra o processo de gerar, formatar e enviar relatório.
 * Aplica SRP (única responsabilidade), DIP (depende de abstrações), OCP (facilmente extensível),
 * LSP (as implementações das interfaces podem substituir sem quebrar) e ISP (interfaces específicas).
 */
public class RelatorioService {
    private IRelatorio relatorio;
    private IFormatador formatador;

    public RelatorioService(IRelatorio relatorio, IFormatador formatador) {
        this.relatorio = relatorio;
        this.formatador = formatador;
    }

    /**
     * Executa o fluxo completo: gerar -> formatar -> enviar.
     * Garante que o dado formatado não seja vazio, mostrando aviso em caso de erro.
     */
    public String processarRelatorio() {
        String dados = relatorio.gerar();
        String dadoFormatado = formatador.formatar(dados);
        if(dadoFormatado == null || dadoFormatado.isBlank()) {
            System.out.println("Aviso: Erro ao formatar dados");
            throw new RuntimeException("Erro ao formatar dados");
        }

        return "Relatório formatado: " + dadoFormatado;
    }

    public IRelatorio getRelatorio() {
        return relatorio;
    }
}

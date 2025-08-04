package solid.relatorio;

/**
 * Interface que define o contrato para gerar dados de relatórios.
 * Aplica DIP: abstração para que serviços dependam da interface, não da implementação.
 */
public interface IRelatorio {
    String gerar();

    Boolean deveSerEnviado();

}

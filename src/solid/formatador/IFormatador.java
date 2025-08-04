package solid.formatador;

/**
 * Interface que define contrato para formatar dados.
 * Aplica DIP e ISP: abstração e separação clara de responsabilidade.
 */
public interface IFormatador {

    String formatar(String dados);
}
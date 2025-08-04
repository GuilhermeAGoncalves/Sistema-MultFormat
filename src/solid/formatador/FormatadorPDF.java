package solid.formatador;

/**
 * Implementação concreta para formatação PDF.
 * Segue SRP e OCP.
 */
public class FormatadorPDF implements IFormatador {

    @Override
    public String formatar(String dados) {
        return "PDF: " + dados;
    }
}

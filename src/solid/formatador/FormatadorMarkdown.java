package solid.formatador;

/**
 * Implementação concreta para formatação Markdown.
 * Segue SRP e OCP.
 */
public class FormatadorMarkdown implements IFormatador {

    @Override
    public String formatar(String dados) {
        return "Markdown: " + dados;
    }
}

package solid.formatador;

public class FormatadorHTML implements IFormatador {
    @Override
    public String formatar(String dados) {
        return "HTML: " + dados;
    }
}

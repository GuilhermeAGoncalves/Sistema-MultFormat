package solid.notificador;

public class NotificadorEmail implements INotificador {
    @Override
    public String enviar(String dadoFormatado) {
        return "Enviando email: " + dadoFormatado;
    }
}

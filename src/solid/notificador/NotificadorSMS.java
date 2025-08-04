package solid.notificador;

/**
 * Implementação concreta para notificação via SMS.
 * Segue SRP e OCP.
 */
public class NotificadorSMS implements  INotificador {
    @Override
    public String enviar(String dadoFormatado) {
        return "Enviando SMS: " + dadoFormatado;
    }
}

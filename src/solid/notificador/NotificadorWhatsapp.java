package solid.notificador;

/**
 * Implementação concreta para notificação via Whatsapp.
 * Segue SRP e OCP.
 */
public class NotificadorWhatsapp implements INotificador {

    @Override
    public String enviar(String dadoFormatado) {
        return "Enviando Whatsapp: " + dadoFormatado;
    }
}

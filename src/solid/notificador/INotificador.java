package solid.notificador;

/**
 * Interface para envio de notificações.
 * Aplica DIP e ISP.
 */
public interface INotificador {

    String enviar(String dadoFormatado);
}

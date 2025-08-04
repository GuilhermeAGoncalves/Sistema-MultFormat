package solid.service;

import solid.notificador.INotificador;

public class RelatorioServiceSender {
    private RelatorioService relatorioService;
    private INotificador notificador;

    public RelatorioServiceSender(RelatorioService relatorioService, INotificador notificador) {
        this.relatorioService = relatorioService;
        this.notificador = notificador;
    }

    public void execultarEnvio() {
        if (relatorioService.getRelatorio().deveSerEnviado()) {
            System.out.println(notificador.enviar(relatorioService.processarRelatorio()));
        } else {
            System.out.println(relatorioService.processarRelatorio());
        }
    }
}

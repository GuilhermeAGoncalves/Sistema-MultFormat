package solid.app;

import solid.formatador.FormatadorHTML;
import solid.formatador.FormatadorPDF;
import solid.notificador.NotificadorEmail;
import solid.notificador.NotificadorSMS;
import solid.notificador.NotificadorWhatsapp;
import solid.relatorio.RelatorioFinanceiro;
import solid.relatorio.RelatorioRH;
import solid.service.RelatorioService;
import solid.service.RelatorioServiceSender;

public class Main {
    /**
     * Classe principal que inicializa o sistema.
     * Demonstra a injeção de dependências para garantir modularidade e flexibilidade.
     */
    public static void main(String[] args) {
        RelatorioService relatorioService = new RelatorioService(
                new RelatorioFinanceiro(),
                new FormatadorPDF());

        relatorioService.processarRelatorio();

        RelatorioServiceSender relatorioServiceSender = new RelatorioServiceSender(
                relatorioService,
                new NotificadorWhatsapp());
        relatorioServiceSender.execultarEnvio();


        RelatorioService relatorioService2 = new RelatorioService(
                new RelatorioRH(),
                new FormatadorHTML());

        relatorioService2.processarRelatorio();

        RelatorioServiceSender relatorioServiceSender2 = new RelatorioServiceSender(
                relatorioService2,
                new NotificadorWhatsapp());
        relatorioServiceSender2.execultarEnvio();
    }
}

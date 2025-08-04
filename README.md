# Projeto SOLID - Sistema Modular de Geração, Formatação e Envio de Relatórios

## Visão Geral

Este projeto exemplifica a aplicação dos princípios SOLID na arquitetura de um sistema para geração, formatação e envio de relatórios. O design modular e orientado a interfaces promove extensibilidade, manutenção e reutilização de código, facilitando a evolução do sistema.

---

## Estrutura do Projeto

- **solid.relatorio**  
  Contém as interfaces e implementações concretas dos relatórios (`IRelatorio`), que geram dados e definem se devem ser enviados (`deveSerEnviado()`).

- **solid.formatador**  
  Define a interface `IFormatador` e suas implementações para formatar os dados do relatório em diferentes formatos (PDF, HTML, Markdown etc).

- **solid.notificador**  
  Interface `INotificador` para envio das informações formatadas, com implementações para SMS, Email, WhatsApp, entre outros.

- **solid.service**  
  Serviços que orquestram a geração, formatação e envio dos relatórios (`RelatorioService` e `RelatorioServiceSender`), aplicando os princípios SRP, DIP, OCP e LSP.

- **solid.app**  
  Ponto de entrada do sistema, onde as dependências são injetadas e o fluxo é executado.

---

## Princípios SOLID Aplicados

- **SRP (Single Responsibility Principle):** Cada classe tem uma única responsabilidade (gerar, formatar, enviar).
- **OCP (Open/Closed Principle):** O sistema é aberto para extensão (novos relatórios, formatos, notificadores) e fechado para modificação.
- **LSP (Liskov Substitution Principle):** As classes concretas podem ser usadas no lugar das abstrações sem quebrar o sistema.
- **ISP (Interface Segregation Principle):** Interfaces específicas e coesas evitam métodos desnecessários.
- **DIP (Dependency Inversion Principle):** Serviços dependem de abstrações, não de implementações concretas.

---

## Fluxo de Processamento

1. **Geração:** O relatório gera os dados via `IRelatorio.gerar()`.
2. **Formatação:** Os dados são formatados pelo `IFormatador` selecionado.
3. **Envio Condicional:** O serviço de envio (`RelatorioServiceSender`) verifica, via polimorfismo (`deveSerEnviado()`), se o relatório deve ser enviado, e encaminha para o `INotificador` correspondente.

---

## Como Executar

1. Configure as dependências no `Main.java` no pacote `solid.app`.
2. Instancie os relatórios, formatadores e notificadores desejados.
3. Use `RelatorioService` para gerar e formatar.
4. Use `RelatorioServiceSender` para condicionalmente enviar os relatórios.

---

## Próximos Passos

- Implementar pipeline modular para encadear múltiplas etapas (salvar, auditar, assinar digitalmente).
- Adicionar novos formatos e canais de notificação.
- Aplicar testes unitários para garantir robustez.

---

## Contato

Para dúvidas ou sugestões, favor contatar Guilherme Araújo.

---

**Projeto desenvolvido com foco em boas práticas de design orientado a objetos e padrões de arquitetura limpa.**

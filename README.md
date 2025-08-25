# CP4 - Teste Unitário com TDD (Apdex)

Este projeto foi desenvolvido como parte da Checkpoint 4 da matéria de "Compliance & Quality Assurance" da FIAP.

O objetivo principal foi aplicar os conceitos de **Test-Driven Development (TDD)** e **testes unitários** para desenvolver e validar uma classe em Java que calcula o índice de performance Apdex. 
## O Que Foi Feito

1.  **RED**: Foi escrito um teste unitário para uma funcionalidade que ainda não existia, fazendo o teste falhar. 
2.  **GREEN**: Foi implementado o código mais simples possível na classe `Apdex` para fazer o teste passar. 
3.  **REFACTOR**: O código de produção e de teste foi refatorado para melhorar a qualidade e remover duplicações, garantindo que todos os testes continuassem passando.

### Critérios Atendidos

- O projeto foi construído em **Java 17** e gerenciado com **Maven**.
- Todos os testes unitários foram escritos com **JUnit 5**.
- Foram criados testes para cobrir **todas as classificações do Apdex**: Excelente, Bom, Razoável, Ruim e Inaceitável. 
- O número de RM do aluno foi utilizado como o **Total de Amostras** nos cálculos.
- A anotação `@BeforeEach` foi utilizada para preparar o ambiente de teste e evitar repetição de código. 
- Todos os testes passam com sucesso.

## Desenvolvedor

- **Nome Completo:** Arthur Bispo de lima
- **RM:** 557568
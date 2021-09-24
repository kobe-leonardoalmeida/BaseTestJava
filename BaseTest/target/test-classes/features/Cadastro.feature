Feature: Fluxo de cadastro

  Scenario: Cadastro
    Given Abro url - e-commerce
    When Clico no botão login
    And Sigo para o fluxo de "Cadastro"
    And Preencho meus dados pessoais e concluo o cadastro
    And Confirmo email de ativação
    Then Valido ativação da conta
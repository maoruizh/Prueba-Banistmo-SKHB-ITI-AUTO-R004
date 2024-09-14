Feature: Bancolombia websites

Scenario: Accessing the Bancolombia websites
     Given I Select go to Bancolombia
     And I Select button Corporativos
     And I Select button Capital Inteligente
     And I Select button Actualidad Economica
     And I Select report OPEP
     When I Select image to download report
     Then I Validate that the PDF report is correct
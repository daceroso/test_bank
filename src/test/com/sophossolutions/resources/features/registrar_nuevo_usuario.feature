Feature: Registro de nuevo usuario


  Yo como usuario
  necesito registrarme en la pagina
  para participar en la comunidad de testers

  Scenario Outline: Simular registro de nuevo usuario

    Given "Usuario" navega a la pagina de la comunidad
    When  Agrega informacion personal para el registro
      |nombre|<nombre>|
      |apellido|<apellido>|
      |email|<email>|
      |mes|<mes>|
      |dia|<dia>|
      |ano|<ano>|
      |idioma|<idioma>|
      |ciudad|<ciudad>|
      |codigo|<codigo>|
      |pais|<pais>|
    And  completa informacion de sus dipositivos
      |computador|<computador>|
      |versionComputador|<versionComputador>|
      |idiomaComputador|<idiomaComputador>|
      |movil|<movil>|
      |movilModelo|<movilModelo>|
      |movilSistema|<movilSistema>|
      |contrasena|<contrasena>|
      |confirmar|<confirmar>|
    Then valida que el usuario es registrado
    Examples:
      |nombre|apellido|email|mes|dia|ano|idioma|ciudad|codigo|pais|computador|versionComputador|idiomaComputador|movil|movilModelo|movilSistema|contrasena|confirmar|
      |pepito|perez|exampletest@example.com|June|12|1990|Spanish|Bucaramanga|681001|Colombia|Linux|Ubuntu|English|Apple|iPhone 12|iOS 14.0.1|Danisko119**|Danisko119|
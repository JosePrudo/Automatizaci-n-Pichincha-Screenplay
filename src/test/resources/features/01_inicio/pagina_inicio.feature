# language: es
Característica: Página de inicio de Banco Pichincha
  Como cliente del banco
  Quiero ingresar al sitio web de Banco Pichincha
  Para acceder a sus productos y servicios

  @smoke @titulo
  Escenario: Ingresar a una URL indicada al inicio
    Dado que "Jose" abre la URL "https://brave-mud-0605ba20f.3.azurestaticapps.net/"
    Entonces debería ver que el título de la página contiene "SimulacionCreditoHipotecario"

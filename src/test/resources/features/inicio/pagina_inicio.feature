# language: es
Característica: Página de inicio de Banco Pichincha
  Como cliente del banco
  Quiero ingresar al sitio web de Banco Pichincha
  Para acceder a sus productos y servicios

  @smoke
  Escenario: Ingresar a la página de inicio
    Dado que "Jose" abre la página de inicio de Banco Pichincha
    Entonces debería ver que el título de la página contiene "Pichincha"

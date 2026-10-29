# language: es
Característica: Proyecto de vivienda
  Como cliente del banco
  Quiero indicar si aplico solo o en pareja
  Para simular mi crédito de vivienda

  @smoke @pareja
  Escenario: Seleccionar la opción Pareja
    Dado que "Jose" abre la URL "https://brave-mud-0605ba20f.3.azurestaticapps.net/"
    Cuando selecciona la opción "Pareja" en tipo de aplicación
    Entonces debería ver la opción "Pareja" seleccionada


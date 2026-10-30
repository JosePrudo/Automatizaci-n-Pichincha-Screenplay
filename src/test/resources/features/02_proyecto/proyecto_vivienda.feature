# language: es
Característica: Proyecto de vivienda
  Como cliente del banco
  Quiero indicar si aplico solo o en pareja
  Para simular mi crédito de vivienda

  Antecedentes:
    Dado que "Jose" se encuentra en la sección "Tu proyecto de vivienda"

  @smoke @pareja @apartamento-quito
  Escenario: Completar el proyecto de vivienda en pareja con apartamento en Quito
    Cuando selecciona la opción "Pareja" en tipo de aplicación
    Entonces debería ver la opción "Pareja" seleccionada
    Cuando selecciona el tipo de vivienda "Apartamento"
    Y selecciona la ciudad "Quito"
    Y define el rango de precio entre "50000" y "1000000"
    Y da clic en el botón Siguiente
    Entonces debería ver la sección "Tu situación financiera"


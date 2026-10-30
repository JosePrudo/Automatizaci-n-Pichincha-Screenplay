# language: es
Característica: Tus resultados
  Como cliente del banco
  Quiero revisar los resultados de mi simulación
  Para conocer mi capacidad real de crédito de vivienda

  Antecedentes:
    Dado que "Jose" se encuentra en la sección "Tus resultados"

  @smoke @tus-resultados
  Escenario: Consultar la capacidad real desde los resultados
    Cuando da clic en el botón ¿Quieres conocer tu capacidad real?
    Entonces debería ver la sección "Tu capacidad real"

# language: es
Característica: Confirmación
  Como cliente del banco
  Quiero confirmar que la información de mi simulación es correcta
  Para enviar mi solicitud de crédito de vivienda

  Antecedentes:
    Dado que "Jose" se encuentra en la sección "Confirmación"

  @smoke @confirmacion
  Escenario: Confirmar y enviar la simulación del crédito
    Cuando confirma que toda la información está correcta y completa
    Y da clic en el botón Aceptar y Enviar
    Y da clic en el botón Aceptar
    Entonces debería ver la sección "Tu proyecto de vivienda"

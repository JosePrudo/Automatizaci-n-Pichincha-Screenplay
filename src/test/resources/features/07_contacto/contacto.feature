# language: es
Característica: Quiero que me Contacten
  Como cliente del banco
  Quiero indicar cómo y cuándo prefiero ser contactado
  Para recibir la asesoría de mi crédito de vivienda

  Antecedentes:
    Dado que "Jose" se encuentra en la sección "Quiero que me Contacten"

  @smoke @contacto
  Escenario: Solicitar contacto en la mañana por WhatsApp
    Cuando selecciona el horario de contacto "Mañana"
    Y selecciona el medio de contacto "WhatsApp"
    Y acepta recibir información de otros productos del banco
    Y da clic en el botón Siguiente
    Entonces debería ver la sección "Confirmación"

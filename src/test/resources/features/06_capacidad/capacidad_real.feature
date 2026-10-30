# language: es
Característica: Tu capacidad real
  Como cliente del banco
  Quiero registrar mis datos personales y laborales
  Para conocer mi capacidad real de crédito de vivienda

  Antecedentes:
    Dado que "Jose" se encuentra en la sección "Tu capacidad real"

  @smoke @capacidad-real
  Escenario: Registrar los datos para conocer la capacidad real
    Cuando ingresa sus datos personales
      | nombre completo               | cédula     | correo        | teléfono celular |
      | Jose Prudencio Padilla Berrio | 1234567890 | swo@gmail.com | 1234567890       |
    Y autoriza la consulta de su historial crediticio
    Y indica que "1" persona depende económicamente de él
    Y ingresa la empresa "SWO" donde trabaja
    Y da clic en el botón Siguiente
    Entonces debería ver la sección "Quiero que me Contacten"

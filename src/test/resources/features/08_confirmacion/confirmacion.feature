# language: es
Característica: Confirmación
  Como cliente del banco
  Quiero confirmar que la información de mi simulación es correcta
  Para enviar mi solicitud de crédito de vivienda

  Antecedentes:
    Dado que "Jose" abre la URL "https://brave-mud-0605ba20f.3.azurestaticapps.net/"
    Y selecciona la opción "Pareja" en tipo de aplicación
    Y selecciona el tipo de vivienda "Apartamento"
    Y selecciona la ciudad "Quito"
    Y define el rango de precio entre "50000" y "1000000"
    Y da clic en el botón Siguiente
    Y selecciona la situación laboral "Empleado"
    Y ingresa ingresos netos mensuales de "500000" y un ahorro de "1000000"
    Y ingresa la fecha de nacimiento "03/08/1987"
    Y selecciona el estado civil "Casado"
    Y da clic en el botón Siguiente
    Y ingresa un monto de préstamo de "800000"
    Y selecciona un plazo de "20 años"
    Y selecciona el tipo de cuota "Fija"
    Y da clic en el botón Siguiente
    Y da clic en el botón ¿Quieres conocer tu capacidad real?
    Y ingresa sus datos personales
      | nombre completo               | cédula     | correo        | teléfono celular |
      | Jose Prudencio Padilla Berrio | 1234567890 | swo@gmail.com | 1234567890       |
    Y autoriza la consulta de su historial crediticio
    Y indica que "1" persona depende económicamente de él
    Y ingresa la empresa "SWO" donde trabaja
    Y da clic en el botón Siguiente
    Y selecciona el horario de contacto "Mañana"
    Y selecciona el medio de contacto "WhatsApp"
    Y acepta recibir información de otros productos del banco
    Y da clic en el botón Siguiente

  @smoke @confirmacion
  Escenario: Confirmar y enviar la simulación del crédito
    Cuando confirma que toda la información está correcta y completa
    Y da clic en el botón Aceptar y Enviar
    Y da clic en el botón Aceptar
    Entonces debería ver la sección "Tu proyecto de vivienda"

# language: es
Característica: Quiero que me Contacten
  Como cliente del banco
  Quiero indicar cómo y cuándo prefiero ser contactado
  Para recibir la asesoría de mi crédito de vivienda

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

  @smoke @contacto
  Escenario: Solicitar contacto en la mañana por WhatsApp
    Cuando selecciona el horario de contacto "Mañana"
    Y selecciona el medio de contacto "WhatsApp"
    Y acepta recibir información de otros productos del banco
    Y da clic en el botón Siguiente
    Entonces debería ver la sección "Confirmación"

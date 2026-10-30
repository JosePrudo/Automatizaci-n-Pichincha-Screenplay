# language: es
Característica: Tus resultados
  Como cliente del banco
  Quiero revisar los resultados de mi simulación
  Para conocer mi capacidad real de crédito de vivienda

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

  @smoke @tus-resultados
  Escenario: Consultar la capacidad real desde los resultados
    Cuando da clic en el botón ¿Quieres conocer tu capacidad real?
    Entonces debería ver la sección "Tu capacidad real"

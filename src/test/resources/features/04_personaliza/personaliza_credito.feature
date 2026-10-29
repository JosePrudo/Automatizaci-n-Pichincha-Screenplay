# language: es
Característica: Personaliza tu crédito de vivienda
  Como cliente del banco
  Quiero definir el monto, el plazo y el tipo de cuota
  Para conocer los resultados de mi crédito de vivienda

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

  @smoke @personaliza-credito
  Escenario: Personalizar un crédito de 800000 a 20 años con cuota fija
    Cuando ingresa un monto de préstamo de "800000"
    Y selecciona un plazo de "20 años"
    Y selecciona el tipo de cuota "Fija"
    Y da clic en el botón Siguiente
    Entonces debería ver la sección "Tus resultados"

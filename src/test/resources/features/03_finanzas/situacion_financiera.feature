# language: es
Característica: Situación financiera
  Como cliente del banco
  Quiero registrar mi situación financiera
  Para personalizar mi crédito de vivienda

  Antecedentes:
    Dado que "Jose" abre la URL "https://brave-mud-0605ba20f.3.azurestaticapps.net/"
    Y selecciona la opción "Pareja" en tipo de aplicación
    Y selecciona el tipo de vivienda "Apartamento"
    Y selecciona la ciudad "Quito"
    Y define el rango de precio entre "50000" y "1000000"
    Y da clic en el botón Siguiente

  @smoke @situacion-financiera
  Escenario: Completar la situación financiera como empleado casado
    Cuando selecciona la situación laboral "Empleado"
    Y ingresa ingresos netos mensuales de "500000" y un ahorro de "1000000"
    Y ingresa la fecha de nacimiento "03/08/1987"
    Y selecciona el estado civil "Casado"
    Y da clic en el botón Siguiente
    Entonces debería ver la sección "Personaliza tu crédito de vivienda"

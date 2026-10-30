# language: es
Característica: Situación financiera
  Como cliente del banco
  Quiero registrar mi situación financiera
  Para personalizar mi crédito de vivienda

  Antecedentes:
    Dado que "Jose" se encuentra en la sección "Tu situación financiera"

  @smoke @situacion-financiera
  Escenario: Completar la situación financiera como empleado casado
    Cuando selecciona la situación laboral "Empleado"
    Y ingresa ingresos netos mensuales de "500000" y un ahorro de "1000000"
    Y ingresa la fecha de nacimiento "03/08/1987"
    Y selecciona el estado civil "Casado"
    Y da clic en el botón Siguiente
    Entonces debería ver la sección "Personaliza tu crédito de vivienda"

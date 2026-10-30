# language: es
Característica: Personaliza tu crédito de vivienda
  Como cliente del banco
  Quiero definir el monto, el plazo y el tipo de cuota
  Para conocer los resultados de mi crédito de vivienda

  Antecedentes:
    Dado que "Jose" se encuentra en la sección "Personaliza tu crédito de vivienda"

  @smoke @personaliza-credito
  Escenario: Personalizar un crédito de 800000 a 20 años con cuota fija
    Cuando ingresa un monto de préstamo de "800000"
    Y selecciona un plazo de "20 años"
    Y selecciona el tipo de cuota "Fija"
    Y da clic en el botón Siguiente
    Entonces debería ver la sección "Tus resultados"

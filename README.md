# Automatizaci-n-Pichincha-Screenplay
Repositorio para practicar automatización con página de banco pichincha en Screenplay


## Ejecución

| Runner | Feature |
|---|---|
| `CucumberTestSuite` | Flujo completo: features 01 → 08 en orden, en el mismo navegador |
| `PaginaInicioRunner` | `01_inicio/pagina_inicio.feature` |
| `ProyectoViviendaRunner` | `02_proyecto/proyecto_vivienda.feature` |
| `SituacionFinancieraRunner` | `03_finanzas/situacion_financiera.feature` |
| `PersonalizaCreditoRunner` | `04_personaliza/personaliza_credito.feature` |
| `TusResultadosRunner` | `05_resultados/tus_resultados.feature` |
| `CapacidadRealRunner` | `06_capacidad/capacidad_real.feature` |
| `ContactoRunner` | `07_contacto/contacto.feature` |
| `ConfirmacionRunner` | `08_confirmacion/confirmacion.feature` |

- Flujo completo: `mvn clean verify`
- Una sección: `mvn clean verify -Dit.test=ContactoRunner`

Cada feature (02 a 08) inicia con `Dado que "Jose" se encuentra en la sección "..."`: en el flujo completo
la sección ya está visible y continúa desde ahí; al ejecutarla sola, abre el simulador y recorre las
secciones previas con los datos de `models/DatosSimulacion`.

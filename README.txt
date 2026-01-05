EJERCICIO AUTOMATIZACIÓN E2E - SAUCEDEMO

Tecnologías utilizadas:
- Java 17
- Maven 3.9.x
- Serenity BDD 3.6.12
- Selenium WebDriver (integrado en Serenity)
- IntelliJ IDEA
- Chrome (última versión)

Estructura del proyecto:
- Runners: ejecución de pruebas
- Tasks: acciones del usuario
- UI: localizadores
- Reports: generados por Serenity

Instrucciones de ejecución:
1. Abrir el proyecto en IntelliJ IDEA
2. Esperar a que Maven descargue las dependencias
3. Abrir la ventana Maven > Lifecycle
4. Ejecutar:
   - clean
   - verify
5. Abrir el reporte en:
   target/site/serenity/index.html

Flujo automatizado:
- Login con usuario estándar
- Agregar productos al carrito
- Visualizar carrito
- Completar formulario de compra
- Finalizar compra
- Validar mensaje "THANK YOU FOR YOUR ORDER"

# Serenity BDD - Prueba E2E del Flujo de Compra en SauceDemo

## Descripción
Este proyecto implementa una prueba funcional automatizada (End-to-End) del flujo de compra en [SauceDemo](https://www.saucedemo.com/), utilizando el framework Serenity BDD. La prueba abarca desde la autenticación del usuario hasta la confirmación final de la compra.

## Requisitos Previos
1. **Software Necesario**:
   - **Java Development Kit (JDK)**: Versión 11 o superior.
   - **Apache Maven**: Para la gestión de dependencias y ejecución de pruebas.
   - **Navegador Web**: Google Chrome.
   - **Git**: Para clonar el repositorio.

2. **Configuraciones**:
   - **Variables de Entorno**: Asegúrate de que las variables `JAVA_HOME` y `MAVEN_HOME` estén correctamente configuradas en tu sistema.
   - **Configuración del Navegador**: Verifica que Google Chrome esté instalado y actualizado.

## Estructura del Proyecto
- **`src/test/resources/features/`**: Contiene los archivos `.feature` escritos en Gherkin que describen los escenarios de prueba.
- **`src/test/java/stepdefinitions/`**: Incluye las definiciones de los pasos que implementan los escenarios de prueba.
- **`src/test/java/runners/`**: Contiene las clases que configuran y ejecutan las pruebas.
- **`serenity.properties`**: Archivo de configuración de Serenity BDD.

## Instrucciones de Ejecución
1. **Clonar el Repositorio**:
   ```bash
   git clone https://github.com/zuzyrobalino/serenity-saucedemo.git
2. **Ir al directorio del proyecto**:
   ```bash
   cd serenity-saucedemo
3. **copiar driver**:
   ```bash
   mvn clean verify
4. **Ejecutar las pruebas**:
   ```bash
   mvn clean verify
5. **Visualizar el reporte de resultados**:
   Una vez finalizadas las pruebas, abre el archivo target/site/serenity/index.html en tu navegador para ver el reporte detallado
      

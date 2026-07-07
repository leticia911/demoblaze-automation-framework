# Arquitectura del Framework

## Objetivo

El proyecto fue desarrollado utilizando el patrón de diseño **Page Object Model (POM)** con el objetivo de separar la lógica de automatización de la definición de los elementos de la interfaz.

Esta organización facilita el mantenimiento del código y evita la duplicación de funcionalidades.

---

# Tecnologías utilizadas

- Java
- Maven
- Selenium WebDriver
- TestNG
- Extent Reports
- Apache POI (lectura de Excel)
- Git
- GitHub

---

# Estructura del proyecto

```
src
├── main
│   ├── java
│   │   ├── actions
│   │   ├── config
│   │   ├── data
│   │   ├── driver
│   │   ├── pages
│   │   ├── reporting
│   │   └── utils
│   │
│   └── resources
│
└── test
    └── java
        ├── base
        ├── dataproviders
        ├── reporting
        ├── retry
        └── tests
```

---

# Patrón utilizado

Se implementó el patrón **Page Object Model (POM)**.

Cada pantalla de la aplicación posee una clase específica donde se encuentran:

- Localizadores.
- Acciones disponibles.
- Métodos reutilizables.

Los casos de prueba únicamente consumen estos métodos, evitando interactuar directamente con Selenium.

---

# BaseTest

La clase BaseTest centraliza:

- Inicialización del navegador.
- Configuración del WebDriver.
- Apertura de la aplicación.
- Cierre del navegador.
- Configuración común para todos los tests.

---

# Data Driven Testing

El proyecto permite obtener datos desde:

- Excel
- JSON
- CSV
- Base de datos (estructura preparada)

Esto facilita reutilizar los mismos casos de prueba utilizando diferentes conjuntos de datos.

---

# Reportes

La ejecución genera reportes HTML mediante Extent Reports para visualizar:

- Casos ejecutados.
- Casos exitosos.
- Casos fallidos.
- Tiempo de ejecución.
- Evidencias.

---

# Beneficios de la arquitectura

- Código organizado.
- Fácil mantenimiento.
- Reutilización de componentes.
- Escalabilidad.
- Separación de responsabilidades.
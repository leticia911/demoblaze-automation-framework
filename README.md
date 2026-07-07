# DemoBlaze Automation Framework

Framework de Automatización de Pruebas desarrollado como proyecto de portfolio para demostrar conocimientos de **QA Automation** utilizando Java, Selenium WebDriver y TestNG.

El proyecto implementa buenas prácticas de automatización, incluyendo Page Object Model (POM), Data-Driven Testing y generación automática de reportes.

---

## Objetivo

Este proyecto fue desarrollado con el propósito de:

- Automatizar escenarios funcionales sobre DemoBlaze.
- Aplicar buenas prácticas de QA Automation.
- Demostrar conocimientos de Java y Selenium.
- Implementar una arquitectura limpia y mantenible.
- Utilizar Git y GitHub como control de versiones.

---

## Sitio bajo prueba

https://www.demoblaze.com

---

## Tecnologías utilizadas

| Tecnología | Uso |
|------------|-----|
| Java | Lenguaje principal |
| Maven | Gestión de dependencias |
| Selenium WebDriver | Automatización Web |
| TestNG | Ejecución de pruebas |
| Page Object Model | Organización del código |
| Apache POI | Lectura de datos desde Excel |
| JSON | Datos de prueba |
| Extent Reports | Reportes HTML |
| Log4j2 | Registro de ejecución |
| Git | Control de versiones |
| GitHub | Repositorio remoto |

---

## Arquitectura del proyecto

```
DemoBlazeAutomation
│
├── docs/
├── logs/
├── reports/
├── screenshots/
│
├── src
│   ├── main
│   │     ├── actions
│   │     ├── config
│   │     ├── data
│   │     ├── driver
│   │     ├── exceptions
│   │     ├── logging
│   │     ├── pages
│   │     ├── reporting
│   │     └── utils
│   │
│   └── resources
│
└── src
    └── test
          ├── base
          ├── dataproviders
          ├── reporting
          ├── retry
          └── tests
```

---

## Funcionalidades implementadas

- Configuración mediante archivos Properties.
- Page Object Model (POM).
- Data-Driven Testing con Excel.
- Data-Driven Testing con JSON.
- Captura automática de Screenshots.
- Esperas explícitas.
- Logs de ejecución.
- Reportes Extent Reports.

---

## Casos automatizados

| ID | Caso de prueba | Estado |
|----|----------------|--------|
| CP001 | Navegación mediante el logo | ✔ |
| CP002 | Inicio de sesión | ✔ |
| CP003 | Agregar producto al carrito | ✔ |

---

## Cómo ejecutar el proyecto

### Clonar el repositorio

```bash
git clone https://github.com/leticia911/demoblaze-automation-framework.git
```

### Ejecutar todas las pruebas

```bash
mvn clean test
```

También es posible ejecutar las pruebas utilizando el archivo:

```
testng.xml
```

---

## Reportes generados

Durante la ejecución se generan automáticamente:

- Extent Reports
- Logs
- Screenshots

---

## Buenas prácticas aplicadas

- Page Object Model
- Separación de responsabilidades
- Reutilización de componentes
- Configuración centralizada
- Data-Driven Testing
- Evidencias automáticas
- Control de versiones con Git

---

## Próximas mejoras

- Incorporar nuevos casos de prueba.
- Incrementar la cobertura funcional.
- Configurar GitHub Actions para ejecutar las pruebas automáticamente.

---

## Autor

**Leticia Rodríguez**

QA Automation Trainee / Junior

GitHub:
https://github.com/leticia911
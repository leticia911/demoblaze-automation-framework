# DemoBlaze Automation Framework

Framework de automatización de pruebas web desarrollado como proyecto de portfolio para demostrar competencias en QA Automation utilizando Java, Selenium WebDriver y TestNG.

El proyecto implementa una arquitectura basada en **Page Object Model (POM)**, componentes reutilizables y buenas prácticas de automatización, integrando **Jira** para la gestión funcional, **GitHub** para el versionado del código y una trazabilidad completa entre requerimientos, casos de prueba y automatizaciones.

---

# Sitio bajo prueba

https://www.demoblaze.com

---

# Objetivos

Este proyecto fue desarrollado con los siguientes objetivos:

- Automatizar escenarios funcionales sobre DemoBlaze.
- Aplicar buenas prácticas de QA Automation.
- Implementar una arquitectura mantenible basada en Page Object Model (POM).
- Integrar Jira, Git y GitHub para la gestión funcional y el versionado.
- Construir un portfolio técnico orientado a posiciones QA Automation Junior.

---

# Tecnologías utilizadas

| Tecnología | Uso |
|------------|-----|
| Java 21 | Lenguaje principal |
| Maven | Gestión de dependencias |
| Selenium WebDriver | Automatización Web |
| TestNG | Framework de pruebas |
| WebDriverManager | Gestión automática de drivers |
| Apache POI | Data Driven Testing con Excel |
| JSON | Datos de prueba |
| Log4j2 | Logging |
| Extent Reports | Reportes HTML |
| Git | Control de versiones |
| GitHub | Repositorio remoto |
| Jira | Gestión de requerimientos y trazabilidad |

---

# Arquitectura

El framework sigue una arquitectura basada en el patrón **Page Object Model (POM)**, separando responsabilidades en capas reutilizables.

Cada componente posee una única responsabilidad, favoreciendo el mantenimiento, la reutilización del código y la escalabilidad del proyecto.

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
│   │
│   ├── actions
│   ├── config
│   ├── data
│   ├── driver
│   ├── exceptions
│   ├── logging
│   ├── pages
│   ├── reporting
│   └── utils
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

# Funcionalidades implementadas

- Configuración mediante archivos Properties.
- Page Object Model (POM).
- Data Driven Testing con Excel.
- Data Driven Testing con JSON.
- Captura automática de Screenshots.
- Esperas explícitas (Explicit Wait).
- Logs de ejecución con Log4j2.
- Reportes HTML mediante Extent Reports.
- Componentes reutilizables.
- Assertions centralizadas.
- Integración con Jira y GitHub.

---

# Casos automatizados

| Historia Jira | Caso de Uso | Caso de Prueba | Clase Automatizada | Estado |
|---------------|-------------|----------------|--------------------|--------|
| DA-5 | CU-001 | CP-001 – Navegación mediante el logo PRODUCT STORE | CP001NavigationTest | ✅ |
| DA-5 | CU-002 | CP-015 – Navegación mediante el enlace Home | CP015HomeNavigationTest | ✅ |

---

# Trazabilidad

Cada funcionalidad implementada mantiene una trazabilidad completa entre los distintos artefactos del proyecto.

```
Historia de Usuario (Jira)
        ↓
Caso de Uso
        ↓
Caso de Prueba Manual
        ↓
Automatización Selenium
        ↓
Repositorio GitHub
```

| Historia Jira | Caso de Uso | Caso de Prueba | Automatización |
|---------------|-------------|----------------|----------------|
| DA-5 | CU-001 | CP-001 | CP001NavigationTest |
| DA-5 | CU-002 | CP-015 | CP015HomeNavigationTest |

---

# Cómo ejecutar el proyecto

## Clonar el repositorio

```bash
git clone https://github.com/leticia911/demoblaze-automation-framework.git
```

## Ejecutar todas las pruebas

```bash
mvn clean test
```

También es posible ejecutar las pruebas mediante el archivo:

```
testng.xml
```

---

# Evidencias generadas

Durante la ejecución del framework se generan automáticamente:

- Extent Reports
- Logs de ejecución
- Capturas de pantalla
- Evidencias para análisis de fallos

---

# Buenas prácticas implementadas

- Page Object Model (POM)
- Separación de responsabilidades
- Reutilización de componentes
- Explicit Wait
- Logging centralizado
- Reportes automáticos
- Assertions reutilizables
- Configuración mediante archivos Properties
- Data Driven Testing
- Integración con Jira
- Versionado con Git y GitHub

---

# Roadmap

## Sprint 1

- ✅ CP-001 – Navegación mediante el logo PRODUCT STORE
- ✅ CP-015 – Navegación mediante el enlace Home
- ⬜ Automatización de Categorías
- ⬜ Automatización del detalle de producto
- ⬜ Automatización de Agregar al carrito
- ⬜ Automatización de Eliminar del carrito
- ⬜ Automatización de Place Order

## Próximas mejoras

- Integración con GitHub Actions
- Allure Reports
- Cross Browser Testing
- Data Driven Testing ampliado
- Integración Continua (CI)

---

# Autor

**Leticia Rodríguez**

QA Automation Trainee / Junior

## Tecnologías principales

- Java
- Selenium WebDriver
- TestNG
- Maven
- Jira
- Git
- GitHub

GitHub:

https://github.com/leticia911

---

Este proyecto forma parte de mi portfolio profesional orientado a QA Automation, aplicando buenas prácticas de diseño, automatización, versionado y trazabilidad entre requerimientos funcionales, casos de prueba y código automatizado.
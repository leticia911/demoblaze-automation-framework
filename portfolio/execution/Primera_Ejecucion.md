# Primera ejecución del Framework

## Objetivo

Documentar la primera ejecución exitosa del framework de automatización sobre el sitio DemoBlaze.

---

## Información de la ejecución

| Campo | Valor |
|--------|-------|
| Proyecto | DemoBlaze Automation Framework |
| Framework | Selenium WebDriver + TestNG |
| Lenguaje | Java |
| Gestor de dependencias | Maven |
| Patrón de diseño | Page Object Model |
| Fecha | Julio 2026 |

---

## Caso de prueba ejecutado

| ID | Nombre |
|----|--------|
| CP001 | Verificar navegación mediante el logo |

---

## Resultado obtenido

**Estado:** Aprobado (PASS)

La automatización ejecutó correctamente el caso de prueba verificando que, al hacer clic sobre el logo "PRODUCT STORE", el sistema redirige nuevamente a la página principal.

---

## Evidencias generadas

Durante la ejecución se generaron automáticamente:

- Capturas de pantalla.
- Reporte Extent Report.
- Registro de eventos (logs).

---

## Archivos relacionados

### Clase automatizada

```
src/test/java/tests/CP001NavigationTest.java
```

### Reportes

```
reports/
```

### Capturas

```
screenshots/
```

---

## Observaciones

La estructura del framework permite incorporar nuevos casos de prueba reutilizando los componentes existentes, manteniendo la separación entre lógica de negocio, páginas, datos y reportes.
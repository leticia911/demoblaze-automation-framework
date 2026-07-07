# CP001 - Verificar navegación mediante el logo

## Objetivo

Verificar que al hacer clic sobre el logo de DemoBlaze el usuario sea redirigido correctamente a la página de inicio.

---

## Información del caso de prueba

| Campo | Valor |
|--------|-------|
| ID del Caso de Prueba | CP001 |
| Módulo | Inicio (Home) |
| Prioridad | Alta |
| Tipo de prueba | Funcional |
| Automatizado | Sí |

---

## Precondiciones

- Tener un navegador web instalado.
- Contar con conexión a Internet.
- El sitio DemoBlaze debe estar disponible.

---

## Pasos de ejecución

| Paso | Acción | Resultado esperado |
|------|---------|--------------------|
| 1 | Abrir el sitio web DemoBlaze. | Se visualiza la página principal. |
| 2 | Navegar hacia otra página o seleccionar un producto. | Se muestra una página diferente a la principal. |
| 3 | Hacer clic sobre el logo "PRODUCT STORE". | El usuario es redirigido nuevamente a la página de inicio. |

---

## Resultado esperado

El sistema redirige correctamente al usuario a la página principal al hacer clic sobre el logo.

---

## Automatización asociada

Clase automatizada:

```text
src/test/java/tests/CP001NavigationTest.java
```

---

## Evidencias

- Capturas de pantalla generadas automáticamente durante la ejecución.
- Reporte Extent Report generado al finalizar la prueba.

---

## Estado

Implementado
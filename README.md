# 🧪 Automation Framework - nopCommerce Demo Store

Este proyecto es un framework de automatización de pruebas UI desarrollado con **Java, Selenium WebDriver, TestNG y Maven**, enfocado en la aplicación demo de [nopCommerce](https://demo.nopcommerce.com/). Tiene como objetivo simular y validar funcionalidades clave de un e-commerce moderno.

## 🛠️ Tecnologías utilizadas

- Java 17+
- Selenium WebDriver
- TestNG
- Maven
- Git
- Page Object Model (POM)
- Extent Reports (opcional para reportes)
- GitHub Actions (opcional para CI)

## 📋 Funcionalidades Automatizadas

El proyecto cubre pruebas funcionales tanto positivas como negativas en los siguientes módulos:

| Módulo                   | Casos Cubiertos                                                     |
|--------------------------|---------------------------------------------------------------------|
| 🔐 Autenticación         | Registro, email ya registrado, Login, Logout, Login inválido        |
| 🔍 Búsqueda              | Productos existentes, inexistentes, invalidos, filtros              |
| 🛒 Carrito de compras    | Agregar, eliminar, actualizar cantidad, verificar totales           |
| 💳 Checkout              | Compra simulada, checkout sin dirección, validaciones, confirmación |
| 🧾 Mi cuenta / historial | Ver pedidos, editar perfil, cambiar contraseña                      |
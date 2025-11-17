# 💱 Conversor de Monedas - Exchange Rate

<div align="center">

![Badge del Curso](ruta/a/tu/emblema.png)
<!-- Reemplaza "ruta/a/tu/emblema.png" con la ruta real de tu imagen -->

**Challenge Alura Latam & Oracle One**

[![Java](https://img.shields.io/badge/Java-17+-orange?style=for-the-badge&logo=java)](https://www.oracle.com/java/)
[![Gson](https://img.shields.io/badge/Gson-2.10-blue?style=for-the-badge)](https://github.com/google/gson)

</div>

---

## 📋 Descripción

Aplicación de consola desarrollada en Java que permite realizar conversiones entre diferentes monedas utilizando tasas de cambio actualizadas en tiempo real a través de la API de ExchangeRate-API.

El proyecto fue desarrollado como parte del programa **ONE - Oracle Next Education** en colaboración con **Alura Latam**.

---

## ✨ Características

- ✅ Conversión entre **Dólar (USD)**, **Euro (EUR)** y **Peso Colombiano (COP)**
- ✅ Tasas de cambio actualizadas en tiempo real
- ✅ Interfaz de usuario intuitiva con menú interactivo
- ✅ Validación de entradas del usuario
- ✅ Manejo de excepciones personalizadas
- ✅ Registro histórico de conversiones en archivo de texto
- ✅ Formato visual atractivo con bordes ASCII

---

## 🚀 Conversiones Disponibles

| Desde | Hasta |
|-------|-------|
| 💵 USD | 💶 EUR |
| 💶 EUR | 💵 USD |
| 💵 USD | 🇨🇴 COP |
| 🇨🇴 COP | 💵 USD |
| 💶 EUR | 🇨🇴 COP |
| 🇨🇴 COP | 💶 EUR |

---

## 🛠️ Tecnologías Utilizadas

- **Java 17+** - Lenguaje de programación
- **Gson 2.10** - Librería para deserialización de JSON
- **HttpClient** - Cliente HTTP nativo de Java para consumo de API
- **ExchangeRate-API** - API de tasas de cambio

---

## 📦 Estructura del Proyecto

```
src/
├── Main.java
├── com/daniidev/
│   ├── app/
│   │   ├── ExchangeMenu.java      # Menú de la aplicación
│   │   └── History.java           # Gestión de histórico
│   ├── exceptions/
│   │   └── OpcionInvalidaExcepcion.java  # Excepción personalizada
│   └── request/
│       ├── DTO.java               # Data Transfer Object
│       ├── Deserialization.java   # Deserialización de respuesta
│       └── Request.java           # Consumo de API
```

---

## 🔧 Instalación y Configuración

### Prerrequisitos

- Java JDK 17 o superior
- Librería Gson 2.10+

### Pasos para ejecutar

1. **Clonar el repositorio**
   ```bash
   git clone https://github.com/tuusuario/conversor-monedas.git
   cd conversor-monedas
   ```

2. **Agregar la librería Gson al proyecto**
   - Descarga Gson desde [Maven Repository](https://mvnrepository.com/artifact/com.google.code.gson/gson)
   - Agrega el JAR al classpath del proyecto

3. **Compilar el proyecto**
   ```bash
   javac -cp .:gson-2.10.jar src/Main.java src/com/daniidev/**/*.java
   ```

4. **Ejecutar la aplicación**
   ```bash
   java -cp .:gson-2.10.jar Main
   ```

---

## 💡 Uso de la Aplicación

1. Al iniciar, se mostrará un mensaje de bienvenida
2. Confirma si deseas continuar (Y/N)
3. Selecciona una de las 6 opciones de conversión disponibles
4. Ingresa la cantidad a convertir
5. El resultado se mostrará en pantalla y se guardará en `historical.txt`
6. Selecciona opción 7 para salir

### Ejemplo de uso

```
╔════════════════════════════════════════════════╗
║      CONVERSOR DE MONEDAS - Exchange Rate      ║
╠════════════════════════════════════════════════╣
║                                                ║
║  1) Dólar (USD)         ==>  Euro (EUR)        ║
║  2) Euro (EUR)          ==>  Dólar (USD)       ║
║  3) Dólar (USD)         ==>  Peso Colombiano   ║
║  4) Peso Colombiano     ==>  Dólar (USD)       ║
║  5) Euro (EUR)          ==>  Peso Colombiano   ║
║  6) Peso Colombiano     ==>  Euro (EUR)        ║
║                                                ║
║  7) Salir                                      ║
║                                                ║
╚════════════════════════════════════════════════╝

➤ Elija una opción válida: 1
Digite la cantidad de Dólares a convertir: 100

La cantidad $100.00 en Dólares son: €92.45 Euros
```

---

## 📝 Archivo Histórico

Cada conversión realizada se guarda automáticamente en `historical.txt` con el siguiente formato:

```
Conversión de $100.0 USD a €92.45 EUR
Conversión de €50.0 EUR a $54.12 USD
Conversión de $200.0 USD a $878640.0 COP
```

---

## 🎓 Aprendizajes del Proyecto

Este proyecto me permitió desarrollar habilidades en:

- ✅ Consumo de APIs REST con HttpClient
- ✅ Deserialización de JSON con Gson
- ✅ Manejo de excepciones personalizadas
- ✅ Manipulación de archivos con FileWriter
- ✅ Diseño orientado a objetos
- ✅ Validación de datos de entrada
- ✅ Buenas prácticas de programación en Java

---

## 🏆 Insignia del Curso

<div align="center">

![Insignia Alura](ruta/a/tu/emblema.png)
<!-- Coloca aquí la imagen de tu emblema del curso -->

**Challenge completado exitosamente**  
*Alura Latam & Oracle Next Education*

</div>

---

## 👨‍💻 Autor

**Tu Nombre**

- GitHub: [@daniidev](https://github.com/daniidev)
- LinkedIn: [Tu Perfil](https://linkedin.com/in/tu-perfil)

---

## 🙏 Agradecimientos

- **Alura Latam** por el contenido educativo
- **Oracle** por el programa ONE
- **ExchangeRate-API** por proporcionar la API gratuita

---

<div align="center">

**⭐ Si te gustó este proyecto, no olvides darle una estrella ⭐**

</div>

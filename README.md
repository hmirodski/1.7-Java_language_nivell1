# 1.7 Java Annotations - Nivel 1

## 📄 Descripción

Este proyecto contiene la implementación de dos ejercicios del Sprint 1.07 - Annotations en Java.

### Ejercicio 1: Jerarquía de Workers con @Override

Jerarquía de clases con `Worker` como clase padre y dos clases hijas:

- **Worker**: Clase base con atributos name, surname y hourPrice. Método `calculateSalary()` que multiplica horas por
  precio/hora.
- **OnSiteWorker**: Trabajador presencial. Sobreescribe `calculateSalary()` sumando el atributo estático `petrol` al
  salario base.
- **OnLineWorker**: Trabajador online. Sobreescribe `calculateSalary()` sumando la constante `INTERNET_FEE` al salario
  base.

### Ejercicio 2: @Deprecated y @SuppressWarnings

Las clases hijas contienen métodos obsoletos marcados con `@Deprecated`. La clase `DeprecatedTestClass` invoca estos
métodos suprimiendo los warnings con `@SuppressWarnings("deprecation")`.

---

## 💻 Tecnologías Utilizadas

- **Java 17**
- **Maven** - Gestión de dependencias y build
- **IntelliJ IDEA** - Entorno de desarrollo integrado
- **Git** - Control de versiones
- **JUnit 5 (Jupiter)** - Framework de testing

---

## 📋 Requisitos

Para ejecutar este proyecto necesitas:

- **Java Development Kit (JDK) 17** o superior
- **Maven 3.6+**
- **IntelliJ IDEA** (Community o Ultimate) o cualquier IDE compatible con Java
- **Git** para clonar el repositorio

---

## 🛠️ Instalación

### 1. Clonar el repositorio

```bash
git clone https://github.com/hmirodski/1.7-Java_language_nivell1.git
```

### 2. Abrir el proyecto en IntelliJ IDEA

1. Abre IntelliJ IDEA
2. Selecciona `File` → `Open`
3. Navega hasta la carpeta del proyecto y selecciónala
4. Click en `OK`
5. IntelliJ detectará automáticamente el proyecto Maven

### 3. Verificar la configuración del JDK

1. Ve a `File` → `Project Structure`
2. En `Project`, verifica que el SDK sea Java 17
3. Click en `OK`

---

## ▶️ Ejecución

### Ejecutar la aplicación

1. Navega a `src/main/java/Principal.java`
2. Haz clic derecho sobre el archivo
3. Selecciona `Run 'Principal.main()'`

### Ejecutar los tests

```bash
mvn test
```

O desde IntelliJ:

1. Haz clic derecho sobre la carpeta `src/test/java`
2. Selecciona `Run 'All Tests'`

---

## 🧪 Tests Implementados

### WorkerTest

1. `testWorkerSalary` - Verifica cálculo de salario base (horas × precio/hora)

### OnSiteWorkerTest

1. `testOnSiteWorkerSalary` - Verifica que suma petrol al salario base

### OnLineWorkerTest

1. `testOnLineWorkerSalary` - Verifica que suma INTERNET_FEE al salario base

---

## 📁 Estructura del Proyecto

```
1.7-Java_language_nivell1/
├── pom.xml
├── README.md
└── src/
    ├── main/java/
    │   ├── Worker.java
    │   ├── OnSiteWorker.java
    │   ├── OnLineWorker.java
    │   ├── Principal.java
    │   └── DeprecatedTestClass.java
    └── test/java/
        ├── WorkerTest.java
        ├── OnSiteWorkerTest.java
        └── OnLineWorkerTest.java
```

---

## 🌐 Despliegue

Este proyecto es una aplicación de consola local y no requiere despliegue en un servidor. Está diseñado para ejecutarse
en un entorno local con fines educativos.

---

## 🤝 Contribuciones

Este es un proyecto educativo personal desarrollado como parte del bootcamp de **IT Academy - Barcelona Activa**.

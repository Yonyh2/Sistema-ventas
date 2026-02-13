# Sistema de Ventas con Control de Inventario

Proyecto desarrollado en *Java* utilizando *NetBeans, **MySQL* y arquitectura *MVC (Modelo – Vista – Controlador)*.  
Hace parte de un portafolio académico y profesional como Tecnólogo en Análisis y Desarrollo de Software.

---

## Estado del proyecto
  En desarrollo

## Tecnologías utilizadas
- Java (JDK 8+)
- NetBeans IDE
- MySQL
- JDBC (MySQL Connector)
- Java Swing
- Git y GitHub

## Arquitectura
El proyecto sigue el patrón *MVC*:

- *Modelo*: Clases de dominio y conexión a base de datos
- *Vista*: Interfaces gráficas (Swing)
- *Controlador*: Lógica de negocio y comunicación entre vista y modelo

## Funcionalidades actuales
- Creación del proyecto en NetBeans
- Conexión a base de datos MySQL mediante JDBC
- Configuración de usuario exclusivo para el proyecto
- Prueba de conexión exitosa

## Funcionalidades en desarrollo
- CRUD de productos
- Control de inventario
- Registro de ventas
- Descuento automático de stock
- Reportes y consultas
- Sistema de usuarios y roles

## Configuración de la base de datos

1. Crear la base de datos:
```sql
CREATE DATABASE sistema_ventas;

2. Crear usuario para el proyecto
CREATE USER 'ventas_user'@'localhost' IDENTIFIED BY 'ventas123';
GRANT ALL PRIVILEGES ON sistema_ventas.* TO 'ventas_user'@'localhost';
FLUSH PRIVILEGES;
  

3. Configurar la clase Conexión.javacon los datos locales


  ## Autor

## Yony Alexander Huertas

Tecnólogo en Análisis y desarrollo de Software


## Licencia

Este proyecto se desarrolla con fines educativos y de protafolio



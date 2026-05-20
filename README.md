# LiterAlura

Aplicación de consola desarrollada en **Java con Spring Boot** que consume la API de **Gutendex** para gestionar un catálogo personal de libros y autores. Permite buscar libros, persistirlos en una base de datos PostgreSQL y realizar consultas sobre la información almacenada.

Proyecto realizado como parte del programa **Oracle Next Education (ONE) — Alura Latam**.

---

## Tabla de contenidos

- [Descripción](#descripción)
- [Características](#características)
- [Tecnologías](#tecnologías)
- [Requisitos previos](#requisitos-previos)
- [Instalación y configuración](#instalación-y-configuración)
- [Cómo ejecutar el proyecto](#cómo-ejecutar-el-proyecto)
- [Uso](#uso)
- [Contacto](#contacto)
- [Licencia](#licencia)

---

## Descripción

LiterAlura es una aplicación de consola interactiva que consulta la API pública de Gutendex para acceder al catálogo del Proyecto Gutenberg. Los datos obtenidos se almacenan en una base de datos PostgreSQL local, permitiendo construir una biblioteca personal consultable sin depender de conexión a internet para las consultas posteriores.

El proyecto aplica conceptos clave de desarrollo backend con Java:

- Consumo de **APIs REST externas** y mapeo de respuestas JSON a objetos Java.
- Persistencia con **Spring Data JPA** sobre PostgreSQL.
- Modelado de relaciones entre entidades (libros y autores).
- Manejo de menús interactivos por consola.

## Características

- **Búsqueda de libros** por título en la API de Gutendex.
- **Persistencia automática:** los libros consultados se guardan en la base de datos local.
- **Catálogo offline:** consulta los libros previamente guardados sin conexión.
- **Filtros avanzados:**
  - Listar autores registrados.
  - Listar autores vivos en un año específico.
  - Filtrar libros por idioma.

## Tecnologías

| Categoría | Tecnología |
|---|---|
| Lenguaje | Java 17 |
| Framework | Spring Boot |
| Persistencia | Spring Data JPA / Hibernate |
| Base de datos | PostgreSQL |
| API consumida | [Gutendex](https://gutendex.com/) |
| Build | Maven |

## Requisitos previos

- Java JDK 17 o superior
- Maven 3.8+
- PostgreSQL 14+
- Conexión a internet (solo para búsquedas nuevas)

## Instalación y configuración

**1. Clonar el repositorio**

```bash
git clone https://github.com/ingArtur/Challenger_Literalura.git
cd Challenger_Literalura
```

**2. Configurar la base de datos**

Crear una base de datos en PostgreSQL:

```sql
CREATE DATABASE literalura;
```

**3. Configurar credenciales**

En el archivo `src/main/resources/application.properties`, actualizar:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/literalura
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update
```

## Cómo ejecutar el proyecto

Desde la raíz del proyecto:

```bash
./mvnw spring-boot:run
```

O en Windows:

```bash
mvnw.cmd spring-boot:run
```

La aplicación se ejecuta en consola y muestra el menú principal al iniciar.

## Uso

Al ejecutar la aplicación se presenta un menú con las siguientes opciones:

| Opción | Descripción |
|---|---|
| 1 | **Buscar libro por título:** consulta la API de Gutendex y guarda el resultado en la base de datos. |
| 2 | **Listar libros registrados:** muestra todos los libros almacenados localmente. |
| 3 | **Listar autores registrados:** muestra todos los autores presentes en la base de datos. |
| 4 | **Listar autores vivos en un año:** pide un año y filtra los autores que estaban vivos en esa fecha. |
| 5 | **Listar libros por idioma:** permite filtrar el catálogo local por idioma. |

Las instrucciones aparecen en pantalla en cada paso.

## Contacto

**Artur Andrés Aroca Yara**

- GitHub: [@ingArtur](https://github.com/ingArtur)
- LinkedIn: [Artur Andrés Aroca Yara](https://www.linkedin.com/in/artur-andres-aroca-yara-565363272)
- Email: arthurandres30@gmail.com

## Licencia

Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE.txt` para más detalles.

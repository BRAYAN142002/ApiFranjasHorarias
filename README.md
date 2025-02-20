# 🌍 Contexto del Proyecto  

La Facultad de Ingeniería Electrónica y Telecomunicaciones (**FIET**) de la **Universidad del Cauca** enfrenta dificultades en la **gestión de horarios** debido a la asignación manual y descentralizada de las franjas horarias para los cursos de pregrado. Esto genera **conflictos de disponibilidad**, errores en la planificación y **retrasos en la validación de la carga académica** de los docentes.  

Para solucionar este problema, se ha desarrollado un **sistema digital automatizado en un ambito academico** que permite:  

✅ **Planificar franjas horarias** para cada curso.  
✅ **Asignar espacios físicos disponibles** de forma eficiente.  
✅ **Evitar choques de horarios** entre docentes y aulas.  
✅ **Registrar y validar** automáticamente la labor académica.  


# Diagrama de Base de Datos
![](https://res.cloudinary.com/dxfwitnnn/image/upload/v1736539883/BasedeDatos_wddus2.png)

# 📌 Resumen del Proyecto  

El proyecto implementa un sistema de gestión de espacios físicos y franjas horarias para la **Universidad del Cauca** en terminos academicos, siguiendo la **arquitectura hexagonal**, asegurando la separación entre dominio, infraestructura y aplicación. Se desarrollo lo siguiente:  

## 🔎 Listado de Espacios Físicos  
- Se listan en **orden ascendente** por nombre.  
- Se filtran por un **patrón de búsqueda** (ignorando mayúsculas/minúsculas).  
- Solo se incluyen aquellos con una **capacidad mínima especificada**.  

## 📌 Consultas (Querys)  
- **Disponibilidad de espacios físicos:** Se verifica si un espacio está ocupado en un día y franja horaria (**JPQL**).  
- **Disponibilidad de docentes:** Se consulta si un docente tiene otra franja horaria asignada en la misma fecha (**SQL Nativo**).  

## ✅ Validaciones  
- Se aplican anotaciones como `@Size`, `@NotNull`, `@Email`, `@NotEmpty`, `@Min`.  
- **Mensajes de error personalizados** almacenados en un archivo en español.  
- Se retornan **códigos HTTP adecuados** al validar datos y manejar excepciones.  

## 🚀 Controlador de Excepciones  
- Se impide la **asignación de franjas horarias** a espacios ocupados o docentes con conflictos de horario.  
- Se evita la **creación de docentes con correos duplicados**.  
- Se manejan errores devolviendo **respuestas con códigos HTTP apropiados**.

## 🛠️ Servicios REST Implementados  
- **Crear franja horaria:** Asocia un curso y un espacio físico.  
- **Crear docente:** Se registra un docente, persona y oficina en cascada con un solo `save()`.  
- **Listar franjas horarias por docente:** Retorna cursos y espacios físicos asignados al docente (**Lazy Loading**).  
- **Listar espacios físicos:** Usa el método con **KeyWords** para la búsqueda optimizada.
## 🗄️ Tecnologías Utilizadas  
- **Spring Boot** con **JPA** para la persistencia de datos.  
- **Base de datos relacional** que maneja relaciones como:  
  - `@OneToOne`: Relación entre **Docente** y **Oficina**.  
  - `@ManyToOne`: Relación entre **FranjaHoraria** y **Espacio Físico / Curso**.  
  - `@ManyToMany`: Relación entre **Docentes** y **Cursos**.  

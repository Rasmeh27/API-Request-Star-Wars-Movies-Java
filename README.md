# Resquest Star Wars Movies

**Resquest Star Wars Movies** es un proyecto en Java que permite buscar información sobre películas de la saga de Star Wars utilizando la API pública SWAPI (Star Wars API). 
El proyecto descarga información de una película específica y la guarda en un archivo JSON.

## Contenido

- **ConsultaPelicula**: Clase responsable de realizar la búsqueda de la película.
- **GeneradorArchivo**: Clase que se encarga de guardar la información de la película en un archivo JSON.
- **Pelicula**: Clase de registro que representa la estructura de la película.
- **Principal**: Clase que contiene el método `main`, donde se ejecuta la aplicación.

## Requisitos

- Java 11 o superior.
- Biblioteca **Gson** para la manipulación de JSON. Asegúrate de incluir el archivo JAR de Gson en tu proyecto.

## Instalación

1. Clona este repositorio o descarga los archivos del proyecto.
2. Asegúrate de tener Java instalado en tu máquina.
3. Incluye la biblioteca Gson en tu proyecto.

## Uso

1. Ejecuta la clase `Principal`.
2. Cuando se te pida, ingresa el número de la película de Star Wars que deseas consultar (1-6).
3. La información de la película se mostrará en la consola y se guardará en un archivo JSON con el título de la película.

## Ejemplo

Al ejecutar la aplicación, el usuario verá algo como:

Escribe el numero de la pelicula de SW: 
1
Pelicula(title=The Phantom Menace, episode_id=1, opening_crawl=..., director=George Lucas, producer=Rick McCallum, release_date=1999-05-19)

Esto generará un archivo llamado `The Phantom Menace.json` con la información de la película.

## Manejo de Errores

Si el número de la película ingresado no es válido o si hay un problema al realizar la búsqueda, se mostrará un mensaje de error en la consola:

No se ha encontrado la pelicula
Finalizacion de la aplicacion




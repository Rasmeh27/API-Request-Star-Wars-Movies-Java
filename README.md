# Request Star Wars Movies

**Request-Star-Wars-Movies** is a Java project that allows you to search for information about Star Wars films using the public SWAPI (Star Wars API). The project retrieves information about a specific film and saves it in a JSON file.

## Contents

- **ConsultaPelicula**: Class responsible for searching for the film.
- **GeneradorArchivo**: Class that handles saving the film information to a JSON file.
- **Pelicula**: Record class representing the structure of a film.
- **Principal**: Class that contains the `main` method where the application is executed.

## Requirements

- Java 11 or higher.
- **Gson** library for JSON manipulation. Make sure to include the Gson JAR file in your project.

## Installation

1. Clone this repository or download the project files.
2. Ensure you have Java installed on your machine.
3. Include the Gson library in your project.

## Usage

1. Run the `Principal` class.
2. When prompted, enter the number of the Star Wars film you want to query (1-6).
3. The film information will be displayed in the console and saved to a JSON file named after the film's title.

## Example

When running the application, the user will see something like:

Escribe el numero de la pelicula de SW:(
Write the number of the SW movie:)
1
Pelicula(title=The Phantom Menace, episode_id=1, opening_crawl=..., director=George Lucas, producer=Rick McCallum, release_date=1999-05-19)

This will generate a file named `The Phantom Menace.json` containing the film's information.

## Error Handling

If the entered film number is invalid or if there is an issue with the search, an error message will be displayed in the console:

No se ha encontrado la pelicula
Finalizacion de la aplicacion

Traduction:
The movie has not been found
Completion of the application


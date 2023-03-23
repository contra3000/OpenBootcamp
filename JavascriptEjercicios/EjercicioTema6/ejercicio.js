/*
Crea un archivo JS que contenga las siguientes líneas
- Una variable que contenga la lista de la compra (mínimo 5 elementos)
- Modifica la lista de la compra y añádele "Aceite de Girasol"
- Vuelve a modificar la lista de la compra eliminando "Aceite de Girasol"
- Una lista de tus 3 películas favoritas (objetos con propiedades: titulo, director, fecha)
- Una nueva lista que contenga las películas posteriores al 1 de enero de 2010 (utilizando filter)
- Una nueva lista que contenga los directores de la lista de películas original (utilizando map)
- Una nueva lista que contenga los títulos de la lista de películas original (utilizando map)
- Una nueva lista que concatene la lista de directores y la lista de los títulos (utilizando concat)
- Una nueva lista que concatene la lista de directores y la lista de los títulos (utilizando el factor de 
    propagación)
*/

let shopList = ["frutas", "leche", "fiambre", "pan", "café", "azucar"]

shopList.unshift("Aceite de Girasol");

shopList.shift();

console.log('shopList :>> ', shopList);

const harry = {
    titulo: "Harry Potter", 
    director: "Chris Colombus", 
    fecha: new Date("november 16 2001")
}

const henry = {
    titulo: "Henry Potter", 
    director: "Mattew Colombus", 
    fecha: new Date("july 20 2012")
}

const hungry = {
    titulo: "Hungry Potter", 
    director: "Joseph Colombus", 
    fecha: new Date("march 21 2011")
}

const favoriteMovies = [harry, henry, hungry];

const after2010 = favoriteMovies.filter(value => value.fecha.getFullYear() > 2009);

const directors = favoriteMovies.map(value => value.director);

const titles = favoriteMovies.map(value => value.titulo);

const director_Movie = directors.concat(titles);

const director_MovieProp = [...directors, ...titles]

console.log('director_MovieProp :>> ', director_MovieProp);
/*
Crea un archivo llamado objetos.js que contenga las siguientes líneas
- Un objeto con tus datos personales (nombre, apellido, edad, altura, eresDesarrollador)
- Una variable que obtenga tu edad a partir del objeto anterior
- Una lista que contenga el objeto con tus datos personales y un nuevo objeto con los datos personales de tus dos mejores amig@s
- Una nueva lista con los objetos de la lista anterior ordenados por edad, de mayor a menor
*/

const personal = {
    nombre: "Juan", 
    apellido: "Contreras", 
    edad: 32, 
    altura: 1.70, 
    eresDesarrollador: true
}

const edad = personal.edad;
console.log('edad :>> ', edad);

const lista = [personal, {
    nombre: "Pepe", 
    apellido: "Gonzales", 
    edad: 34, 
    altura: 1.73, 
    eresDesarrollador: false
}, {
    nombre: "Antonio", 
    apellido: "Martinez", 
    edad: 30, 
    altura: 1.78, 
    eresDesarrollador: true
}
]
console.log('lista :>> ', lista);

const lista2 = lista.sort((a, b) => b.edad - a.edad);
console.log('lista2 :>> ', lista2);
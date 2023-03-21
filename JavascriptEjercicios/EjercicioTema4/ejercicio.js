/*
Crea un archivo JS que contenga las siguientes líneas
- Una cadena de texto con tu Nombre
- Otra cadena de texto con tu Apellido
- Una cadena de texto que se llame "estudiante" concatenando tu Nombre y tu Apellido con un espacio entre medias
- Una cadena de texto que se llame "estudianteMayus" que contenga la cadena estudiante pero todo en mayúsculas
- Una cadena de texto que se llame "estudianteMinus" que contenga la cadena estudiante pero todo en minúsculas
- Una variable que contenga el número de letras de la cadena "estudiante" contando los espacios
- Una variable que contenga la primera letra del Nombre
- Otra variable que contenga la última letra del Apellido
- Una cadena de texto que elimine los espacios de la variable "estudiante"
- Una variable booleana que diga si el Nombre está contenido en la variable "estudiante"
*/
let nombre = "Juan";
let apellido = "Contreras";
let estudiante = nombre.concat(" ", apellido);
let estudianteMayus = estudiante.toUpperCase();
let estudianteMinus = estudiante.toLowerCase();
let nCharsEstudiante = estudiante.length;
let firstNombre = nombre.charAt(0);
let lastApellido = apellido.charAt(apellido.length - 1);
let nonSpaceEstudiante = estudiante.replace(/ /g, "");
let isName = estudiante.includes(nombre)

console.log('nombre :>> ', nombre);
console.log('apellido :>> ', apellido);
console.log('estudiante :>> ', estudiante);
console.log('estudianteMayus :>> ', estudianteMayus);
console.log('estudianteMinus :>> ', estudianteMinus);
console.log('nCharsEstudiante :>> ', nCharsEstudiante);
console.log('firstNombre :>> ', firstNombre);
console.log('lastApellido :>> ', lastApellido);
console.log('nonSpaceEstudiante :>> ', nonSpaceEstudiante);
console.log('isName :>> ', isName);
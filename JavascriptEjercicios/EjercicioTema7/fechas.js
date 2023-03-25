/*
Crea un archivo llamado fechas.js que contenga las siguientes líneas
- La fecha de hoy
- La fecha de tu nacimiento
- Un variable que indique si hoy es más tarde (>) que la fecha de tu nacimiento
- Una variable que contenga el día de tu nacimiento
- Una variable que contenga el mes de tu nacimiento (recuerda que Enero es mes 0)
- Una variable que contenga el año de tu nacimiento (con 4 dígitos)
*/
const date = new Date();

const birthDate = new Date("July 9, 1990")

const isBorn = date > birthDate;
console.log('isBorn :>> ', isBorn);

let birthDay = birthDate.getDate();
console.log('birthDay :>> ', birthDay);

let birthMonth = birthDate.getMonth()+1;
console.log('birthMonth :>> ', birthMonth);

let birthYear = birthDate.getFullYear();
console.log('birthYear :>> ', birthYear);

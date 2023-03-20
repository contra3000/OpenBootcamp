/*
Crea los siguientes archivos JS:

- factorial-for.js -> Este archivo debe calcular el factorial de 10 utilizando un solo bucle for

- factorial-while.js -> Este archivo debe calcular el factorial de 10 utilizando un bucle while

- factorial-break.js -> Este archivo debe calcular el factorial de 10 utilizando un bucle while, una bifurcación if y una sentencia break
*/


let factor = 1;
let n = 10
let factorial = 1
while (factor <= n){
    factorial = factor * factorial
    factor++;
}
console.log('factorial de 10 :>> ', factorial);
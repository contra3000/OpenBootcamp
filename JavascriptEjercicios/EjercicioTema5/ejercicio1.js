/*
Crea un archivo JS que contenga las siguientes líneas
- Una variable que contenga tu altura en centímetros (entero)
- Una variable que contenga tu altura en metros (número de coma flotante)
- Una variable que contenga tu peso en kilogramos (número de coma flotante)
- Una variable que contenga tu altura en metros redondeada hacia arriba
- Una variable que contenga tu peso en kilogramos redondeado hacia abajo
- Una variable que contenga si "el máximo valor que se puede obtener en Javascript + 1" 
es igual al máximo valor que se puede obtener en Javascript
*/
let altura = 170;
let metersAltura = altura/100;
let peso = 73.4;
let roundedMetersAltura = metersAltura.toFixed(0);
let roundedPeso = peso.toPrecision(2)
let isMax = (Number.MAX_VALUE + 1) == Number.MAX_VALUE

console.log('altura :>> ', altura);
console.log('metersAltura :>> ', metersAltura);
console.log('peso :>> ', peso);
console.log('roundedMetersAltura :>> ', roundedMetersAltura);
console.log('roundedPeso :>> ', roundedPeso);
console.log('isMax :>> ', isMax);
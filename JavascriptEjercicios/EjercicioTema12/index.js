/*
Crea un nuevo fichero JS que contenga las siguientes líneas
- Una función que admita un parámetro "num", y devuelva una lista con esa cantidad de números de la secuencia de Fibonacci 
(Por ejemplo: num = 6 => Resultado [1, 1, 2, 3, 5, 8])
- Ejecuta la depuración de VSCode para visualizar la ejecución de la función
*/

console.log('hacemeArray(6) :>> ', hacemeArray(6));

function hacemeArray(num){
    if (num > 0){
        const result = [num]
        result[0] = 1;
        for(let i = 1; i < num; i++){
            if(i>1){
                result[i] = result[i-2] + result[i-1];
            } else {
                result[i] = i;
            }
            
        }
        return result;
    } else {
        return new Array[0];
    }
}
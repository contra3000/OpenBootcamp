/*
Crea un nuevo proyecto de Node
- Instala la dependencia Winston
- En el archivo index.js crea una función que devuelva un error con un mensaje personalizado
- Registra el error en un archivo a través de un try...catch
*/

function cuadrado(numero){
    if (typeof numero === "number"){
        return numero*numero;
    } else {
        throw new Error("cuadrado() solo acepta valores tipo number");
    }
}

const logger = require("./logger");

try{
    console.log('cuadrado("2") :>> ', cuadrado("2"));
} catch (e){
    logger.error("Error: ");
}

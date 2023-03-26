/*
Crea un archivo JS que contenga las siguientes líneas
- Una función sin parámetros que devuelva siempre "true"
- Una función asíncrona que utilice un setTimeout y pase por consola un "Hola soy una promesa" 
    5 segundos después de haberse ejecutado
- Una función generadora de índices pares automáticos
*/

function tengoRazon(){
    return true;
}

////

const promesa = new Promise((resolve, reject) => {
    let i = 1;
    if(i>0){
        resolve();
    } else {
        reject();
    }
});



function miAsinc(){
    console.log('new Date() :>> ', new Date());
    setTimeout(function(){
        promesa.then(()=> console.log("Hola soy una promesa"))
    }, 5000);
    console.log('new Date() :>> ', new Date());
}

miAsinc();

////

function* generaIdPar(){
    let id = 0;
    while(true){
        id+=2;
        if(id==54){
            return id;
        }
        yield id; // Esperando hasta que vuelvan a llamar
    }
}

const gen = generaIdPar();

console.log(gen.next().value);
console.log(gen.next().value);
console.log(gen.next().value);
console.log(gen.next().value);
console.log(gen.next().value);
console.log(gen.next().value);
console.log(gen.next().value);
console.log(gen.next().value);
console.log(gen.next().value);
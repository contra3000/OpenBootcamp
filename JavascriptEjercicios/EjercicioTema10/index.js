/*
Crea un nuevo proyecto de Node
- Configura el proyecto para utilizar los módulos de ES6
- Crea un archivo controller.js que exporte 2 funciones: suma(a, b) y multiplica(a, b)
- En el entrypoint index.js, importa el módulo controller.js
- El entrypoint index.js debe utilizar las funciones del módulo para devolver la multiplicación de suma(1, 2) y suma(4, 5)
- Instala e importa la librería chalk (https://www.npmjs.com/package/chalk)
- Modifica el último console.log del entrypoint index.js para devolver el resultado en color verde
*/
import chalk from 'chalk';
import * as controller from "./modules/controller.js"


console.log('controller.suma(1, 2) :>> ', controller.suma(1, 2));
console.log(chalk.green('controller.suma(4, 5) :>> ', controller.suma(4, 5)));

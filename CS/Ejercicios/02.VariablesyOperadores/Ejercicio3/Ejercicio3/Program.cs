//// Operadores 
/*
Determina los operadores para verificar las siguientes condiciones:
 * Un número es mayor o igual a 18
 * Un char es ‘a’
 * Se cumplen dos conciones a la vez (ambas verdaderas)
 * Se cumple una de dos condiciones a la vez (una true y otra false)
Nota: puedes escribir estos datos por consola si prefieres verlos. 
La idea del ejercicio es almacenar los datos en los tipos más adecuados.
*/

int a = 18;
char b = 'a';

Console.Write("int a es mayor o igual a 18? ");
Console.WriteLine(a >= 18);

Console.Write("char b es 'a'? ");
Console.WriteLine(b == 'a');

Console.Write("char b es distinto a 'c' e int a es mayor que 15? ");
Console.WriteLine((b != 'c') & (a > 15));

Console.Write("char b es distinto a 'a' o int a es mayor que 15? ");
Console.WriteLine((b != 'a') || (a > 15));

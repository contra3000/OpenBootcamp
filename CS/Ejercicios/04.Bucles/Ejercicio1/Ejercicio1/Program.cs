/*
 * WHILE
Escribe una tabla de multiplicar del 1 al 10 para un número entero que recibe por consola. 
Es decir, un programa que presente para el 1: 
*1 x 1 = 1
*1 x 2 = 2
*…
*1 x 10 = 10
*/
// Sumar los 100 primeros numeros enteros
Console.WriteLine("Te mostraremos la tabla de multiplicar del numero que nos indiques: ");
int j = Convert.ToInt32(Console.ReadLine());
int i = 1;
while (i <= 10)
{
    Console.WriteLine($"{j} * {i} = {j*i}");
    i++;
}
Console.WriteLine("Adios!");

/*
 * DO WHILE
Escribe un programa que realice estos pasos:
*Reciba al menos un número por consola
*Determine si el número es positivo o negativo
*Presente un contador para cada tipo (positivo y negativo).
Nota: el cero se puede abordar en una clase adicional ya que no es ni positivo ni negativo. 
Tienes completa libertad para elegir el formato de la salida.
*/

Console.WriteLine("Almacenemos 10 numeros enteros positivos o negativos.");
int i = 0;
var p = new List<int>();
var n = new List<int>();
do
{
    Console.WriteLine("Ingrese un número: ");
    int j = Convert.ToInt32(Console.ReadLine());
    if (j < 0)
    {
        Console.WriteLine("Número negativo OK");
        n.Add(j);
    }
    else if (j > 0)
    {
        Console.WriteLine("Número positivo OK");
        p.Add(j);
    }
    else
    {
        Console.WriteLine("Este numero es cero");
    }
    Console.WriteLine($"{p.Count} números positivos almacenados");
    Console.WriteLine($"{n.Count} números negativos almacenados");
}
while ((p.Count < 10) & (n.Count <10));

Console.WriteLine("Adios!");

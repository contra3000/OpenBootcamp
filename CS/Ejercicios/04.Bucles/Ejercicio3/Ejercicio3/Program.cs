/*
 * FOR
Escribe un programa que realice estos pasos:
* Reciba 3 datos:
    ancho
    alto
    relleno o no
* Dibuje en consola con un mismo caracter, por ejemplo *, un rectángulo de las dimensiones introducidas 
y use el tercer dato para discernir si el rectángulo está relleno (tiene más * dentro) o no.
* En caso de recibir el mismo número n dos veces debe dibujar un cuadrado de lado n.
* Reto: Extiende el programa anterior para recibir otro número que sea el número de cuadrados o 
rectángulos que se deben dibujar en la pantalla. Ejemplos:
    Input: 2,2,2, relleno = true
    Output:
    ** **
    ** **
    Input: 3, 4, 1, relleno = false
    Output:
    ***
    * *
    * *
    ***
*/

Console.WriteLine("Este programa dibujará por ti.\nIndicanos las medidas del cuadrado o rectángulo y su relleno");


char[,] arrGeo = new char[10, 10];

Console.WriteLine("Base: ");
int ba = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("Altura: ");
int he = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("Relleno (true o false): ");
bool fill = Convert.ToBoolean(Console.ReadLine());

if (fill)
{
    for (int i = 0; i < he; i++)
    {
        for (int j = 0; j < ba; j++)
        {
            arrGeo.SetValue('*', i, j);
        }
    }
    Console.WriteLine("Tu rectángulo:");
    for (int i = 0; i <= he; i++)
    {
        for (int j = 0; j <= ba; j++)
        {
            Console.Write(arrGeo[i, j]);
        }
        Console.WriteLine();
    }
}
else
{
    for (int i = 0; i < he; i++)
    {
        for (int j = 0; j < ba; j++)
        {
            arrGeo.SetValue('*', i, j);
        }
    }
    for (int i = 1; i < (he-1); i++)
    {
        for (int j = 1; j < (ba-1); j++)
        {
            arrGeo.SetValue(' ', i, j);
        }
    }
    Console.WriteLine("Tu rectángulo:");
    for (int i = 0; i <= he; i++)
    {
        for (int j = 0; j <= ba; j++)
        {
            Console.Write(arrGeo[i, j]);
        }
        Console.WriteLine();
    }
}


Console.WriteLine("Adios!");

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

Console.WriteLine("Este programa dibujará por ti uno, dos o hasta 6 cuadrados/ rectangulos de hasta 9x9.\n" +
    "Indicanos las medidas del/los cuadrado/s o rectángulo/s, cantidad y su relleno");


char[,,] arrGeo = new char[7, 10, 10];

Console.WriteLine("Base: ");
int ba = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("Altura: ");
int he = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("Cantidad: ");
int qu = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("Relleno (true o false): ");
bool fill = Convert.ToBoolean(Console.ReadLine());

if (fill)
{
    for (int h = 0; h < qu; h++)
    {
        for (int i = 0; i < he; i++)
        {
            for (int j = 0; j < ba; j++)
            {
                arrGeo.SetValue('*', h, i, j);
            }
        }
    }
    Console.WriteLine("Output:");
    for (int i = 0; i < he; i++)
    {
        for (int h = 0; h <= qu; h++)
        {
            for (int j = 0; j <= ba; j++)
            {
                Console.Write(arrGeo[h, i, j]);
            }
            Console.Write(' ');
        }
        Console.WriteLine();
    }

}
else
{
    for (int h = 0; h < qu; h++)
    {
        for (int i = 0; i < he; i++)
        {
            for (int j = 0; j < ba; j++)
            {
                arrGeo.SetValue('*', h, i, j);
            }
        }
    }
    for (int h = 0; h < qu; h++)
    {
        for (int i = 1; i < (he-1); i++)
        {
            for (int j = 1; j < (ba-1); j++)
            {
                arrGeo.SetValue(' ', h, i, j);
            }
        }
    }
    Console.WriteLine("Output:");
    for (int i = 0; i < he; i++)
    {
        for (int h = 0; h <= qu; h++)
        {
            for (int j = 0; j <= ba; j++)
            {
                Console.Write(arrGeo[h, i, j]);
            }
            Console.Write(' ');
        }
        Console.WriteLine();
    }
}


Console.WriteLine("Adios!");

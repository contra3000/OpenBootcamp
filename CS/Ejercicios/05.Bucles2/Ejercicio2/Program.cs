/*
SWITCH
* Haz una lista de lenguajes de programación, por ejemplo: C#, Java, C++.
* Presenta la lista en consola y pide que el usuario seleccione el lenguaje mediante 1, 2, 3 o a, b, c. 
* Presenta el resultado en consola.
Nota: puedes añadir al resultado el “Hola, mundo” para el caso de C#.
*/

List<string> leng = new List<string>()
{
    "Java", "Python", "C++", "C#", "Javascript"
};
Console.WriteLine("Elije un lenguaje tipeando el numero correspondiente");
for (int i = 1; i <= leng.Count; i++)
{
    Console.WriteLine($"{i}. {leng[i-1]}");
}
int choice = Convert.ToInt32(Console.ReadLine());
switch(choice){
    case 1:
        Console.WriteLine("Usted seleccionó 'Java'");
        break;
    case 2:
        Console.WriteLine("Usted seleccionó 'Python'");
        break;
    case 3:
        Console.WriteLine("Usted seleccionó 'C++'");
        break;
    case 4:
        Console.WriteLine("Usted seleccionó 'C#'");
        Console.WriteLine("Hola, mundo");
        break;
    case 5:
        Console.WriteLine("Usted seleccionó 'Javascript'");
        break;
    default:
        Console.WriteLine("Ese no es un número válido");
        break;
}
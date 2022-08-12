////Variables 
///Escribe un programa que reciba datos de una persona y genera un mensaje,
///usa una variable para cada dato y otra para el mensaje. 
///Ej: nombre, apellido, edad, sabe programar, etc.


Console.WriteLine("Bienvenido a la matrix");

Console.WriteLine("Indicanos tu nombre de pila: ");
string first = Console.ReadLine();

Console.WriteLine("Indicanos tu apellido: ");
string last = Console.ReadLine();

Console.WriteLine("Indicanos tu edad: ");
int age = Int32.Parse(Console.ReadLine());

Console.WriteLine("skill: ");
string skill = Console.ReadLine();

Console.WriteLine("Base de datos actualizada");
Console.WriteLine("Nombre completo: " + first + " " + last);
Console.WriteLine("Edad: " + age);
Console.WriteLine("Skill: " + skill);

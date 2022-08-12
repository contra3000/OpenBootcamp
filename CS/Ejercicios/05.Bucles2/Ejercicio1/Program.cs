/*
 IF
Escribe un programa que:
* Pida datos a un cliente: Nombre, email, cupón
* Determine si un cliente tiene un cupon descuento
* Muestre un precio rebajado en función del descuento
* Muestre el precio de un producto sin descuento si no hay cupón
Nota: puedes poner un precio fijo de un producto o uno variable. 
 */

Console.WriteLine("Ingrese nombre completo: ");
string a001name = Console.ReadLine();
Console.WriteLine("Ingrese e-mail: ");
string a001mail = Console.ReadLine();
Console.WriteLine("Dispone de descuento?(true o false) ");
bool a001cupon = Convert.ToBoolean(Console.ReadLine());
Cliente a001 = new Cliente(a001name, a001mail, a001cupon);

const double sanFrancisco = 15.00d;
const double mojito = 15.00d;
const double tequilaSunrise = 19.00d;
const double cubaLibre = 9.00d;
const double espressoMartini = 12.00d;

if (a001cupon)
{
    Console.WriteLine($"Bienvenido {a001name}");
    Console.WriteLine("Precios con su descuento del 25%!!");
    Console.WriteLine($"San Francisco: {sanFrancisco * 0.75}usd");
    Console.WriteLine($"Mojito: {mojito * 0.75}usd");
    Console.WriteLine($"Tequila Sunrise: {tequilaSunrise * 0.75}usd");
    Console.WriteLine($"Cuba Libre: {cubaLibre * 0.75}usd");
    Console.WriteLine($"Espresso Martini: {espressoMartini * 0.75}usd");
}
else
{
    Console.WriteLine($"Bienvenido {a001name}");
    Console.WriteLine("Precios imperdibles!!");
    Console.WriteLine($"San Francisco: {sanFrancisco}usd");
    Console.WriteLine($"Mojito: {mojito}usd");
    Console.WriteLine($"Tequila Sunrise: {tequilaSunrise}usd");
    Console.WriteLine($"Cuba Libre: {cubaLibre}usd");
    Console.WriteLine($"Espresso Martini: {espressoMartini}usd");
}

public struct Cliente
{
    public Cliente(string name, string mail, bool cupon)
    {
        Name = name;
        Mail = mail;
        Cupon = cupon;
    }
    public string Name { get; set; }
    public string Mail { get; set;  }
    public bool Cupon { get; set; }

    public override string ToString() => $"({Name}, {Mail}, {Cupon})";
}
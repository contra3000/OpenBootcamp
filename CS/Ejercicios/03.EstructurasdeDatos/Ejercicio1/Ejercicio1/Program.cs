/*
Crea una estructura de datos para un cliente con estos campos:
 * Nombre completo
 * Teléfono
 * Dirección
 * Email
 * Si es nuevo cliente
Bonus: escribe un método para presentar estos datos desde la estructura al hacer Console.WriteLine(...)
*/

Cliente a001 = new Cliente("Mario Ledesma", 3214659221, "Pje. Marchenna 98", "pelapela182@gmail.com", true);
Console.WriteLine(a001);

public struct Cliente
{
    public Cliente(string name, long phone, string address, string mail, bool isNew)
    {
        Name = name;
        Phone = phone;
        Address = address;
        Mail = mail;
        IsNew = isNew;
    }
    public string Name { get; set; }
    public long Phone { get; set; }
    public string Address { get; set; }
    public string Mail { get; set; }
    public bool IsNew { get; set; }


    public override string ToString() => $"Cliente: {Name}\nTeléfono: {Phone}\nDirección: {Address}\nE-mail: {Mail}\nCliente nuevo? {IsNew}";
}


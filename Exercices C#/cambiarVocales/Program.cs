using System;

namespace cambiarVocales
{
    class Program
    {
        static void Main(string[] args)
        {
            string nombre;
		    Console.Write("Intruduzca su nombre: ");
	 	    nombre=Console.ReadLine();
		    nombre= nombre.Replace("a","4");
		    nombre= nombre.Replace("e","3");
		    nombre= nombre.Replace("i","1");
		    nombre= nombre.Replace("o","0");
		    nombre= nombre.Replace("u",")");
            Console.WriteLine(nombre);

        }
    }
}

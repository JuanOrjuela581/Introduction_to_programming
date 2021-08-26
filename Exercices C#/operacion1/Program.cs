using System;

namespace operacion1
{
    class Program
    {
        static void Main(string[] args)
        {
            double potencia= Math.Pow(3, 2);
	        double operacion1 = 3+potencia*7-5+20/2;
		    Console.WriteLine("El resultado de la operacion es: "+operacion1);
        }
    }
}

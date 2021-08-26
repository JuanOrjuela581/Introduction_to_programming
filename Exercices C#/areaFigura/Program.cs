using System;

namespace areaFigura
{
    class Program
    {
        static void Main(string[] args)
        {
            float radio;
            float hipotenusa;
            double area;

            Console.Write("Introduzca el valor del radio: ");
            radio= float.Parse(Console.ReadLine());
            Console.Write("Introduzca el valor de la hipotenusa: ");
            hipotenusa= float.Parse(Console.ReadLine());
            Console.WriteLine("El valor del radio es: "+radio+" \nEl valor de la hipotenusa es:"+hipotenusa);
            area=3.1416*radio*hipotenusa;
            Console.WriteLine("EL valor del area es: "+ area);

        }
    }
}

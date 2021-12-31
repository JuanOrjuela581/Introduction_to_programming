using System;
using System.Threading;

namespace produccionLeche
{
    class Program
    {
        static void Main(string[] args)
        {
            Finca nuevaFinca = new Finca(1, "La candelaria");
            
            for (int i = 0; i < 100; i++)
            {
                Thread.Sleep(500);
                Vaca unaVaca = Spawner.generarNuevaVaca();
                nuevaFinca.recibirVaca(unaVaca);
            }

            foreach (Vaca vaca in nuevaFinca.getVacas())
            {
                try
                {
                    Console.WriteLine("Nombre: "+vaca.getNombre());
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                    break;
                }
                
            }
            Console.WriteLine("La mayor produccion es: "+nuevaFinca.getMayorProduccion());
        }
    }
    
}
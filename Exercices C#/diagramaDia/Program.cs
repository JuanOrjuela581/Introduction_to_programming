using System;

namespace diagramaDia
{
    class Program
    {
        static void Main(string[] args)
        {
            string nombre;
            int dia;

            Console.WriteLine("Hola, cual es tu nombre? ");
            nombre= Console.ReadLine();
            Console.WriteLine("Hola!"+nombre);
            Console.WriteLine("Que dia deseas: \n1).Lunes \n2).Martes \n3).Miercoles \n4).Jueves \n5).Viernes");
            dia= Int32.Parse(Console.ReadLine());
            

            if(dia<=5 && dia>0){
                if(dia==1){
                    Console.WriteLine("Este dia comes fruta");
                }

                if(dia==2){
                    Console.WriteLine("Este dia comes calentado");
                }
                if(dia==3){
                    Console.WriteLine("Este dia comes avena");
                }

                if(dia==4){
                    Console.WriteLine("Este dia comes caldo");
                }

                if(dia==5){
                    Console.WriteLine("Este dia comes huevos");
                }
            }

        }
    }
}

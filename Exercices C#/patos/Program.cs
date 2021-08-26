using System;

namespace patos
{
    class Program
    {
        static void Main(string[] args)
        {
            string linea1="  _    ";
		    string linea2="__(.)<";
            string linea3="|___)";
		    string espacio="  ";
            
		    for(int i=0;i<5;i++){
			    Console.WriteLine(espacio+linea1);
			    Console.WriteLine(espacio+linea2);
			    Console.WriteLine(espacio+linea3);
                espacio+="  ";
		    }
        }
    }
}

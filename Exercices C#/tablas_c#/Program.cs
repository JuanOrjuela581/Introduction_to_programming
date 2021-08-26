using System;

namespace tablas_c_
{
    class Program
    {
        static void Main(string[] args)
        {
        int contador=1;

        for(int i=0;i<10;i++){
           // Console.WriteLine("Esta es la tabla del numero: "+ contador);
            Console.WriteLine(contador +" * 1= "+(contador*1));
            Console.WriteLine(contador +" * 2= "+(contador*2));
            Console.WriteLine(contador +" * 3= "+(contador*3));
            Console.WriteLine(contador +" * 4= "+(contador*4));
            Console.WriteLine(contador +" * 5= "+(contador*5));
            Console.WriteLine(contador +" * 6= "+(contador*6));
            Console.WriteLine(contador +" * 7= "+(contador*7));
            Console.WriteLine(contador +" * 8= "+(contador*8));
            Console.WriteLine(contador +" * 9= "+(contador*9));
            Console.WriteLine(contador +" * 10= "+(contador*10));
            contador++;
            Console.WriteLine("-----------------------");

        }
       
        }
    }
}

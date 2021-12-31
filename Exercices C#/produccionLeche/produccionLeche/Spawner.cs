using System;

namespace produccionLeche
{
    /*generar vacas aleatoriamente cada 5 seg*/
    
    public static class Spawner
    {
        private static int generarProduccion()
        {
            Random rd = new Random();
            return rd.Next(0,20);
        }
        private static int generarId()
        {
            Random rd = new Random();
            return rd.Next(0,20);
        }

        public static string nombreAleatorio()
        {
            string [] nombres = {"Luna","Mantequilla","Duende","Bessie","Botón de oro","Clarabelle","Dottie","Guinness","magia","Nellie","Penélope","Centavo","Rosie","Copo de nieve","Asperja","Azúcar"};
            Random rd = new Random();
            int posicion= rd.Next(0,16);
            return nombres[posicion];
        }

        public static DateTime generarFechaAleatoria()
        {
            Random rd = new Random();
            int dia= rd.Next(1,31);
            int mes= rd.Next(1,12);
            int año= rd.Next(DateTime.Now.Year-7,DateTime.Now.Year);
            DateTime fechaNacimiento = new DateTime(año, mes, dia);
            return fechaNacimiento;
        }

        public static Vaca generarNuevaVaca()
        {
            int produccion = generarProduccion();
            string nombre = nombreAleatorio();
            DateTime fechaCumpleaños = generarFechaAleatoria();
            Vaca unaVaca = new Vaca(nombre, fechaCumpleaños, produccion);
            return unaVaca;
        }
    }
}
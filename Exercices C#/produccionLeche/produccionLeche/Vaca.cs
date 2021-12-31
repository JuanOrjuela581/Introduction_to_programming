using System;

namespace produccionLeche
{
    public class Vaca
    {
        public enum Razas
        {
            JERSEY,
            GYR,
            HOLSTEIN,
            NORMANDO,
            
        }
        
        private int id;
        private string nombre;
        private float produccion;
        private DateTime fechaNacimiento;
        private string descripcion;
        private Razas raza;
        private int AI;
        private int AD;
        private int PI;
        private int PD;

        public Vaca(string nombre, DateTime fechaNacimiento, float produccion)
        {
            //this.id = id;
            this.nombre = nombre;
            this.fechaNacimiento = fechaNacimiento;
            this.produccion = produccion;
        }

        public void setProduccion(float produccion)
        {
            this.produccion = produccion;
        }

        public float getProduccion()
        {
            return produccion;
        }
        
        public void setNombre(string nombre)
        {
            this.nombre = nombre;
        }
        
        public string getNombre()
        {
            return this.nombre;
        }

        public void setFechaNacimiento(DateTime fechaNacimiento)
        {
            this.fechaNacimiento = fechaNacimiento;
        }

        public DateTime getFechaNacimiento()
        {
            return this.fechaNacimiento;
        }
        

        public override string ToString()
        {
            return "Nombre: " +this.nombre+" Produccion: "+this.produccion+ "Fecha de nacimento: "
                +fechaNacimiento;
        }
    }
}
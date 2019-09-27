
package cl.duoc;

public class Empleado {
    private String rut;
    private String nombre;
    private int edad;
    private int antiguedad;
    private int bono;

    public Empleado() {
    }

    public Empleado(String rut, String nombre, int edad, int antiguedad) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.antiguedad = antiguedad;
    }

    public int getBono() {
        return bono;
    }

    public void setBono(int bono) {
        this.bono = bono;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    public int montoBono(){
        if (this.antiguedad > 3) {
            return this.antiguedad * 50000;
        }else{
            return 0;
        }
    }
    
}

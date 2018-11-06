package empleados;

/**
 * Clase padre Empleado
 * @author Jaime Mayor Baeza
 */
public class Empleado {
    public String nombre;
    
    /**
     * Contructor vacio
     */
    public Empleado(){
    }
    
    /**
     * Constructor con nombre de empleado
     * @param nombre 
     */
    public Empleado(String nombre){
        this.nombre = nombre;
    }

    /**
     * Metodo para establecer nombre
     * @param nombre Nombre de empleado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para retornar el nombre
     * @return String Nombre de empleado
     */
    public String getNombre() {
        return nombre;
    }
   
    @Override
    public String toString(){
        return "Empleado " + this.nombre;
    }
}

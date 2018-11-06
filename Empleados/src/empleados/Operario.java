package empleados;
/**
 * Clase Operario
 * @author Jaime Mayor Baeza
 */
public class Operario extends Empleado{
    /**
     * Constructor vacio
     */
    public Operario(){
        super();
    }
    
    /**
     * Constructor con nombre de operario
     * @param nombre Nombre de operario
     */
    public Operario(String nombre){
        super(nombre);
    }

    @Override
    public String toString(){
        //Empleado Nombre -> Operario
        return super.toString() + " -> Operario";
    }
    
    
}

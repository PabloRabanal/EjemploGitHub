package empleados;
/**
 * Clase Tecnico
 * @author Jaime Mayor Baeza
 */
public class Tecnico extends Operario{
    /**
     * Constructor vacio
     */
    public Tecnico(){
        
    }
    
    /**
     * Constructor con el nombre
     * @param nombre Nombre del Tecnico
     */
    public Tecnico(String nombre){
        super(nombre);
    }
    
    @Override
    public String toString(){
        return super.toString() + " -> Tecnico";
    }
}

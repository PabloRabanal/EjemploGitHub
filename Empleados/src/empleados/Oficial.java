package empleados;
/**
 * Clase Oficial
 * @author Jaime Mayor Baeza
 */
public class Oficial extends Operario{
    /**
     * Constructor vacio
     */
    public Oficial(){
        
    }
    
    /**
     * Constructor con nombre de Oficial
     * @param nombre Nombre de oficial
     */
    public Oficial(String nombre){
        super(nombre);
    }
    
    @Override
    public String toString(){
        return super.toString()+ " -> Oficial";
    }
}

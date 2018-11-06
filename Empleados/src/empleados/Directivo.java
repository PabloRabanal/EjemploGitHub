package empleados;




public final class Directivo extends Empleado {
    /**
     * Constructor vacio
     */
    public Directivo(){
        
    }
    
    /**
     * Constructo con nombre de Directivo
     * @param nombre NOmbre de directivo
     */
    public Directivo(String nombre){
        super(nombre);
    }
    
    @Override
    public String toString(){
        return super.toString()+ " -> Directivo";
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

/**
 *
 * @author Jaime Mayor Baeza
 */
public class Empleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Jaime");
        System.out.println(e1);
        
        Operario o1 = new Operario("Jorge");
        System.out.println(o1);
        o1.setNombre("Pedro");
        System.out.println(o1);
        
        Directivo d1 = new Directivo();
        d1.setNombre("Carlos");
        System.out.println(d1);
        
        Oficial of1 = new Oficial("Javier");
        System.out.println(of1);
        
        Tecnico t1 = new Tecnico();
        t1.setNombre("Rodrigo");
        System.out.println(t1);
        System.out.println("El tecnico es: "+ t1.getNombre());
        
    }
    
}

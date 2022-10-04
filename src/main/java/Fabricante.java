package vehiculos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Fabricante {
    private String nombre;
    private Pais pais;
    //public int ventas=0;
    //public static ArrayList<Fabricante> fabricantes;
    static Map<Fabricante, Integer> ventasPorFabrica = new HashMap <Fabricante, Integer>();
    
    
    public Fabricante(String nombre, Pais pais){
        this.nombre=nombre;
        this.pais=pais;
        //this.ventas=0;
        //fabricantes.add(this);
    }

    public static Fabricante fabricaMayorVentas(){
        Fabricante fabricaMayorVentas = null;
        int valor = -1;
        
        for(Entry<Fabricante, Integer> entry : ventasPorFabrica.entrySet()){
            int vActual = entry.getValue();
            if(vActual > valor){
                valor = vActual;
                fabricaMayorVentas = entry.getKey();
            }
        }
        return fabricaMayorVentas;
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
    
    
}

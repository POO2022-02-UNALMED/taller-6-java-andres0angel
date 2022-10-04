package vehiculos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Pais {
    private String nombre;
    //private int ventas=0;
    //public static ArrayList<Pais> list = new ArrayList<Pais>();
    
    static Map<Pais, Integer> ventaPais = new HashMap <Pais, Integer>();
    
    public Pais(String nombre){
        this.nombre=nombre;
        //this.ventas=0;
        //list.add(this);
    }
    
    public static Pais paisMasVendedor(){
        Pais paisVendedor = null;
        int valor = -1;
        
        for(Map.Entry<Pais, Integer> entry : ventaPais.entrySet()){
            int vActual = entry.getValue();
            if(vActual > valor){
                valor = vActual;
                paisVendedor = entry.getKey();
            }
        }
        return paisVendedor;
    }

    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    
    
}
    
    
    


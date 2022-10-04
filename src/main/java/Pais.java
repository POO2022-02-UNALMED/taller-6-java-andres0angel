package vehiculos;

import java.util.ArrayList;

public class Pais {
    private String nombre;
    private int ventas;
    public static ArrayList<Pais> list = new ArrayList<Pais>();
    
    public Pais(String nombre){
        this.nombre=nombre;
        this.ventas=0;
        list.add(this);
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas){
        this.ventas=ventas;
    }
    
    
    
    public static Pais paisMasVendedor(){
        Pais paisMasVendedor = null;
        int ventas=-1;
        for (Pais nuevoPais: list){
            if(nuevoPais.ventas>ventas){
                ventas = nuevoPais.ventas;
                paisMasVendedor = nuevoPais;
            }
        }
        return paisMasVendedor;
    }
}

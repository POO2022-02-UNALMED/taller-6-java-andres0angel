package vehiculos;

import java.util.ArrayList;

public class Fabricante {
    public String nombre;
    public Pais pais;
    public int ventas=0;
    public static ArrayList<Fabricante> fabricantes;
    
    
    public Fabricante(String nombre, Pais pais){
        this.nombre=nombre;
        this.pais=pais;
        this.ventas=0;
        fabricantes.add(this);
    }

    public static Fabricante fabricaMayorVentas(){
        Fabricante fabricaMayorVentas = null;
        int vende = -1;
        for(Fabricante fabrica: fabricantes){
            if(fabrica.ventas>vende){
                fabricaMayorVentas=fabrica;
                vende = fabrica.ventas;
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

package vehiculos;

public class Camion extends Vehiculo{
    private int ejes;
    private static int cantidadCamiones;
    
    public Camion(String placa,String nombre,int precio,int peso,
            Fabricante fabricante, int ejes){
        super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
        
        this.ejes=ejes;
        cantidadCamiones++;
    }
    
    public int getEjes(){
        return this.ejes;
    }
    
    public void setejes(int ejes){
        this.ejes=ejes;
    }
    
    public static int getCantidadCamiones(){
        return cantidadCamiones;
    }
    
    public static void setCantidadCamiones(int cantidadCamiones){
        Camion.cantidadCamiones=cantidadCamiones;
    }
}

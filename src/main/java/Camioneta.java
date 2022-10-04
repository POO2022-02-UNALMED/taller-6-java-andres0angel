package vehiculos;

public class Camioneta extends Vehiculo{
    private boolean volco;
    private static int cantidadCamionetas;
    
    public Camioneta(String placa, int puertas,int velocidadMaxima,String nombre,int precio,int peso,String traccion,
            Fabricante fabricante, boolean volco){
        super(placa,puertas,90,nombre,precio,peso,"4X4",fabricante);
        this.volco=volco;
        
        cantidadCamionetas++;
    }
    
    public boolean isVolco(){
        return this.volco;
    }
    
    public static int getCantidadCamionetas(){
        return cantidadCamionetas;
    }
    
}

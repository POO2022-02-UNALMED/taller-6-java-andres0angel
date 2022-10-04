package vehiculos;

public class Vehiculo {
    private String placa;
    private int puertas;
    private int velocidadMaxima;
    private String nombre;
    private int precio;
    private int peso;
    private String traccion;
    private Fabricante fabricante;
    public static int cantidadVehiculos;
    
    
    public Vehiculo(String placa, int puertas,int velocidadMaxima,String nombre,int precio,int peso,String traccion,
            Fabricante fabricante){
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima= velocidadMaxima;
        this.nombre=nombre;
        this.precio=precio;
        this.peso=peso;
        this.traccion=traccion;
        this.fabricante=fabricante;
        
        /*if(Pais.ventasPorPais.containsKey(fabricante.getPais())) {
            Pais.ventasPorPais.put(fabricante.getPais(), Pais.ventasPorPais.get(fabricante.getPais()))
        }else{
            Pais.ventasPorPais.put(fabricante.getPais(),1);
        }
        
        if(Fabricante.ventasPorFabrica.containsKey(fabricante)){
            Fabricante.ventasPorFabrica.put(fabricante, Fabricante.ventasPorFabrica.get(fabricante)+1);
        }else{
            Fabricante.ventasPorFabrica.put(fabricante, 1);
        }*/
        
        cantidadVehiculos++;
    }
    
    public static String vehiculosPorTipo(){
        return "Automoviles: "+ Automovil.getCantidadAutomoviles()+ "\nCamionetas: " + Camioneta.getCantidadCamionetas()+
                "\nCamiones: " + Camion.getCantidadCamiones();
    }

    public String getPlaca() {
        return placa;
    }

    public int getPuertas() {
        return puertas;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getPeso() {
        return peso;
    }

    public String getTraccion() {
        return traccion;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public static int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public static void setCantidadVehiculos(int cantidadVehiculos) {
        Vehiculo.cantidadVehiculos = cantidadVehiculos;
    }
    
    
}

package ProyetoPokemon;


public class Movimiento {
    private String nombre;
    private String tipo;
    private int potencia; //PP
    private int precision; //PP
    private String efectoEspecial;
    

    public Movimiento(String nombre, String tipo, int potencia, int precision, String efectoEspecial) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.potencia = potencia;
        this.precision = precision;
        this.efectoEspecial = efectoEspecial;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public int getPotencia(){
        return potencia;
    }
    
    public int getPrecision(){
        return precision;
    }
    
    public String getEfectoEspecial(){
        return efectoEspecial;
    }
    
    public void usarMovimiento(Pokemon oponente){
        
    }
    
          
    
}

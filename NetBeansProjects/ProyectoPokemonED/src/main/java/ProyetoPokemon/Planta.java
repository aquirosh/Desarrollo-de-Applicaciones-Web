package ProyetoPokemon;

import java.util.Random;

public class Planta {
    private String nombre;
    private final String tipo = "Planta";
    private final String[] debilidades = {"Fuego"};
    private int Ataque = 50;
    private int defensa = 35;
    private int ataqueEspecial = 70; // Hasta 75 contra tipo agua
    private int defensaEspecial = 60; // Hasta 65 contra tipo Agua
    private int vida = 150;
    private int velocidad = 60;
    private Movimiento[] movimientos;
    
    public Planta(String nombre) {
        this.nombre = nombre;
        this.movimientos = new Movimiento[4];
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public String[] getDebilidades(){
        return debilidades;
    }
    
    public int getAtaque(){
        return Ataque;
    }
    
    public int getDefensa(){
        return defensa;
    }
    
    public int getAtaqueEspecial(){
        return ataqueEspecial;
    }
    
    public int getDefensaEspecial(){
        return defensaEspecial;
    }
    
    public int getVida(){
        return vida;
    }
    
    public int getVelocidad(){
        return velocidad;
    }
    
    public Movimiento[] getMovimientos(){
        return movimientos;
    }
    
    public void recibirDaño(int daño){
        this.vida -= daño;
    }
    
    public void TipoOponente (String tipoOponente){
        if (tipoOponente.equals("Agua")){
            this.ataqueEspecial = 75;
            this.defensaEspecial = 65;
        } else{
            this.ataqueEspecial = 70;
            this.defensaEspecial = 60;
            
        }
    }
    
    public void atacar(Planta oponente, Movimiento movimiento){
        
    }
    
    
}

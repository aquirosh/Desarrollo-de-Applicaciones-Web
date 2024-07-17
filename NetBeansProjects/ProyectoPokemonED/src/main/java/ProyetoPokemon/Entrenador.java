package ProyetoPokemon;

public class Entrenador {
    private String nombre;
    private Pokemon[] equipo;
    
    public Entrenador(String nombre){
        this.nombre = nombre;
        this.equipo = new Pokemon[6];
        
    }
    
    public void elegirPokemon(int indice){
        
    }
    
    public void cambiarPokemon(int indice, Pokemon nuevoPokemon){
        this.equipo[indice] = nuevoPokemon;
    }
    
    public void atacar(Pokemon oponente, Movimiento movimiento){
        
    }
    
}

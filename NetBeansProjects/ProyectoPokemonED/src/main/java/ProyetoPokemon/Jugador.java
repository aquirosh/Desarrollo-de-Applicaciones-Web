package ProyetoPokemon;

public class Jugador {
    private Entrenador entrenador;
    private Nodo pokedexCabeza;
    
    public Jugador(Entrenador entrenador){
        this.entrenador = entrenador;
        this.pokedexCabeza = null;
    }
    
    public void agregarPokemonPokedex(Pokemon pokemon){
        if (pokedexCabeza == null) {
            pokedexCabeza = new Nodo(pokemon);
        } else{
            Nodo actual = pokedexCabeza;
            while (actual.getSiguiente() != null){
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(new Nodo(pokemon));
        }
    }
    
    public void imprimirPokedex(){
        Nodo actual = pokedexCabeza;
        while(actual != null){
            System.out.println("Nombre: " + actual.getPokemon().getNombre());
            actual = actual.getSiguiente();
        }
    }
    public void iniciarBatalla(CPU oponente){
        
    }
    public void elegirAccion(String accion){
        
    }
    
    
    
}

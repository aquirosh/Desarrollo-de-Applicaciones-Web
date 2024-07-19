package ProyetoPokemon;

public class Nodo {
    private Pokemon pokemon;
    private Nodo siguiente;
 
    
    public Nodo(Pokemon pokemon){
        this.pokemon = pokemon;
        this.siguiente = null;
    }
    
    public Pokemon getPokemon(){
        return pokemon;
    }
    
    public void setSiguiente(Nodo siguiente){
        this.siguiente = siguiente;
    }
    
    public Nodo getSiguiente(){
        return siguiente;
    }
    
   
    
}

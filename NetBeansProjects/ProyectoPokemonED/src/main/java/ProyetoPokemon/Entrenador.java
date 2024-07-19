package ProyetoPokemon;

public class Entrenador {
    private String nombre;
    private Nodo equipoCabeza;
    private Nodo equipoActual;
    private int contadorEquipo;
    
    public Entrenador(String nombre){
        this.nombre = nombre;
        this.equipoCabeza = null;
        this.equipoActual = null;
        this.contadorEquipo = 0;
        
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void agregarPokemon(Pokemon pokemon){
        Nodo aux = new Nodo(pokemon);
        if(equipoCabeza == null){
            equipoCabeza = aux;
            
        } else {
            Nodo actual = equipoCabeza;
            while(actual.getSiguiente() != null){
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(aux);
        }
        contadorEquipo++;   
        
    }
    

     
     
     public void mostrarEquipo() {
        Nodo actual = equipoCabeza;
        while (actual != null) {
            System.out.println(actual.getPokemon().getNombre()+ " - " + actual.getPokemon().getTipo());
            actual = actual.getSiguiente();
        }
    }
     
     public Pokemon elegirPokemon(int indice) {
        Nodo actual = equipoCabeza;
        int contador = 1;
        while (actual != null) {
            if (contador == indice) {
                equipoActual = actual;
                return actual.getPokemon();
            }
            actual = actual.getSiguiente();
            contador++;
        }
        return null;
    }
     
     
   }
     
    


package ProyetoPokemon;

//public static void main(String[] args) {
        //System.out.println("Hello World!");

public class Pokemon {
    private String nombre;
    private String tipo;
    private String[] debilidades;
    private int Ataque;
    private int defensa;
    private int ataqueEspecial;
    private int defensaEspecial;
    private int Vida;
    private int velocidad;
    private Movimiento[] movimientos;
    
    public Pokemon(String nombre, String tipo, String[] debilidades, int puntosAtaque, int defensa, int ataqueEspecial, int defensaEspecial, int puntosSalud, int velocidad){
        this.nombre = nombre;
        this.tipo = tipo;
        this.debilidades = debilidades;
        this.Ataque = puntosAtaque;
        this.defensa = defensa;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaEspecial = defensaEspecial;
        this.Vida = puntosSalud;
        this.velocidad = velocidad;
        this.movimientos = new Movimiento[4];
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getTipo() {
        return tipo;
    }

    public String[] getDebilidades() {
        return debilidades;
    }

    public int getAtaque() {
        return Ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public int getDefensaEspecial() {
        return defensaEspecial;
    }

    public int Vida() {
        return Vida;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public Movimiento[] getMovimientos() {
        return movimientos;
    }
    
    public void atacar(Pokemon oponente, Movimiento movimiento){
        
    }
    
    public void daño (int daño){
        this.Vida -= daño;
    }
    
    public void usarMovimiento(int indice){
        
    }
    
    public void cambiarMovimiento(int indice, Movimiento nuevoMovimiento){
        this.movimientos[indice] = nuevoMovimiento;
    }

}

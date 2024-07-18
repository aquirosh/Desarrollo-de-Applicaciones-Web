package ProyetoPokemon;

public class Pokemon {
    private String nombre;
    private String tipo;
    private String[] debilidades;
    private int ataque;
    private int defensa;
    private int ataqueEspecial;
    private int defensaEspecial;
    private int vida;
    private int velocidad;
    private Movimiento[] movimientos;
    
    public Pokemon(String nombre, String tipo, String[] debilidades, int ataque, int defensa, int ataqueEspecial, int defensaEspecial, int vida, int velocidad){
        this.nombre = nombre;
        this.tipo = tipo;
        this.debilidades = debilidades;
        this.ataque = ataque;
        this.defensa = defensa;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaEspecial = defensaEspecial;
        this.vida = vida;
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
        return ataque;
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
        return vida;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public Movimiento[] getMovimientos() {
        return movimientos;
    }
    
    public void setAtaqueEspecial(int ataqueEspecial){
        this.ataqueEspecial = ataqueEspecial;
    }
    
    public void setDefensaEspecial(int defensaEspecial){
        this.defensaEspecial = defensaEspecial;
    }
    
    public void daño (int daño){
        this.vida -= daño;
    }
    
    
    
    
    
    public void usarMovimiento(int indice){
        
    }
    
    public void cambiarMovimiento(int indice, Movimiento nuevoMovimiento){
        this.movimientos[indice] = nuevoMovimiento;
    }
    
     
   public void atacar(Pokemon oponente, Movimiento movimiento){
        
    }

}


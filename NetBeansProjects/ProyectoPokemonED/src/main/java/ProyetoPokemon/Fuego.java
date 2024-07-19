package ProyetoPokemon;

public class Fuego extends Pokemon {
    public Fuego(String nombre){
        super(nombre, "Fuego", "Agua", 70, 45, 80, 60, 115, 0);
    }
    
    @Override
    public void atacar (Pokemon oponente, Movimiento movimiento){
        if (oponente.getTipo().equals("Planta")){
            this.setAtaqueEspecial(85);
            this.setDefensaEspecial(85);
        } else {
            this.setAtaqueEspecial(80);
            this.setDefensaEspecial(60);
        }
        
        //Metodo Atacar
    }
}
    


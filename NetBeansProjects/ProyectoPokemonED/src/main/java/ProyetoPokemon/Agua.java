package ProyetoPokemon;

public class Agua extends Pokemon {
    public Agua(String nombre){
        super(nombre,"Agua","Planta", 55, 45, 75, 65, 190, 0);
    }
    
    @Override
    public void atacar(Pokemon oponente, Movimiento movimiento){
        if (oponente.getTipo().equals("Fuego")){
            this.setAtaqueEspecial(85);
            this.setDefensaEspecial(75);
        } else {
            this.setAtaqueEspecial(75);
            this.setDefensaEspecial(65);
        }
        
        //Metodo Atacar
    }
}
    
    


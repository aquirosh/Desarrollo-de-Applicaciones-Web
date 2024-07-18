package ProyetoPokemon;

public class Planta extends Pokemon {
    public Planta(String nombre){
        super(nombre,"Planta", new String[]{"Fuego"}, 50, 35, 70, 60, 150, 0);
    }
   

    @Override
    public void atacar(Pokemon oponente, Movimiento movimiento){
        if (oponente.getTipo().equals("Agua")){
                this.setAtaqueEspecial(75);
                this.setDefensaEspecial(65);
        } else{
            this.setAtaqueEspecial(70);
            this.setDefensaEspecial(65);
 
        }
        //Metodo Atacar
    }
}

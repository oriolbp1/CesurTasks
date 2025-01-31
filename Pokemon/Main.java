public class Main {
    public static void main(String[] args) {
        PokemonFuego charizard = new PokemonFuego(
            6, "Charizard", 80, 60, 200, 50, "Fuego", 
            "Llamarada", 90, "Agua", 15
        );

        PokemonTierra torterra = new PokemonTierra(
            389, "Torterra", 70, 70, 220, 45, "Tierra", 
            "Terremoto", 85, "Aire", 12
        );

        Combate combate = new Combate(charizard, torterra);
        combate.iniciarCombate();
    }
}

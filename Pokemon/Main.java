import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el nombre del Entrenador 1: ");
        String nombreEntrenador1 = scanner.nextLine();
        Entrenador entrenador1 = new Entrenador(nombreEntrenador1);

        System.out.print("Ingresa el nombre del Entrenador 2: ");
        String nombreEntrenador2 = scanner.nextLine();
        Entrenador entrenador2 = new Entrenador(nombreEntrenador2);

        System.out.println("\n🔹 Selección de Pokémon 🔹");
        PokemonFuego charizard = crearPokemonFuego();
        PokemonTierra torterra = crearPokemonTierra();

        entrenador1.agregarPokemon(charizard);
        entrenador2.agregarPokemon(torterra);

        System.out.println("\n✅ " + entrenador1.getNombre() + " ha elegido a " + charizard.getNombre());
        System.out.println("✅ " + entrenador2.getNombre() + " ha elegido a " + torterra.getNombre());

        // 3️⃣ Iniciar el combate
        System.out.println("\n⚔️ ¡Comienza el combate entre " nombreEntranador1 +" con "+ charizard.getNombre() + " y " + nombreEntranador2 + " con "+ torterra.getNombre() + "! ⚔️");
        Combate combate = new Combate(charizard, torterra);
        combate.iniciarCombate();

        scanner.close();
    }

    // Método para crear un Pokémon de tipo Fuego
    private static PokemonFuego crearPokemonFuego() {
        return new PokemonFuego(
            6, "Charizard", 80, 60, 200, 50, "Fuego",
            "Llamarada", 90, "Agua", 15
        );
    }

    // Método para crear un Pokémon de tipo Tierra
    private static PokemonTierra crearPokemonTierra() {
        return new PokemonTierra(
            389, "Torterra", 70, 70, 220, 45, "Tierra",
            "Terremoto", 85, "Aire", 12
        );
    }
}

public class Combate {
    private Pokémon pokemon1;
    private Pokémon pokemon2;

    public Combate(Pokémon pokemon1, Pokémon pokemon2) {
        this.pokemon1 = pokemon1;
        this.pokemon2 = pokemon2;
    }

    public void iniciarCombate() {
        System.out.println("🔥 ¡Comienza el combate entre " + pokemon1.getNombre() + " y " + pokemon2.getNombre() + "! ⚡");

        while (pokemon1.getVida() > 0 && pokemon2.getVida() > 0) {
            atacar(pokemon1, pokemon2);
            if (pokemon2.getVida() <= 0) {
                System.out.println("🏆 " + pokemon1.getNombre() + " gana el combate!");
                break;
            }

            atacar(pokemon2, pokemon1);
            if (pokemon1.getVida() <= 0) {
                System.out.println("🏆 " + pokemon2.getNombre() + " gana el combate!");
                break;
            }
        }
    }

    private void atacar(Pokémon atacante, Pokémon defensor) {
        int extraDaño = calcularExtraDaño(atacante, defensor);
        int dañoBase = (atacante.getFuerza() + atacante.getNivel()) - defensor.getDefensa();
        int dañoTotal = dañoBase + extraDaño;

        if (dañoTotal < 0) {
            dañoTotal = 1; // Asegurar que siempre haya al menos 1 de daño
        }

        // 🔹 Mostrar en consola el daño que se va a causar antes de atacar
        System.out.println("📝 " + atacante.getNombre() + " está por atacar a " + defensor.getNombre() + "...");
        System.out.println("💥 Daño base: " + dañoBase);
        if (extraDaño > 0) {
            System.out.println("🔥 Extra daño por ventaja de tipo: " + extraDaño);
        }
        System.out.println("⚔️ Daño total causado: " + dañoTotal + "\n");

        defensor.recibirDaño(dañoTotal);
        System.out.println("💖 " + defensor.getNombre() + " tiene " + defensor.getVida() + " de vida restante.\n");
    }

    private int calcularExtraDaño(Pokémon atacante, Pokémon defensor) {
        if (atacante instanceof PokemonFuego && defensor.getTipo().equals("Tierra")) {
            return ((PokemonFuego) atacante).getExtraDañoTierra();
        }
        if (atacante instanceof PokemonAgua && defensor.getTipo().equals("Fuego")) {
            return ((PokemonAgua) atacante).getExtraDañoFuego();
        }
        if (atacante instanceof PokemonTierra && defensor.getTipo().equals("Aire")) {
            return ((PokemonTierra) atacante).getExtraDañoAire();
        }
        if (atacante instanceof PokemonAire && defensor.getTipo().equals("Agua")) {
            return ((PokemonAire) atacante).getExtraDañoAgua();
        }
        return 0;
    }
}

package Unit5_Classes.examples.HeroVillainExample;

public class MarvelMovieTester {
    /**
     * battle simulates a battle between hero and villain; whichever has greater
     * strength will win the battle
     *      Winner will gain 10% of the strength of the loser
     *      Loser will lose between 5-35% (inclusive) of its OWN strength
     *      If it's a tie, then BOTH parties lose between 5-35% (inclusive)
     *          of their strength
     *      Print the result of the battle, as wel as their new strength
     *      levels afterwards
     * @param hero
     * @param villain
     */
    public static void battle(SuperHero hero, Villain villain){
        int randNum = 0;
        if (hero.getSuperPower().getPowerStrength() > villain.getSuperPower().getPowerStrength()){
            // Hero wins
            hero.getSuperPower().setPowerStrength(hero.getSuperPower().getPowerStrength() + 0.1 * villain.getSuperPower().getPowerStrength());
            randNum = (int)(Math.random() * 31) + 5;
            villain.getSuperPower().setPowerStrength(villain.getSuperPower().getPowerStrength() * (1 - randNum / 100.0));
            System.out.println("\nHero's strength: " + hero.getSuperPower().getPowerStrength());
            System.out.println("Villain's strength: " + villain.getSuperPower().getPowerStrength() + "\n");
        } else if (villain.getSuperPower().getPowerStrength() > hero.getSuperPower().getPowerStrength()){
            // Villain wins
            villain.getSuperPower().setPowerStrength(villain.getSuperPower().getPowerStrength() + 0.1 * hero.getSuperPower().getPowerStrength());
            randNum = (int)(Math.random() * 31) + 5;
            hero.getSuperPower().setPowerStrength(hero.getSuperPower().getPowerStrength() * (1 - randNum / 100.0));
            System.out.println("\nHero's strength: " + hero.getSuperPower().getPowerStrength());
            System.out.println("Villain's strength: " + villain.getSuperPower().getPowerStrength() + "\n");
        } else {
            // Tie
            randNum = (int)(Math.random() * 31) + 5;
            hero.getSuperPower().setPowerStrength(hero.getSuperPower().getPowerStrength() * (1 - randNum / 100.0));
            randNum = (int)(Math.random() * 31) + 5;
            villain.getSuperPower().setPowerStrength(villain.getSuperPower().getPowerStrength() * (1 - randNum / 100.0));
            System.out.println("\nHero's strength: " + hero.getSuperPower().getPowerStrength());
            System.out.println("Villain's strength: " + villain.getSuperPower().getPowerStrength() + "\n");
        }
    }

    /**
     * epicBattle simulates num amount of battles while hero and villain have strength > 0
     * @param hero
     * @param villain
     * @param num
     */
    public static void epicBattle(SuperHero hero, Villain villain, int num){
        for (int i = 0; i < num; i++){
            // Loops num times
            if (hero.getSuperPower().getPowerStrength() > 0 && villain.getSuperPower().getPowerStrength() > 0){
                // If both hero and villain have strength > 0, simulate 1 battle
                battle(hero, villain);
            }
            else {
                // Exit loop if condition isn't met
                break;
            }
        }
    }
    public static void main(String[] args) {
        Power power1 = new Power("Flight", 10);

        SuperHero Hi = new SuperHero("Hi", power1);
        Villain Bye = new Villain("Bye", power1);
        System.out.println(Hi.toString());
        System.out.println(Bye.toString());

        System.out.println(Hi);
        System.out.println(Bye);

        Hi.getSuperPower().setPowerStrength(1250);
        Bye.getSuperPower().setPowerStrength(1250);

        epicBattle(Hi, Bye, 10);

        System.out.println(Hi);
        System.out.println(Bye);
    }
}

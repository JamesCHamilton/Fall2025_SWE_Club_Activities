package meeting2;

public class Pokemon {

    private String name;
    private String type;
    private String secondType;
    private int level;
    private int attackPower;


    protected Pokemon(String name, String type, int level, int attackPower) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.attackPower = attackPower;
    }

    protected Pokemon(String name, String type, String secondType, int level, int attackPower) {
        this.name = name;
        this.type = type;
        this.secondType = secondType;
        this.level = level;
        this.attackPower = attackPower;
    }

    private void levelUp() {
        this.level += 1;
    }

    private void evolve(String newName) {
        this.name = newName;
        this.attackPower += 20;
    }

    private void attack() {
        System.out.println(this.name + " attacks with power " + this.attackPower);
    }

    public String getName() {return name;}
    public String getType() {return type;}
    public String getSecondType() {return secondType;}
    public int getLevel() {return level;}
    public int getAttackPower() {return attackPower;}
    public void levelUpPublic() {levelUp();}
    public void evolvePublic(String newName) {evolve(newName);}
    public void attackPublic() {attack();}


    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                (secondType != null ? ", secondType='" + secondType + '\'' : "") +
                ", level=" + level +
                ", attackPower=" + attackPower +
                '}';
    }

     public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu", "Electric", 25, 60);
        System.out.println(pikachu);
        pikachu.levelUpPublic();
        System.out.println(pikachu);
        pikachu.attackPublic();

        Pokemon charizard = new Pokemon("Charizard", "Fire", "Flying", 50, 100);
        System.out.println(charizard);
        charizard.evolvePublic("Mega Charizard X");
        System.out.println(charizard);
        charizard.attackPublic();
    }
}

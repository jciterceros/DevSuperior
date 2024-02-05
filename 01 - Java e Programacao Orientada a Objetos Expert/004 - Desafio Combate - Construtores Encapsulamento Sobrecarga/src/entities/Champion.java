package entities;

public class Champion {
    private String name;
    private int life;
    private int attack;
    private int armor;

    public Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    private void setLife(int life) {
        this.life = life;
    }

    public int getAttack() {
        return attack;
    }

    public int getArmor() {
        return armor;
    }

    public void takeDamage(Champion other) {
        int damage = 0;
        if (getArmor() > other.getAttack()) {
            damage = getLife() - 1;
        } else {
            damage = getLife() + getArmor() - other.getAttack();
        }
        setLife(damage);
    }

    public String status() {
        if (this.getLife() < 0) {
            return this.getName() + ": 0 de vida (morreu)";
        }
        return this.getName() + ": " + this.getLife() + " de vida";
    }
}

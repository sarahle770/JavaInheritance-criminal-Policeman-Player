/**
 * This file is a part of JavaInheritance project.
 *
 * @author Sarah Cynamon
 * @version 1.0.0
 */
public abstract class Player {
    protected String name;
    protected int strength;

    public Player(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    protected boolean isAlive() {
        return strength != 0;
    }

    protected int knockOut() {
        int pastStrength = strength;
        strength = 0;
        return pastStrength;
    }

    @Override
    public String toString() {
        return "Player:" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                '.';
    }
}

import java.util.Arrays;

/**
 * This file is a part of JavaInheritance project.
 *
 * @author Sarah Cynamon
 * @version 1.0.0
 */
public class Policeman extends Player {
    //storage the maximum criminal the policeman can arrest
    private static final int MAX_NUM_CRIMINALS = 3;
    //storage the criminal the policeman arrested
    private final Criminal[] arrestedCriminals;
    //storage the number of the criminals that are arrested in the Array
    private int totalArrested;


    public Policeman(String name, int strength) {
        super(name, strength);
        totalArrested = 0;
        arrestedCriminals = new Criminal[MAX_NUM_CRIMINALS];
    }

    public boolean arrestedAll() {
        return totalArrested == MAX_NUM_CRIMINALS;
    }

    public boolean arrest(Criminal criminal) {
        if (!arrestedAll() && isAlive() && criminal.isAlive()) {
            if (strength > criminal.strength) {
                //  Arrest the criminal
                strength -= criminal.knockOut();
                arrestedCriminals[totalArrested] = criminal;
                totalArrested++;
                return true;
            } else if (strength < criminal.strength) {
                //  Policman losese
                criminal.strength -= knockOut();
            } else {
                //  both lost
                knockOut();
                criminal.knockOut();
            }
        }
        return false;
    }

    public void showArrestedCriminals() {
        if (totalArrested > 0) {
            System.out.println(
                    "Name: " + name + " have arrested Criminals: " + "\n" + Arrays.toString(arrestedCriminals));
        } else {
            System.out.println("Name: " + name + "\n" + " have been arrested no one ");
        }
    }
}



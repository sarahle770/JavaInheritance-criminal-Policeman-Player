/**
 * This file is a part of JavaInheritance project.
 *
 * @author Sarah Cynamon
 * @version 1.0.0
 */
public class Criminal extends Player {

    public Criminal(String name, int strength) {
        super(name, strength);
    }

    public Criminal(Criminal criminal) {
        this(criminal.name, criminal.strength);
    }
}


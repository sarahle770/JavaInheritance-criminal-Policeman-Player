/**
 * This file is a part of JavaInheritance project.
 *
 * @author Sarah Cynamon
 * @version 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        Criminal[] criminals = new Criminal[6];
        criminals[0] = new Criminal("Damien", 4);
        criminals[1] = new Criminal("Pipo", 5);
        criminals[2] = new Criminal("Denis", 5);
        criminals[3] = new Criminal("Marco", 6);
        criminals[4] = new Criminal("Moshe", 8);
        criminals[5] = new Criminal("Baruch", 29);

        Policeman[] policemen = new Policeman[3];
        policemen[0] = new Policeman("David", 15);
        policemen[1] = new Policeman("Antonio", 19);
        policemen[2] = new Policeman("Pablo", 50);

        for (int i = 0; i < policemen.length; i++) {
            for (int j = 0; j < criminals.length; j++) {
                if (policemen[i].arrest(criminals[j])) ;
                {
                    System.out.println(policemen[i] + " arrested " + criminals[j]);
                }
            }
        }
        for (int i = 0; i < policemen.length; i++) {
            policemen[i].showArrestedCriminals();

        }
    }
}


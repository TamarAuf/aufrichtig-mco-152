package aufrichtig.projectile;

import java.util.*;
public class ProjectileMath {

    public static final int NUM_PROJECTILES = 5;

    public static void main(String[] args)
    {
        Random rand = new Random();
        double randAng = rand.nextDouble() * 180;
        double randVel = rand.nextDouble() * 100;

        ArrayList<Projectile> list = new ArrayList();
        for(int i = 0; i < NUM_PROJECTILES; i++) {
            list.add(new Projectile(randAng, randVel));
        }
        for(Projectile projectile : list) {
            for(int j = 0; j< 11; j++) {
                System.out.println(projectile);
                projectile.increaseTime(1);
            }
        }
    }

}

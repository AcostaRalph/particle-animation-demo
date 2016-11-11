package PaSkCode;

import java.util.ArrayList;

public class PSysModel {
    // ArrayList or similar of particles
    // each particle: x, y, velX, velY, radius
    ArrayList <Particle> pList;

    PSysModel() {
	// instantiate list of particles
        pList = new ArrayList <Particle>();
    }

    // add a particle to list
    void add(int rad, int x, int y, int vx, int vy) {    
        
        Particle particle = new Particle(rad, x, y, vx, vy);
        pList.add(particle);
        System.out.println("Added: " + rad + " " + x + " " + y);
        
    }


    // update state of each particle in list
    void update(int bw, int bh) {
        for (int i = 0; i < pList.size(); i++){
            pList.get(i).px += pList.get(i).velX;
            pList.get(i).py += pList.get(i).velY;

            if (pList.get(i).px >= bw-pList.get(i).radius && 
                pList.get(i).velX > 0) {
                pList.get(i).velX = -pList.get(i).velX;
            }
            else if (pList.get(i).px < pList.get(i).radius && 
                pList.get(i).velX < 0) {
                pList.get(i).velX = -pList.get(i).velX;
            }

            if (pList.get(i).py >= bh-pList.get(i).radius && 
                pList.get(i).velY > 0) {
                pList.get(i).velY = -pList.get(i).velY;
            }
            else if (pList.get(i).py < pList.get(i).radius && 
                pList.get(i).velY < 0) {
                pList.get(i).velY = -pList.get(i).velY;
            }
        }
    }
}

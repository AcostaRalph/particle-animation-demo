package PaSkCode;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

public class PSysView {
    
    int logCycleFrameCounter = 1;

    PSysView() {
    }

    // draw all particles in psm
    void draw(PSysModel psm, Graphics g) {

    Graphics2D g2d = (Graphics2D) g;
	
	for(int i = 0; i < psm.pList.size(); i++){
		g2d.setColor(Color.RED);
		g2d.fillOval(psm.pList.get(i).px-psm.pList.get(i).radius, 
			psm.pList.get(i).py-psm.pList.get(i).radius, 
			psm.pList.get(i).radius*2, psm.pList.get(i).radius*2);
	}

    }

    // dump information on all particles in psm
    void dump(PSysModel psm, int lc) {
    	
    	//System.out.println("Frame " + lc);
    	System.out.println("Frame " + ( lc * logCycleFrameCounter));
    	logCycleFrameCounter++;
	    for(int i = 0; i < psm.pList.size(); i++){
	    	System.out.println(psm.pList.get(i).radius + " " + 
	    		psm.pList.get(i).px + " " 
	    		+ psm.pList.get(i).py + " " + psm.pList.get(i).velX + " " 
	    		+ psm.pList.get(i).velY);
	    	
		}
    }
}

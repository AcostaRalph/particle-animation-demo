package PaSkCode;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.util.Random;

public class Particle {

	int radius;
	int px;
	int py;
	int velX;
	int velY;

	Particle(){
	}

	Particle(int rad, int x, int y, int vx, int vy){
		radius = rad;
        px = x;
        py = y;
        velX = vx;
        velY = vy;    
	}

	
}
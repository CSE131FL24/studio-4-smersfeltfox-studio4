package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(212,252,255);
		StdDraw.filledRectangle(.5, .3, .5, .3);
		
		StdDraw.setPenColor(51,35,145);
		double[] x1 = {0,0,.3};
		double[] y1 = {0,.6,.3};
		StdDraw.filledPolygon(x1,y1);
		
		double[] x2 = {1,1,.7};
		double[] y2 = {0,.6,.3};
		StdDraw.filledPolygon(x2,y2);
		
		StdDraw.filledCircle(.5, .3, .25);
		
		StdDraw.setPenColor(255,255,255);
		double[] x3 = {.5,.4,.6};
		double[] y3 = {.4,.25,.25};
		StdDraw.filledPolygon(x3,y3);
		
		StdDraw.setPenColor(255,255,255);
		double[] x4 = {.5,.4,.6};
		double[] y4 = {.2,.35,.35};
		StdDraw.filledPolygon(x4,y4);
		
		StdDraw.setPenRadius(.015);
		StdDraw.line(0, .3, 1, .3);
		
		StdDraw.setPenRadius(.005);
		StdDraw.filledCircle(.15, .3, .05);
		StdDraw.circle(.85, .3, .05);
	}
}
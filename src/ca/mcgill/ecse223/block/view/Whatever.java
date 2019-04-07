package ca.mcgill.ecse223.block.view;

import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

public class Whatever {
	
	
	
	public double slope(Line2D l) {
		
		double result = 0;
		double x1 = l.getX1();
		double x2 = l.getX2();
		double y1 = l.getY1();
		double y2 = l.getY2();
		
		result = ((y2 - y1)/(x2 - x1));
		
		return result;
	}
	
	
	@SuppressWarnings("unused")
	private List<Point2D> getInterectionPoints(Line2D l, double xc, double yc, double r){
		
		List<Point2D> list = new ArrayList<Point2D>();
			Double m = slope(l);
			double xl = l.getX1();
			double yl= l.getY1();
			if(m == null) {
				List<Double> yvals = new ArrayList<Double>();
				double x = xl;
				double radicand = r*r - (x-xc)*(x-xc);
				if(radicand >= 0) {
					yvals.add(yc - Math.sqrt(radicand));
					yvals.add(yc+Math.sqrt(radicand));
				}
				for(Double yval : yvals) {
					if(yval <= Math.min(yl, l.getY2()) && yval >= Math.max(yl, l.getY2())) {
						list.add(new Point2D.Double(x, yval));
					}
				}
			}
			else {
				List<Double> xvals = new ArrayList<Double>();
				double a = (m*m +1);
				double b = 2*m*(-m*xl+yl-yc)-2*xc;
				double c = Math.pow(-m*xl+yl-yc, 2) - r*r + xc*xc;
				if(b*b - 4*a*c >= 0) {
					xvals.add((-b+ Math.sqrt(b*b - 4*a*c))/(2*a));
					xvals.add((-b - Math.sqrt(b*b - 4*a*c))/(2*a));
				}
				for (Double xval : xvals) {
					if(xval <= Math.max(xl,  l.getX2()) && xval >= Math.min(xl, l.getX2())){
						list.add(new Point2D.Double(xval, m*xval - m*xl + yl));
					}
				}
			}
			return list;
	}
}

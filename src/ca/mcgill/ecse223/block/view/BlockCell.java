package ca.mcgill.ecse223.block.view;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JPanel;

public class BlockCell {

	public JPanel block;
	int HorizontalGridPosition;
	int VerticalGridPosition;
	public static Map<Integer, Integer> Hpositions =new HashMap<Integer, Integer>();
	public static Map<Integer, Integer> Vpositions =new HashMap<Integer, Integer>();
	Integer x_coordinate=10;
	Integer y_coordinate=2;
	int red;
	int green;
	int blue;
	int points;
	
	public BlockCell(int xGridPos, int yGridPos, int red, int green, int blue, int points){
		xGridPos=HorizontalGridPosition;
		yGridPos=VerticalGridPosition;
		this.red=red;
		this.green=green;
		this.blue=blue;
		this.points=points;
	
		for( Integer i=0;i<15;i++) {
			Hpositions.put(i,x_coordinate);
			x_coordinate=x_coordinate+25;
		}
		
		for( Integer i=0;i<10;i++) {
			Vpositions.put(i,y_coordinate);
			y_coordinate=y_coordinate+22;
		}
	
		block=new JPanel();
		block.setBounds(Hpositions.get(HorizontalGridPosition), Vpositions.get(VerticalGridPosition), 20,20);
		block.setForeground(new Color(red, green, blue));
	}
	

}

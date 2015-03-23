package com.example.figure.root;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;

public class WhileFigure extends ContainerFigure {
	public WhileFigure(){
		super();
		//highlight= true;
	}
	public Dimension getPreferredSize(int wHint, int hHint) {
		return FigureDimensionConstant.SIZE_PORT_ELEMENT;
	}

	protected void paintFigure(Graphics g) {
        super.paintFigure(g);
		
		int x = getMainRect().x;
		int y = getMainRect().y;
		int w = getMainRect().width;
		int h = getMainRect().height;
		
		Rectangle main = new Rectangle(x,y, w, h);
		
		
		g.fillRoundRectangle(main, 2, 2);
		g.drawRoundRectangle(main, 2, 2);
		
		if(isShow()){
			drawLabelFrame(g,getNameFigure().getBounds(),true);
			//drawLabelFrame(g,getTypeFigure().getBounds(),true);
		}
		
	}	
}
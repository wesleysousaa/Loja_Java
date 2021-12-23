package classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class JPanelArredondado extends JPanel{
    private Color backgroundColor;
    private int cornerRadius;

    public JPanelArredondado(int radius, Color bgColor) {
        super();
        cornerRadius = radius;
        backgroundColor = bgColor;
    }
        
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Dimension dims = new Dimension(cornerRadius, cornerRadius);
        int width = getWidth();
        int height = getHeight();
        //Criação do elemento resposável por pintar
        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //Nessa parte, será desenhado o painel arredondado com bordas.
        if (backgroundColor != null) {
            graphics.setColor(backgroundColor);
        } else {
            graphics.setColor(getBackground());
        }
        graphics.fillRoundRect(0, 0, width-1, height-1, dims.width, dims.height); //Pinta com as dimensões escolhidas
        graphics.setColor(getForeground());

    }
    
}
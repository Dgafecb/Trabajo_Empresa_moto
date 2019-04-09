package modelo;


import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.RoundRectangle2D;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicButtonUI;


public class CustomButtonShaped extends JButton implements MouseListener, MouseMotionListener {
    
    private Color colorNormalGrad1 = new Color(0, 139, 139);
    private Color colorNormalGrad2 = new Color(0, 139, 139);
    
    private Color colorPressedGrad1 = new Color(0, 0, 0);
    private Color colorPressedGrad2 = new Color(0, 0, 0);
    
    /**
     * Color para el fondo del boton
     */
    private Color colorBackground = new Color(250, 250, 250);
    
    private Border bordeMoved = javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255));
    /**
     * Color para el texto
     */
    private Color colorTextNormal = new Color(255, 255, 255);
    private Color colorTextPressed = new Color(255, 255, 255);
    private Color colorTextHover = new Color(255, 255, 255);
    
    private Font f = new Font("Tahoma", Font.BOLD, 14);

    /**
     * Constructor de clase
     */
    @SuppressWarnings("LeakingThisInConstructor")
    public CustomButtonShaped() {
        this.setUI(new ShapedButtonUI());
        this.setFont(f);
        this.setPreferredSize(new Dimension(150, 35));
        this.setSize(new Dimension(150, 35));
        this.setBorder(null);
         this.setBorderPainted(false);
        this.setContentAreaFilled(false);
        this.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.setBackground(this.colorBackground);
        this.setForeground(this.colorTextNormal);
        this.setOpaque(true);
        
        this.setVisible(true);
        
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    /**
     * se pinta la imagen con dimensiones de ancho y alto iguales al alto del
     * jbutton
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
    public void mouseClicked(MouseEvent e) {
       
    }

    /**
     * Cuando se presiona el boton se cambian los colores de fondo y de texto
     */
    public void mousePressed(MouseEvent e) {
        this.setForeground(this.colorTextPressed);
    }

    /**
     * Cuando se leventa el mouse del jbutton se retoman los colores originales
     */
    public void mouseReleased(MouseEvent e) {       
        this.setForeground(this.colorTextNormal);
    }

    public void mouseEntered(MouseEvent e) {       
    }

    public void mouseExited(MouseEvent e) {
        this.setBorder(null);
        this.setForeground(this.colorTextNormal);
    }


    public Color getColorTextPressed() {
        return colorTextPressed;
    }

    public void setColorTextPressed(Color colorTextPressed) {
        this.colorTextPressed = colorTextPressed;
    }

    public Color getColorTextHover() {
        return colorTextHover;
    }

    public void setColorTextHover(Color colorTextHover) {
        this.colorTextHover = colorTextHover;
    }

    public Color getColorBackground() {
        return colorBackground;
    }

    public void setColorBackground(Color colorBackground) {
        this.setBackground(colorBackground);
        this.colorBackground = colorBackground;      
    }

    public Color getColorTextNormal() {
        return colorTextNormal;
    }

    public void setColorTextNormal(Color colorTextNormal) {
        this.setForeground(colorTextNormal);
        this.colorTextNormal = colorTextNormal;
    }
    
    public Border getColorBorde() {
        return bordeMoved;
    }

    public void setColorBorde(Border bordeMoved) {
        this.bordeMoved = bordeMoved;
    }

    public Color getColorNormalGrad1() {
        return colorNormalGrad1;
    }

    public void setColorNormalGrad1(Color colorNormalGrad1) {
        this.colorNormalGrad1 = colorNormalGrad1;
    }

    public Color getColorNormalGrad2() {
        return colorNormalGrad2;
    }

    public void setColorNormalGrad2(Color colorNormalGrad2) {
        this.colorNormalGrad2 = colorNormalGrad2;
    }

    public Color getColorPressedGrad1() {
        return colorPressedGrad1;
    }

    public void setColorPressedGrad1(Color colorPressedGrad1) {
        this.colorPressedGrad1 = colorPressedGrad1;
    }

    public Color getColorPressedGrad2() {
        return colorPressedGrad2;
    }

    public void setColorPressedGrad2(Color colorPressedGrad2) {
        this.colorPressedGrad2 = colorPressedGrad2;
    }

    
    @Override
    public void mouseDragged(MouseEvent e) {
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
        this.setForeground(this.colorTextHover);
        
        this.setBorder(bordeMoved);
    }
    
    private class ShapedButtonUI extends BasicButtonUI {
 
 
         public ShapedButtonUI() {
            super();
        }
 
 
        @Override
        public void paint(Graphics g, JComponent c) {
 
        Graphics2D g2d = (Graphics2D) g;
        ApplyQualityRenderingHints(g2d);//
        Shape buttonShape = null;
   
        buttonShape = new RoundRectangle2D.Double(0, 0, c.getWidth() - 1, c.getHeight() - 1, 25, 25);
   
        /*
        Establecemos un gradiente para el fondo del boton
        */
        GradientPaint gp = new GradientPaint(0, 0, colorNormalGrad1, c.getWidth(), c.getHeight(), colorNormalGrad2);
        g2d.setPaint(gp);
        g2d.fill(buttonShape);
        super.paint(g2d, c);
 
  }
  
  
  
 
  @Override
  protected void paintButtonPressed(Graphics g, AbstractButton b) {
   Graphics2D g2d = (Graphics2D) g;
 
   // definamos las formas de nuestros botones
   Shape buttonShape = null;
   buttonShape = new RoundRectangle2D.Double(0, 0, b.getWidth() - 1, b.getHeight() - 1, 25, 25);
   GradientPaint gp = new GradientPaint(0, 0, colorPressedGrad1, 0, b.getHeight(), colorPressedGrad2);
   g2d.setPaint(gp);
   g2d.fill(buttonShape);
  }

    public void ApplyQualityRenderingHints(Graphics2D g2d) {
    g2d.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    g2d.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
    g2d.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
    g2d.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
    g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
    g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
    g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
    } 
   }
}

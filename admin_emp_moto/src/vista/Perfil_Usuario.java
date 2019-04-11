
package vista;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Perfil_Usuario extends javax.swing.JPanel {

    private String rutaImagen;
    
    public Perfil_Usuario(){
        initComponents();
        imagenCircular();
        this.lblImagenPerfil.setSize(40,40);
        this.updateUI();
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }
    
    
    
    private void imagenCircular(){
        try {
            BufferedImage master;
            if(getRutaImagen()==null){
                master =ImageIO.read(Perfil_Usuario.class.getResourceAsStream("/recursos/(60x60px)defaultUser.png"));
            }else{             
                master =ImageIO.read(Perfil_Usuario.class.getResourceAsStream(getRutaImagen()));
            }
            
            
            int diameter = Math.min(master.getWidth(), master.getHeight());
            BufferedImage mask = new BufferedImage(master.getWidth(), master.getHeight(), BufferedImage.TYPE_INT_ARGB);
            
            Graphics2D g2d = mask.createGraphics();
            applyQualityRenderingHints(g2d);
            g2d.fillOval(0, 0, diameter - 1, diameter - 1);
            g2d.dispose();
            
            BufferedImage masked = new BufferedImage(diameter, diameter, BufferedImage.TYPE_INT_ARGB);
            g2d = masked.createGraphics();
            applyQualityRenderingHints(g2d);
            int x = (diameter - master.getWidth()) / 2;
            int y = (diameter - master.getHeight()) / 2;
            g2d.drawImage(master, x, y, null);
            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.DST_IN));
            g2d.drawImage(mask, 0, 0, null);
            g2d.dispose();
                        
            //Redimensionar imagenes
            Image img= new ImageIcon(masked).getImage();
            ImageIcon imgRedimensionada =new ImageIcon(img.getScaledInstance(35, 35, Image.SCALE_SMOOTH));        
            lblImagenPerfil.setIcon(imgRedimensionada);

        } catch (IOException ex) {
            Logger.getLogger(Perfil_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void applyQualityRenderingHints(Graphics2D g2d) {

    g2d.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    g2d.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
    g2d.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
    g2d.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
    g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
    g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
    g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lblEditUser = new javax.swing.JLabel();
        lblImagenPerfil = new javax.swing.JLabel();

        setBackground(new java.awt.Color(60, 60, 60));
        setLayout(new java.awt.GridBagLayout());

        lblEditUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEditUser.setForeground(new java.awt.Color(255, 255, 255));
        lblEditUser.setText("NAME DEFAULT");
        lblEditUser.setMaximumSize(new java.awt.Dimension(300, 17));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        add(lblEditUser, gridBagConstraints);

        lblImagenPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        add(lblImagenPerfil, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel lblEditUser;
    private javax.swing.JLabel lblImagenPerfil;
    // End of variables declaration//GEN-END:variables
}

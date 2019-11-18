/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reducirimagen;

import javax.swing.ImageIcon;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.RenderingHints;

/**
 *
 * @author franz
 */
public class Tushar2 {

    public void scaleImage() {
        try {
//            ImageIcon ii = new ImageIcon("/tmp/apple.jpg");
            ImageIcon ii = new ImageIcon("/home/franz/Descargas/apple.jpg");
            BufferedImage bi = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
            Graphics2D g2d = (Graphics2D) bi.createGraphics();
            g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
//            boolean b = g2d.drawImage(ii.getImage(), 0, 0, 50, 50, null); // Baja la calidad
            boolean b = g2d.drawImage(ii.getImage(), 0, 0, 100, 100, null); // Baja la calidad
            System.out.println(b);
//            ImageIO.write(bi, "jpg", new File("/tmp/apple50.jpg"));
            ImageIO.write(bi, "jpg", new File("/home/franz/Descargas/apple50_3.jpg"));
        } catch (Exception e) {
            System.out.println("*** = " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Tushar2().scaleImage();
    }
}

package Project;

import java.awt.geom.Rectangle2D;
import javax.swing.ImageIcon;

public class ENEMY {
    public ImageIcon[] land = new ImageIcon[12];
    public ImageIcon[] sky = new ImageIcon[6];
    public ImageIcon[] special = new ImageIcon[24];
    public int height;
    public int width;
    public int y;
    public int x;
    public int speed;
    ENEMY(){
        for (int i = 0; i < 12; i++) {
            String name;
            if (i < 10) {
                name = "0_Human_Run_00"+i+".png";
            }
            else{
                name = "0_Human_Run_0"+i+".png";
            }
            land[i] = new ImageIcon(this.getClass().getResource(name));
        }
        for (int i = 0; i < 6; i++) {
            String name = "0_Fallen_Angels_Jump Loop_00"+i+".png";
            sky[i] = new ImageIcon(this.getClass().getResource(name));
        }
        for (int i = 0; i < 24; i++) {
            String name;
            if (i < 10) {
                name = "0_Golem_Walking_00"+i+".png";
            }
            else{
                name = "0_Golem_Walking_0"+i+".png";
            }
            special[i] = new ImageIcon(this.getClass().getResource(name));
        }
    }
    public void enland(){
        this.height = 160;
        this.width = 120;
    }
    public void baseyland(){
        this.y = 400;
    }
    public void ensky(){
        this.height = 160;
        this.width = 120;
    }
    public void baseysky(){
        this.y = 280;
    }
    public void enspacial(){
        this.height = 200;
        this.width = 150;
    }
    public void baseyspacial(){
        this.y = 360;
    }
    public Rectangle2D getbound(){
    	return (new Rectangle2D.Double(this.x+10,this.y,this.width-10,this.height-10));
    }
}

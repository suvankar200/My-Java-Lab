
import java.applet.Applet;
import java.awt.Graphics;


public class FirstApplet extends Applet{
    public void init(){
        System.out.println("Applet Initialized");
    }

    public void start(){
        System.out.println("Applet Started");
    }

    public void paint(Graphics g){
        g.drawString("FirstApplet", 50, 50);

    }

    public void stop(){
        System.out.println("Applet Stopped");
    }
    public void destroy(){
        System.out.println("Applet Destroyed");
    }
}
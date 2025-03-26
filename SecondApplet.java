
import java.applet.Applet;
import java.awt.Graphics;


public class SecondApplet extends Applet{
    String msg=null;
    public void init(){
        System.out.println("Applet Initialized");
    }

    public void start(){
        System.out.println("Applet Started");
        




        msg=getParameter("p1");
    }

    public void paint(Graphics g){
        g.drawString("SecondApplet", 50, 50);

    }

    public void stop(){
        System.out.println("Applet Stopped");
    }
    public void destroy(){
        System.out.println("Applet Destroyed");
    }
} 
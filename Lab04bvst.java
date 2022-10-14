// Lab04bvst.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.


import java.awt.*;
import java.applet.*;


public class Lab04bvst extends Applet
{

    public void paint(Graphics g)
    {
        int bigx1 = 10;
        int bigx2 = 10;

        // DRAW CUBE
        g.drawLine(50,50,250,50);
        g.drawLine(50,50,150,150);
        g.drawLine(50,50,50,250);
        g.drawLine(250,50,350,150);
        g.drawLine(250,50,250,250);
        g.drawLine(50,250,250,250);
        g.drawLine(50,250,150,350);
        g.drawLine(250,250,350,350);
        g.drawLine(150,150,150,350);
        g.drawLine(150,150,350,150);
        g.drawLine(350,150,350,350);
        g.drawLine(150,350,350,350);


        // DRAW SPHERE
        g.drawOval(100,300,100,100);
        g.drawOval(137,300,25,100);
        g.drawOval(124,300,50,100);
        g.drawOval(114,300,75,100);
        g.drawOval(100,337,100,25);
        g.drawOval(100,324,100,50);
        g.drawOval(100,314,100,75);



        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE



        // DRAW APCS
       g.fillRect(50,450,75,150);
       g.fillRect(150,450,75,150);
       g.fillRect(250,450,75,150);
       g.fillRect(350,450,75,150);
       g.setColor(Color.white);
       g.fillRect(75,475,25,25);
       g.fillRect(75,525,25,75);
       g.fillRect(175,475,25,25);
       g.fillRect(175,525,50,75);
       g.fillRect(275,475,75,100);
       g.fillRect(375,475,50,25);
       g.fillRect(350,525,50,50);


        // DRAW PACMEN FLOWER
        g.setColor(Color.black);
        g.fillArc(525,425,50,50,135,270);
        g.fillArc(495,460,50,50,215,300);
        g.fillArc(555,460, 50,50,45,270);
        g.fillArc(525,495,50,50,325,250);



    }

}



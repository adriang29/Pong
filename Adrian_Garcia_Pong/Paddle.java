//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
      super(10,10);
      speed =5;
   }


   //add the other Paddle constructors
   public Paddle(int x, int y)
   {
       super(x,y,10,10,Color.BLACK);
       speed = 5;
   }
   
   public Paddle(int x, int y, int spd)
   {
       super(x,y,10,10,Color.BLACK);
       speed = spd;
   }
   
   public Paddle(int x, int y, int w, int h, int spd)
   {
       super(x,y,w,h,Color.BLACK);
       speed = spd;
   }
   
   public Paddle(int x, int y, int w, int h, Color col, int spd)
   {
       super(x,y,w,h,col);
       speed = spd;
   }
   
   public void setSpeed(int x)
   {
       speed = x;
   }
   


   public void moveUpAndDraw(Graphics window)
   {
       draw(window, Color.WHITE);
       
       setY(getY() + speed);
       
       draw(window,Color.BLACK);
   }

   public void moveDownAndDraw(Graphics window)
   {
       draw(window,Color.WHITE);
       
       setY(getY() - speed);
       
       draw(window, Color.BLACK);
   }

   //add get methods
   public int getSpeed()
   {
       return speed;
   }
   
   
   //add a toString() method
   public String toString()
   {
       return super.toString() + " " + speed;
   }
}
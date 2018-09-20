//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
    private int xSpeed;
    private int ySpeed;

    public Ball()
    {
        super(200,200);
        xSpeed = 3;
        ySpeed = 1;
    }

    //add the other Ball constructors

    public Ball(int x, int y)
    {
        super(x,y,10,10,Color.BLACK);
        xSpeed = 3;
        ySpeed = 1;
    }
    
    public Ball(int x, int y, int w, int h)
    {
        super(x,y,w,h,Color.BLACK);
        xSpeed = 3;
        ySpeed = 1;
    }
    
    public Ball(int x, int y, int w, int h, Color col)
    {
        super(x,y,w,h,col);
        xSpeed = 3;
        ySpeed = 1;
    }
    
    public Ball(int x, int y, int w, int h, Color col, int xSpd, int ySpd)
    {
        super(x,y,w,h,col);
        xSpeed = xSpd;
        ySpeed = ySpd;
    }
          
       
   //add the set methods
   public void set_xSpeed(int x)
   {
       xSpeed = x;
   }
   
   public void set_ySpeed(int y)
   {
       ySpeed = y;
   }

   public void moveAndDraw(Graphics window)
   {
    //draw a white ball at old ball location
        draw(window, Color.WHITE);

        setX(getX()+xSpeed);
        //setY
        setY(getY() + ySpeed);
        //draw the ball at its new location
        draw(window, Color.BLUE);
   }
   
    public boolean equals(Object obj)
    {
        Ball object = (Ball)obj;
        if(super.equals(object) && get_xSpeed() == object.get_xSpeed() && object.get_ySpeed() == get_ySpeed())
        {
            return true;
        }
        
        return false;
    }   

   //add the get methods
   public int get_xSpeed()
   {
       return xSpeed;
   }
   
   public int get_ySpeed()
   {
       return ySpeed;
   }
   //add a toString() method
   public String toString()
   {
       return super.toString() + " " + xSpeed + " " + ySpeed;
   }
}
// A Rectangle object represents a rectangle defined by an origin point (bottom left corner), plus width and height.
import java.lang.Math;
public class Rectangle
{
  Point origin;
  int width;
  int height;
  public Rectangle()
  {
    origin.x=0;
    origin.y=0;
    width=0;
    height=0;
  }
  public Rectangle(Point bottomLeft,Point topRight)
  {
    origin=bottomLeft;
    width=Math.abs(origin.x-topRight.x);
    height=Math.abs(origin.y-topRight.y);
  }
  public Rectangle(Point bottomLeft,int vertical,int horizontal)
  {
    origin=bottomLeft;
    width=horizontal;
    height=vertical;
  }
  public Point getBottomLeft()
  {
    return origin;
  }
  public Point getTopRight()
  {
    Point topRight=new Point(width+origin.x,height+origin.y);
    return topRight;
  }
  public int getHeight()
  {
    return height;
  }
  public int getWidth()
  {
    return width;
  }
  public double area()
  {
    double area=width*height;
    return area;
  }
  public double diagonal()
  {
    double diag=Math.sqrt((height*height)+(width*width));
    return diag;
  }
  public int perimeter()
  {
    int p=height+height+width+width;
    return p;
  }
  public boolean isSquare()
  {
    if(height==width)
    {
      return true;
    }
    return false;
  }
  public String toString()
  {
    String rectangle="[("+origin.x+","+origin.y+"),("+getTopRight().x+","+getTopRight().y+")]";
    return rectangle;
  }
  public void translate(int num1,int num2)
  {
    origin.x+=num1;
    origin.y+=num2;
  }
  public void scale(int dx,int dy)
  {
    width+=dx;
    height+=dy;
  }
}

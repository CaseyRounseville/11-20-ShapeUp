// A Point object represents a pair of (x, y) coordinates.
// A Point object represents a pair of (x, y) integer coordinates.
// Reference Building Java Programs pp 505-517
//Casey Rounseville
//9O
//11-19-2014
import java.lang.Math;
public class Point
{
  int x;
  int y;
  public int getX()
  {
    return x;
  }
  public int getY()
  {
    return y;
  }
  public double distanceFromOrigin()
  {
    double distanceFromOrigin=Math.sqrt((x*x)+(y*y));
    return distanceFromOrigin;
  }
  public double distance(Point p)
  {
    int differenceX=p.x-x;
    int differenceY=p.y-y;
    double distance=Math.sqrt((differenceX*differenceX)+(differenceY*differenceY));
    return distance;
  }
  public String toString()
  {
    String point="("+x+","+y+")";
    return point;
  }
  public void setX(int num)
  {
    x=num;
  }
  public void setY(int num)
  {
    y=num;
  }
  public void translate(int num1,int num2)
  {
    x+=num1;
    y+=num2;
  }
  public Point()
  {
    x=0;
    y=0;
  }
  public Point(int num1,int num2)
  {
    x=num1;
    y=num2;
  }
}

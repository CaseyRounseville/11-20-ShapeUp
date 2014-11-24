// A Circle object represents a circle defined by a center point and a radius.
import java.lang.Math;
public class Circle
{
  Point center;
  double radius;
  public Circle()
  {
    center.x=0;
    center.y=0;
    radius=0.0;
  }
  public Circle(Point centerPoint,Point circPoint)
  {
    center=centerPoint;
    Line r=new Line(centerPoint,circPoint);
    radius=r.length();
  }
  public Circle(Point centerPoint, double r)
  {
    center=centerPoint;
    radius=r;
  }
  public double getRadius()
  {
    return radius;
  }
  public double area()
  {
    double area=Math.PI*radius*radius;
    return area;
  }
  public double circumference()
  {
    double circumference=Math.PI*radius*2;
    return circumference;
  }
  public double diameter()
  {
    double diameter=2*radius;
    return diameter;
  }
  public String toString()
  {
    String circle="[("+center.x+","+center.y+"),"+radius+"]";
    return circle;
  }
  public void translate(int num1,int num2)
  {
    center.x+=num1;
    center.y+=num2;
  }
  public void changeRadius(double change)
  {
    radius+=change;
  }
}

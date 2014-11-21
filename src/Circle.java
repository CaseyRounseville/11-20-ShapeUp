// A Circle object represents a circle defined by a center point and a radius.
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
  public Circle(Point centerPoint,double r)
  {
    center=centerPoint;

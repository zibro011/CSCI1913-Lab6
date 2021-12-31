public class Square extends Polygon
{
  int x;
  public Square(int x)
  {
    super(4,x,x,x,x);
    this.x = x;
  }
  public int area()
  {
    return x * x;
  }
}
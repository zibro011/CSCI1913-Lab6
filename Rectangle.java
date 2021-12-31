public class Rectangle extends Polygon
{
  int l;
  int w;
  public Rectangle (int l, int w)
  {
    super(4, l, w, l, w);
    this.l = l;
    this.w = w;
  }
  public int area()
  {
   return l * w; 
  }
}
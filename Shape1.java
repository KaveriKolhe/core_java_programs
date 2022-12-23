class Shape
{

public void shapeprint()
{
System.out.println("This is a shape");
}
}
class Rectangle extends Shape
{

public void shapeprint()
{

System.out.println("This is a Rectanglar Shape");
}

}
class Circle extends Shape
{

public void shapeprint()
{

System.out.println("This is a Circlar shape");
}

}
public class Shape1
{
public static void main(String arg[])
{
Rectangle R= new Rectangle ();
Circle C=new Circle();

R.shapeprint();
C.shapeprint();
}
}




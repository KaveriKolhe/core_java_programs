class Area
{

    public int areaofrectangle(int l, int b)
    {
        return l*b;
    }

    public int areaofsquare(int s)
    {
        return s*s;
    }
public static void main(String args [])
{
    Area A= new Area();
    System.out.println("Area Of Rectangle:"+A.areaofrectangle(50,50));
    System.out.println("Area Of Square:"+A.areaofsquare(20));

    
} 
}
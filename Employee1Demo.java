 class Employee1  
{  
public int id;
public String name;  
public int salary;   
public static int count;  

Employee1(int id,String name, int salary)  
{  
this.id=id;
this.name= name;  
this.salary= salary;  
  
count++;  
}  
}  
public class Employee1Demo 
{  
public static void main(String args[])  
{  
//creating objects      
Employee1 emp1 = new Employee1(1,"ABC", 30000);  
Employee1 emp2 = new Employee1(2,"XYZ", 250000);  
Employee1 emp3 = new Employee1(3,"PQR",280000);  

  
System.out.println ("There are Object :"+Employee1.count);  
}  
}  
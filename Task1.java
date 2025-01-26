public class Task1 {

    public static void main(String[] args) {
        int x;
        int y;
        int z;

        x=10;
        y=5;
        z=15;
        int total;
        total=x+y+z;
        float per;
	per = ((float)total/300)*100;
 //Q1addition, subtraction, multiplication, and division
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);

//Q2Square of a Number
        System.out.println(x*x);
        System.out.println(y*y);

//Q3Perimeter of a Rectangle
        System.out.println(2*(x+x));
        System.out.println(2*(y+y));
        
//Q4Area of a Rectangle
        System.out.println(x*x);
        System.out.println(y*y);

//Q5Average of Three Numbers
        System.out.println((3+3+3)/3);

//Q6Print Multiplication Table
        System.out.println("1 x 5 = " + (1 * 5));
        System.out.println("2 x 5 = " + (2 * 5));
        System.out.println("3 x 5 = " + (3 * 5));
        System.out.println("4 x 5 = " + (4 * 5));
        System.out.println("5 x 5 = " + (5 * 5));

//Q7aCalculate Total and Percentage
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
	System.out.println(total);
	System.out.println(per);
    }
}

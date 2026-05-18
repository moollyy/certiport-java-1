import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Rectangle
{
    // TO DO: Create attributes for your Rectangle class
    private double length; 
    private double width; 


    
    // TO DO: Create constructor(s) for your Rectangle class

    public Rectangle()
    {
        this(1.0);
    }

    public Rectangle(double size) 
    {
        this(size, size); 
    }

    public Rectangle(double length, double width)
    {
        this.length = length; 
        this.width = width; 
    }

    // TO DO: Create methods that compute the perimeter and area of your Rectangle

    public double getPerimeter()
    {
        return 2 * (length + width);
    }

    public double getArea()
    {
        return length * width; 
    }


    public static void main(String[] args) throws IOException
    {
        File f = new File("input.txt");
        Scanner scan = new Scanner(f);

        String name = scan.nextLine();
        int grade = Integer.parseInt(scan.nextLine());

        System.out.printf("Hello %s! You are in %dth grade!%n", name, grade);

        // TO DO: Add code that reads in a third and fourth line, which are the GPA and school name.
        // Add these fields to your input.txt
        // Print a message that displays these values
        double gpa = Double.parseDouble(scan.nextLine());
        String hs = scan.nextLine(); // reads lines

        System.out.println("You have a " + gpa + " gpa at " + hs + ".");


        // TO DO: Create Rectangle objects and compute their perimeter and areas

        Rectangle r1 = new Rectangle(3, 4);
        System.out.printf("Rectangle r1 has a length of %1.2f%n", r1.length);




        scan.close();
    }
}
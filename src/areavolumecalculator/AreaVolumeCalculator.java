package areavolumecalculator;

import java.util.Scanner;

public class AreaVolumeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
           Area();

    }// end of main
    
    public static void Area(){
        Scanner input = new Scanner (System.in);
        float Height;
        float Width;
        float Area;
        

        System.out.println("Enter the Height of the object in millimetres: ");
        Height = input.nextFloat();

        System.out.println("Enter the Width of the object millimetres: ");
        Width = input.nextFloat();  
        
        Area = Height * Width;
        
        System.out.println("The area of this Rectangle is " + Area + "mm");
        
        Volume();
            
    }// end of area
    
    public static void Volume(){
        Scanner input = new Scanner (System.in);
        float Height;
        float Width;
        float Depth;
        float Volume;
        
        System.out.println("Enter the Height of the object millimetres: ");
        Height = input.nextFloat();

        System.out.println("Enter the Width of the object millimetres: ");
        Width = input.nextFloat();        
        
        System.out.println("Enter the Depth of the object millimetres: ");
        Depth = input.nextFloat();  
        
        Volume = Height * Width * Depth;
        
        System.out.println("The volume of this Cuboid is " + Volume + "mm");
        
        cylinder();
    }// end of volume
    
    public static void cylinder(){
    Scanner input = new Scanner (System.in);
        float Height;
        float Radius;
        float Pi;
        float Volume;
        
        System.out.println("Enter the Height of the object millimetres: ");
        Height = input.nextFloat();

        System.out.println("Enter the Radius of the object millimetres: ");
        Radius = input.nextFloat();        
        
        Pi = 3.14f;
        
        Volume = Height * Radius * Radius * Pi;
        
        System.out.println("The volume of this Cylinder is " + Volume + "mm");
    
    
    }
}//end of program

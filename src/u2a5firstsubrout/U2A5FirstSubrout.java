/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u2a5firstsubrout;

import java.util.Scanner;

/**
 *
 * @author Jack
 */
import java.util.Scanner;
public class U2A5FirstSubrout {
        public static void averagenum (int n1, int n2)
    {
        double sum = (n1+n2)/2;
        System.out.println("the average is :"+sum);
    }
        public static void perimeterquadralateral (int n1, int n2)
    {
        double sum = (n1+n2)*2;
        System.out.println("the perimeter is :"+sum);
    }
            public static void perimetertriangle (int n1)
    {
        double sum = (n1)*3;
        System.out.println("the perimeter is :"+sum);
    }
        public static void volumecube (int n1)
    {
        double sum = n1^3;
        System.out.println("the volume is :"+sum);
    }
        public static void volumetriangularprism (int n1)
    {
        double sum = (n1^3)/2;
        System.out.println("the volume is :"+sum);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int input1;
        int input2;
        boolean run;
        Scanner keyedInput = new Scanner (System.in);
        System.out.println("Hello, we are going to calculate some numbers!");
        while (run=true){
        System.out.println("Would you like to calculate, 1. an average, 2. the perimeter of a quadralateral, 3. the perimeter of a triangle, 4. the volume of a cube, 5. the volume of a triangular prism, 6. leave.");
        int input = keyedInput.nextInt();
        switch (input) {
            case 1:
                System.out.println("input num1");
                input1 = keyedInput.nextInt();
                System.out.println("input num2");
                input2 = keyedInput.nextInt();
                averagenum(input1,input2);
                break;
            case 2:
                System.out.println("input side length 1");
                input1 = keyedInput.nextInt();
                System.out.println("input side length 2");
                input2 = keyedInput.nextInt();
                perimeterquadralateral(input1,input2);
                break;
            case 3:
                System.out.println("input sidelength");
                input1 = keyedInput.nextInt();
                perimetertriangle(input1);
                break; 
            case 4:
                System.out.println("input sidelength");
                input1 = keyedInput.nextInt();
                volumecube(input1);
                break;
            case 5:
                System.out.println("input height/width");
                input1 = keyedInput.nextInt();
                volumetriangularprism(input1);
                break;    
            case 6:
                run = false;
                break;
        }
        System.exit(0);
        }
        
    }
    
}

import java.util.Scanner;

public class Fornas
{
    static float CirclePerimeter(float radius)
    {
        return 2 * 3.1415f * radius;
    }

    static float CircleArea(float radius)
    {
        return 3.1415f * radius * radius;
    }

    static float RectPerimeter(float width, float height)
    {
        return 2 * (width + height);
    }

    static float RectArea(float width, float height)
    {
        return width * height;
    }

    static float TrianglePerimeter(float l1, float l2, float l3)
    {
        return l1 + l2 + l3;
    }

    static float TriangleArea(float base, float height)
    {
        return (base * height) / 2;
    }

    static float SquarePerimeter(float side)
    {
        return 4 * side;
    }

    static float SquareArea(float side)
    {
        return side * side;
    }

    static void CheckTriangleType(float side1, float side2, float side3)
    {   
        if(side1 > side2 + side3 || side2 > side1 + side3 || side3 > side1 + side2)
        {
            System.out.println("Impossible");
        }
        else if(side2 == side1 && side1 == side2 && side2 == side3)
        {
            System.out.println("Equilateral");
        }
        else if(side2 == side1 || side1 == side2 || side2 == side3)
        {
            System.out.println("Isosceles");
        }
        else
        {
            System.out.println("Scalene");
        }
    }


    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Forna? (1-Circulo, 2-Rectangulo, 3-Triangulo, 4-Square)\n");
        
        int type = scan.nextInt();

        if(type > 4 || type < 1)
        {
            System.out.println("Invalid type");
            return;
        }

        switch(type)
        {
            case 1:
                System.out.println("Radius: ");
                float radius = scan.nextFloat();
                System.out.printf("Perimetro: %.2f\n", CirclePerimeter(radius));
                System.out.printf("Area: %.2f\n", CircleArea(radius));
                break;
            case 2:
                System.out.println("Length and Width: ");
                float length = scan.nextFloat();
                float width = scan.nextFloat();
                System.out.printf("Perimetro: %.2f\n", RectPerimeter(length, width));
                System.out.printf("Area: %.2f\n", RectArea(length, width));
                break;
            case 3:
                System.out.println("The three sides: ");
                float s1 = scan.nextFloat();
                float s2 = scan.nextFloat();
                float s3 = scan.nextFloat();

                System.out.println("The base and height: ");
                float b = scan.nextFloat();
                float h = scan.nextFloat();
                CheckTriangleType(s1, s2, s3);
                System.out.printf("Perimetro: %.2f\n", TrianglePerimeter(s1, s2, s3));
                System.out.printf("Area: %.2f\n", TriangleArea(b, h));
                break;
            case 4:
                System.out.println("Side: ");
                float l = scan.nextFloat();
                System.out.printf("Perimetro: %.2f\n", SquarePerimeter(l));
                System.out.printf("Area: %.2f\n", SquareArea(l));
                break;
        }

    }


}
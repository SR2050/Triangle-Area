import java.util.Scanner;
class triangle{
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        double area,s;
        System.out.println("Enter the value of a :");
        a = input.nextInt();
        System.out.println("Enter the value of a :");
        b = input.nextInt();
        System.out.println("Enter the value of a :");
        c = input.nextInt();
        input.close();
        if(a+b>c && b+c>a && c+a>b){
            s=a+b+c/2;
            area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("Area:"+area);
        }
        else{
            System.out.println("Traingle not posible....!");
        }
    }
}

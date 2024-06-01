import java.util.Scanner;

public class soloviovJava1 {
    private static Scanner sc;
    public static void main(String[] args){
        double a, b;
        sc = new Scanner(System.in);
        System.out.println("Введите число a: ");
        a = sc.nextInt();
        System.out.println("Введите число b: ");
        b = sc.nextInt();
        double sum = a+b;
        double sub1 = a-b;
        double sub2 = b-a;
        double mul = a*b;
        double div1 = a/b;
        double div2 = b/a;
        if (a<b) {System.out.println("a < b");}
        if (a>b) {System.out.println("a > b");}
        if (a==b) {System.out.println("a = b");}
        System.out.println("Сумма чисел a и b: " + sum);
        System.out.println("Разность чисел a и b: " + sub1);
        System.out.println("Разность чисел b и a: " + sub2);
        System.out.println("Произведение чисел a и b: " + mul);
        System.out.println("Деление числа a на b: " + div1);
        System.out.println("Деление числа b на a: " + div2);
    }
}

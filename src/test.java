import javafx.scene.shape.Circle;

import java.util.Scanner;

public class test {
   static long grea = 9;
public static void main(String[] args) {
    System.out.println(grea);

Scanner sc = new Scanner(System.in);
System.out.println("nhập number");
double number = sc.nextDouble();
if(number<4.0){
    System.out.println("học sinh trượt");
    System.out.println("học lại đi");
}else
    System.out.println(number+"học sinh đỗ");
}
}
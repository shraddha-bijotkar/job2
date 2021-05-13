
import java.util.Scanner;

public class Arm {

    public static boolean isArm(int num){
        int d;
        int sum = 0;
        
        int n = num;
        while(n!=0){
            d = n % 10;
            n /= 10;
            sum = sum + (d*d*d);

        }
        if(sum == num){
            return true;
        }
       else{
        return false;
       }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = sc.nextInt();
        if(x<100 || x>999){
            System.out.println("INVALID_INPUT");
            return;
        }
        else{
            if(isArm(x)){
                System.out.println("ARMSTRONG");
            }
            else{
                System.out.println("NOT ARMSTRONG");
            }
        }
    }
}
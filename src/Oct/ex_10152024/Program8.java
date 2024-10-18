package Oct.ex_10152024;

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks to know the Grade : ");
        int grade = sc.nextInt();

        if(grade >=90 && grade<=100){
            System.out.print('A');
        }
        else if(grade >=80 && grade<=90) {
            System.out.print('B');
        }
        else if(grade >=70 && grade<=80) {
            System.out.print('C');
        }
        else if(grade >=60 && grade<=70) {
            System.out.print('D');
        }  if(grade<=50)
            System.out.print('F');

    }
}


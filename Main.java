import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*
        int i = 1;
        for(;i<=10;){
            int product = 5 * i;
            System.out.println("5x"+i+" ="+product);
            i++;
        }
        System.out.println("End");
    }
}*/
/*        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = number[1]; i <= 6; i++) {
            System.out.println(number[i]);*/

        /*int i = 1;
        while (i<=10) {
            System.out.println(i);
            i++;
        }
        System.out.println("End");*/

/*        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Chon tinh nang:");
            number = scanner.nextInt();
            System.out.println("1. Them moi:");
            System.out.println("2. Sua:");
            System.out.println("3. Xoa:");
            System.out.println("4. Sap xep:");
            System.out.println("0. Thoat:");
        }while (number!=0);*/

/*        int sum = 0;
        int number;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Enter a number:");
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);
        System.out.println("The sum is: " + sum);*/

        for(int i = 1; i<=10; i++){
            if(i==5)
                continue;
            System.out.println("i=" +i);
        }
        System.out.println("Emd of loop");
    }
}
public class B4 {
    public static void main(String[] agrs) {
//        String[] employeeNames = new String[10];
//        hoặc  Sring employeeNames[] = new String[10];
/*        employeeNames[0] = "Khanh";
        employeeNames[1] = "Ha";
        employeeNames[2] = "Nam";
        employeeNames[3] = "An";
        employeeNames[4] = "Cuong";

        System.out.println(employeeNames[0]);

        for (String name: employeeNames) {
            System.out.println(name);
        }*/

/*        double[] numbers = {8.9, 5.3};
//        double[] numbers = new double[10];
//        numbers[0] = 8.9;
//        numbers[1] = 5.3;

//        System.out.println(numbers[1]);
        for (double number: numbers) {
            System.out.println(number);
        }

        System.out.println(numbers.length);*/

/*        double[] myList = new double[10];
        myList[0] = 5.6;
        myList[1] = 4.5;
        myList[2] = 3.3;
        myList[3] = 13.2;
        myList[4] = 4.0;
        myList[5] = 34.33;
        myList[6] = 34.0;
        myList[7] = 45.45;
        myList[8] = 99.993;
        myList[9] = 11123;*/

/*        for (int i = 0; i < 10; i++) {
            System.out.println(myList[i]);
        }
        for (double number: myList) {
            System.out.println(number);
        }

        System.out.println(myList.length);*/

/*        int num1 = 30;
        int num2 = 70;
        int sum = new B4().getSum(num1, num2);
        System.out.println(sum);*/

/*        String mes = getMessage("Hello");
        System.out.println(mes);
        int num = 21;
        boolean req = isEven(num);
//        System.out.println(req);
        if(req) {
            System.out.println(num + " là số chẵn");
        } else {
            System.out.println(num + " là số lẻ");
        }*/


        int i = 5;
        int j = 2;
        int k = max(i, j);
        System.out.println("The maximum of " + i + " and " + j + " is " + k);
    }

/*    private static String getMessage(String message) {
        return message;
    }*/

/*    private static boolean isEven(int number) {
        return number % 2 == 0;
    }*/

/*    public int getSum(int a, int b) {
        int sum;
        sum = a+b;
        return sum;
    }*/

    public static int max(int num1, int num2) {
        int result;

        if (num1 > num2)
            result = num1;
        else
            result = num2;

        return result;
    }
}

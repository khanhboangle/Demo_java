public class B2 {
    public static void main(String[] args) {
/*        int age;
        String address;
        String name;
        final String BIRTH_DATE = "30/09/1999";

        name = "Nam";
        address = "Ha Nam";
        age = 20;

        System.out.println("age: " + age);
        System.out.println("name: " + name);
        System.out.println("address: " + address);
        System.out.println(BIRTH_DATE);*/


/*        System.out.println(15%4);
        System.out.println(15/4);
        System.out.println(15.0/4);*/


/*        int num = 10;
        System.out.println(num++); //thực hiện biểu thức rồi mới tăng giá trị
        System.out.println(++num); //tăng giá trị rồi mới thực hiện biểu thức*/


/*        int a = 5;
        int b = 7;
        boolean i = true;

        System.out.println(b);
        System.out.println(++a + b++);
        System.out.println(b);
        System.out.println(!i);*/


/*        System.out.println(5 > 9 && 5 < 9);
        System.out.println(5 > 9 || 5 < 9);
        System.out.println(5^9);*/


/*        boolean p1 = true;
        boolean p2 = true;

        System.out.println(p1 ^ p2);*/


/*        int mark = 5;

        if (mark >= 5)
            System.out.println("Pass");
            System.out.println("End");  // Dòng này không thuộc hàm if vì không nằm trong dấu '{}'*/


/*        Demo demo = new Demo();
        demo.Tinh_Diem();*/


 /*       int mark = 7;

        if (mark >= 8) {
            if (mark >= 9) {
                System.out.println("A+");
            } else {
                System.out.println("A");
            }
        } else if (mark >= 5) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }*/


        String day = "7";
        switch (day) {
            case "2":
            case "3":
            case "4":
            case "5":
            case "6": {
                System.out.println("Đi làm");
                //break;
            }
            case "7":
            case "CN": {
                    System.out.println("Ngủ");
                    break;
            }
        }
    }
}

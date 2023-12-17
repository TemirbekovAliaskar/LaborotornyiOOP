package numberFirstLab.phone;

public class Main {
    public static void main(String[] args) {


        Phone phone1 = new Phone("+996 100 111 111","Xiaomi","163");
        Phone phone2 = new Phone("+996 100 222 222","Iphone","150");
        Phone phone3 = new Phone("+996 100 333 333","Huawei","189");

        System.out.println("Phone 1 :");
        System.out.print(phone1.number  + " ");
        System.out.print(phone1.model + " ");
        System.out.println(phone1.weight + " ");
        System.out.println("Phone 2 : ");
        System.out.print(phone2.number +" ");
        System.out.print(phone2.model + " ");
        System.out.println(phone2.weight +" ");
        System.out.println("Phone 3 :");
        System.out.print(phone3.number +" " );
        System.out.print(phone3.model +" " );
        System.out.println(phone3.weight +" " );
        phone1.receiveCall("Adis : ");
        System.out.println("^^^^^^^^^^^^^^");
        phone2.receiveCall("Argen", phone2.number);

        System.out.println();
        phone3.SendMessage(phone1.number,phone2.number,phone3.number);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//phone.callByNumber("coco");
//phone.call(99);
//        System.out.println(phone.turn0n("1111"));
//        phone.call(77);
//        phone.callByNumber("ad");
//        phone.searchContacts("ad");
        //  phone.upDateName(77, "ad", 44, "moma", contacts);
        Contact contact1 = new Contact(77, "ad");
        Contact contact2 = new Contact(88, "b");
        Contact contact3 = new Contact(99, "coco");

        Contact[] contacts = {contact1, contact2, contact3};
        Phone phone = new Phone("Iphone", "xs", "1111", new Contact[]{contact1, contact2, contact3});
        while (true) {
            int b = new Scanner(System.in).nextInt();
            switch (b) {
                case 1:

                    System.out.println(phone.turn0n("1111"));
                    break;
                default:
                    System.out.println("erorr passwrod");
            }
    }
    }
    public static void serice() {
        Contact contact1 = new Contact(77, "ad");
        Contact contact2 = new Contact(88, "b");
        Contact contact3 = new Contact(99, "coco");

        Contact[] contacts = {contact1, contact2, contact3};
        Phone phone = new Phone("Iphone", "xs", "1111", new Contact[]{contact1, contact2, contact3});

        for (Contact c :contacts
                ) {

        }
            int a = new Scanner(System.in).nextInt();
            switch (a) {

                case 1 -> phone.call(99);
                case 2 -> phone.callByNumber("coco");
                case 3 -> phone.searchContacts("ad");
                case 4 -> phone.upDateName(77, "ad", 44, "momun", contacts);
                case 5 -> phone.getAllContacts();
            }
        }

    }

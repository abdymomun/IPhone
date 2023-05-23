import java.util.Arrays;
import java.util.Scanner;

public class Phone implements Inter{
    private String brand;
    private String name;
    private String password;
    private Contact [] contacts;

    public Phone(String brand, String name, String password, Contact[] contacts) {
        this.brand = brand;
        this.name = name;
        this.password = password;
        this.contacts = contacts;
    }

    public Phone() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }


    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", contacts=" + Arrays.toString(contacts) +
                '}';
    }

    @Override
    public String turn0n(String password) {
        if (password==getPassword()) {
            return"succsesfuly";
        }else return null;
    }

    @Override
    public void call(int number) {
        for (Contact c:contacts) {
            if (number == c.getPhoneNumber()){
                System.out.println("calling");
                break;
            }

            else {

            }
        }
    }

    @Override
    public void callByNumber(String name) {
        for (Contact c : contacts) {
            if (name.equals(c.getFullName())) {
                System.out.println("calling");
break;
            }
        }
    }

    @Override
    public void searchContacts(String name) {
        for (Contact c:contacts) {
            if (name.equals(c.getFullName())){
                System.out.println(c.toString());
            }
        }
    }


    
    @Override
    public Contact upDateName(long OldPhoneNumber, String oldFullName, long newPhoneNumber, String newFullName, Contact[] contacts) {
        Contact contact1 = new Contact();
        for (Contact c : contacts) {
            if (c.getFullName().equals(oldFullName)) {
                contact1.setPhoneNumber((int) newPhoneNumber);
                contact1.setFullName(newFullName);
                System.out.println("Contact by name "+oldFullName+" successfully updated "+contact1);
            }
        }return contact1;
    }

    @Override
    public void getAllContacts() {
        for (Contact contaks: contacts) {
            System.out.println(contaks);
        }
    }

    }


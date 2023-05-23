public interface Inter {
    String turn0n (String password) ;
    void call (int number);
    void callByNumber (String name);
    void searchContacts(String name);
    Contact upDateName(long OldPhoneNumber, String oldFullName, long newPhoneNumber, String newFullName, Contact[] contacts);
    void getAllContacts();
}

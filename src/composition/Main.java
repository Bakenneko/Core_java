package composition;

public class Main {
    public static void main(String[] args) {

        Passport passport = new Passport("NBA","12345");
        User user = new User(1,"Tom",passport);
        User user1 = new User(1,"Bob","NBA","123456");
        Customer Customer = new Customer("one","two",passport);
        System.out.println(user);
        System.out.println(user1);
        System.out.println(Customer);


    }
}

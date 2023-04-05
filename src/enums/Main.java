package enums;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Role role = Role.ADMIN;
//        User user = new User("asd",Role.MANAGER);
//        Helper helper = new Helper();
//        String extractToken = helper.extractToken(user);
//        System.out.println(extractToken);
        Role[] values = Role.values();
//        List<Role> roles = Arrays.asList(values);
//        System.out.println(Arrays.toString(values));
//        System.out.println(Role.valueOf("ADMIN"));
        System.out.println(Role.ADMIN.ordinal());
    }
}

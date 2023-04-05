package enums;

public enum Role {
    ADMIN("foo"), MANAGER("bar"), SUPERVISER;

    Role() {
    }

    private String token;

    Role(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}

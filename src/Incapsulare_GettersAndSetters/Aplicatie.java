package Incapsulare_GettersAndSetters;

public class Aplicatie {
    public static void main(String[] args) {
        User user = new User("abcde", "test123");
        System.out.println(user);
        String numeUsername = user.getUsername();
        user.setUsername("Gig");
        System.out.println(user);

    }
}

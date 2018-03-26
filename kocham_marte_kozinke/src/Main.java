/**
 * Created by Budyn on 21.02.2018.
 */
public class Main {

    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        Register register = new Register(emailService);
        register.createUser();
    }
}

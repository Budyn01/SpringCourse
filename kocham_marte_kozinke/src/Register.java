/**
 * Created by Budyn on 21.02.2018.
 */
public class Register {

    private final EmailService emailService;

    public Register(EmailService emailService) {
        this.emailService = emailService;
    }

    @Deprecated
    void createUser(){
        /// User creation
        String email = "lol@lol.pl";
        emailService.sendEmail(email);

    }

}

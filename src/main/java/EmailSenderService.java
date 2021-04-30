public class EmailSenderService {

    public static void sendMail(User user){
        System.out.println("Mail envoyé à " + user.getEmail());
    }

}
import java.util.ArrayList;

public class ToDoList {

    private final ArrayList<Item> items;
    private final User user;
    public boolean IsEmailSent;

    ToDoList(User user){
        this.items = new ArrayList<>();
        this.user = user;
        this.IsEmailSent = false;
    }

    public void addItem(Item item){

        for (Item i : this.items)
            if (i.getName().equals(item.getName()))
                return;

        if (items.size() >= 10)
            return;

        if (items.size() > 0){
            Item last = items.get(items.size() -1);
            if (last.getCreation_date().plusMinutes(30).compareTo(item.getCreation_date()) <= 0){
                return;
            }
        }

        this.items.add(item);

        if (items.size() == 8){
            EmailSenderService sender = new EmailSenderService();
            sender.sendMail(user.getEmail());
            IsEmailSent = true;
        }
    }
}

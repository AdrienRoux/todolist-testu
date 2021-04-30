import java.time.temporal.ChronoUnit;
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

    public boolean addItem(Item item){

        for (Item i : this.items)
            if (i.getName().equals(item.getName()))
                return false;

        if (items.size() >= 10)
            return false;

        if (items.size() > 0){
            Item last = items.get(items.size() -1);
            if (last.getCreation_date().plus(30, ChronoUnit.MINUTES).compareTo(item.getCreation_date()) <= 0){
                return false;
            }
        }

        this.items.add(item);

        if (items.size() == 8){
            EmailSenderService.sendMail(user);
            IsEmailSent = true;
        }
        return true;
    }
}

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

public class TestsToDoList {

    private User user;
    private Item item;

    @Before
    public void mySetup(){
        this.user = new User("test@test.com",
                "test",
                "test",
                LocalDate.now(),
                new ToDoList(this.user));

        this.item = new Item("testItem",
                "je suis un contenu d'un item de test",
                LocalDate.now());
    }

    @Test
    public void TestEmail(){
        Item itemTemp = item;
        for (int i = 0; i < 8; i++) {
            user.getTodo().addItem(itemTemp);
            itemTemp.setName(item.getName() + i);
        }
        Assert.assertTrue(user.getTodo().IsEmailSent);
    }

    @Test
    public void TestUser(){

    }

}

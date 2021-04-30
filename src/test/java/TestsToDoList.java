import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;

public class TestsToDoList {

    private User user;
    private Item item;
    private Item item2;
    private Item item3;
    private Item item4;
    private Item item5;
    private Item item6;
    private Item item7;
    private Item item8;

    @Before
    public void mySetup(){
        this.user = new User("test@test.com",
                "test",
                "test",
                LocalDateTime.now(),
                null);

        this.user.setTodo(new ToDoList(this.user));

        this.item = new Item("testItem1",
                "je suis un contenu d'un item de test",
                LocalDateTime.now());
        this.item2 = new Item("testItem2",
                "je suis un contenu d'un item de test",
                LocalDateTime.now());
        this.item3 = new Item("testItem3",
                "je suis un contenu d'un item de test",
                LocalDateTime.now());
        this.item4 = new Item("testItem4",
                "je suis un contenu d'un item de test",
                LocalDateTime.now());
        this.item5 = new Item("testItem5",
                "je suis un contenu d'un item de test",
                LocalDateTime.now());
        this.item6 = new Item("testItem6",
                "je suis un contenu d'un item de test",
                LocalDateTime.now());
        this.item7 = new Item("testItem7",
                "je suis un contenu d'un item de test",
                LocalDateTime.now());
        this.item8 = new Item("testItem8",
                "je suis un contenu d'un item de test",
                LocalDateTime.now());
    }

    @Test
    public void TestEmail(){
        user.getTodo().addItem(item);
        user.getTodo().addItem(item2);
        user.getTodo().addItem(item3);
        user.getTodo().addItem(item4);
        user.getTodo().addItem(item5);
        user.getTodo().addItem(item6);
        user.getTodo().addItem(item7);
        user.getTodo().addItem(item8);

        Assert.assertTrue(user.getTodo().IsEmailSent);
    }

    @Test
    public void TestUser(){

    }

}

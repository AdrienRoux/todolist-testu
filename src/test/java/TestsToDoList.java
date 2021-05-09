import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestsToDoList {

    private User user;
    private User invalidUser;
    private Item item;
    private Item item2;
    private Item item3;
    private Item item4;
    private Item item5;
    private Item item6;
    private Item item7;
    private Item item8;
    private Item invalidItem;


    @Before
    public void mySetup(){
        this.user = new User("test@test.com",
                "test",
                "test",
                LocalDateTime.of(1997,10,10,0,0),
                null,
                "azertyuiop");

        this.invalidUser = new User("test@test.com",
                "test",
                "test",
                LocalDateTime.now(),
                null,
                "azertyuiop");

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

        this.invalidItem = new Item("test invalid",setStringIvalid(),LocalDateTime.now());
    }



    @Test
    public void TestUser(){
        System.out.println(user.isValid());
        Assert.assertTrue(user.isValid());
        Assert.assertFalse(invalidUser.isValid());
    }

    @Test
    public void testContent(){
        Assert.assertTrue(item.getContent() != null);
        Assert.assertFalse(invalidItem.getContent() != null);
    }



    @Test
    public void testAddItem(){
        user.getTodo().addItem(item);

        Assert.assertTrue(user.getTodo().getItems().size() > 0);
    }

     @Test
     public void isItemValid(){
        Assert.assertTrue(item.isValid());
        Assert.assertFalse(invalidItem.isValid());
     }

    @Test
    public void testAddItemFalse(){
        user.getTodo().addItem(invalidItem);
        System.out.println(invalidItem.getCreation_date());
        System.out.println(invalidItem.getContent());


        Assert.assertTrue(user.getTodo().getItems().size() == 0);
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

    private String setStringIvalid() {
        return "J58QbMkraISifd8FPPgjeoMwzv0Gg0Z5ewFtMmXiKFQj9vQhd1EZHbFhp6tyehB04iDsSjqu1olfNMvWIKZPdVnUWHdq3idsPnDOv8rqM8UWW9npSVTA5AwkKMO3LSuuAY262TKfnmGpZp57x8MGyGanL3dkAS36vt68KOS3DOOLKvTq0oabuJMDjlTnKwPGzDQYoeO2BfMIc4UxX1aOfdHN20iNrI6NfCjGlnp0OAx9MVBA3UTR3mRKnEFKZJDW4h8hf9JaUvzR4CidBY0gAbh6OJGcp4Dy2TrWjn3VpgX3IUpeNteMA0DWg23jMLTWiFTSnRiBa0062boFWTOfDYnqF3pDb8TwYuS7iOyGhCYvZLH3CPW26Rn7QWvNPr90DnDo66dWmznEb2q9wAlIIViLVOCwy209AAebQNxdVQ0W9nGpYMBoijAHYLiAHDje5oNT3gJi4nWYlnJK4PuWedIajIlSeO3SdMTqInZSgtz03Ww67K4tRJRbWmJ6fuzV2UoAnxFlWssAuPX0F9NvaPV7stDnwIE0SZOGndu84RDmc107a1YMLXTQb37s4Yw8g2GPxBSi7De7tqeeKvacg3RN3PJ90QD1Grpb1GsvH3OrRfoa1qeY90GDt5WKptqk0Uquo4Wsq2BhbFXpe6q0k8aAjbE6CjguSPrtSu2ikXZgxTZJR2iJe6H0p5GHACVchwJEZ3WqnKrwRecqh0IUxr7bTGWzI1Zftf0X7t6bluG0RucSttmJU8F2SHrespk3PF7E95qj4ioqEPepQKslzLm3Hewej4J96uGE9gAlyZTAK3DcYxKORTvnPAFR9HjTMZZp1tu98RNJtv50MHBHXTwOfqYON2fEj4el88UVPEgggZ32hwajf9XxqD2Qj7wv3KkAkqgJsYden95FuSFTExIJbrrHE70D5VAQrRCGC20j0LjGAcF4MMVbdzYeXlBd2sGiU793dqS7l04PhvGws0ZiAOP5LyI3gZdYiMsGAn";
    }

}

import lombok.*;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.validator.routines.EmailValidator;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

@Getter
@Setter
@Builder
@NoArgsConstructor

public class User {

    private String email;
    private String firstname;
    private String lastname;
    private LocalDateTime birthday;
    private ToDoList todo;
    private String password;


    public User(String email, String firstname, String lastname, LocalDateTime birthday, ToDoList todo,String password) {
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthday = birthday;
        this.todo = todo;
        this.password = password;
    }

    public boolean isValid() {
        return EmailValidator.getInstance().isValid(this.email)
                && StringUtils.isNotBlank(this.firstname)
                && StringUtils.isNotBlank(this.lastname)
                && this.birthday != null
                && LocalDateTime.now().minusYears(13).isAfter(this.birthday)
                && (this.password.length() > 8 || this.password.length() < 40);

    }

    public String getEmail(){
        return this.email;
    }

    public ToDoList getTodo(){
        return this.todo;
    }
    public void setEmail(String email) { this.email = email;
    }

    public void setFirstname(String firstname) {  this.firstname = firstname; }

    public void setLastname(String lastname) {this.lastname = lastname;}

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public void setTodo(ToDoList todo){
        if(isValid()) this.todo = todo;
    }
}
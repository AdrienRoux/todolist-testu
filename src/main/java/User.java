import lombok.*;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.validator.routines.EmailValidator;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String email;
    private String firstname;
    private String lastname;
    private LocalDateTime birthday;
    private ToDoList todo;

    public boolean isValid() {
        return EmailValidator.getInstance().isValid(this.email)
                && StringUtils.isNotBlank(this.firstname)
                && StringUtils.isNotBlank(this.lastname)
                && this.birthday != null
                && LocalDateTime.now().minusYears(13).isAfter(this.birthday);
    }
}
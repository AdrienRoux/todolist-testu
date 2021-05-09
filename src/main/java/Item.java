import java.time.LocalDate;
import java.time.LocalDateTime;

public class Item {

    private String name;
    private String content;
    private LocalDateTime creation_date;

    Item(String name, String content, LocalDateTime creation_date){
        this.name = name;
        if (content.length() > 1000){
            return;
        }
        this.content = content;
        this.creation_date = creation_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(LocalDateTime creation_date) {
        this.creation_date = creation_date;
    }

    public boolean isValid() {
        return this.content != null && this.getCreation_date() != null;
    }
}

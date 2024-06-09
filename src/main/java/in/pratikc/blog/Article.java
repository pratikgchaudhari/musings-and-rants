package in.pratikc.blog;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "articles")
@NoArgsConstructor
@AllArgsConstructor
@Data
public final class Article {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String content;

}

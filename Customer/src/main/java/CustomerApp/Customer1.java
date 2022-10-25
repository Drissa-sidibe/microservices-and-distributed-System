package CustomerApp;

import lombok.*;

import javax.persistence.*;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer1 {
    @Id
    @SequenceGenerator(
            name = "customer1_id_sequence",
            sequenceName = "customer1_id_sequence"
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;
    private String email;
}

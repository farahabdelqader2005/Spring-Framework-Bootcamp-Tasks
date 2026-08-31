import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "passport")
@Setter
@Getter
@NoArgsConstructor
public class Passport {

    public Passport(Person person, String passportNumber) {
        this.person = person;
        this.passportNumber = passportNumber;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id")
    private Person person;

    @Column(name = "passport_number")
    private String passportNumber;

    @Override
    public String toString() {
        return "Passport{" +
                "id=" + id +
                ", person=" + person +
                ", passportNumber='" + passportNumber + '\'' +
                '}';
    }
}

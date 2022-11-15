package MyGarage.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long odometer;
    @Column(name = "descriptionofmalfunction")
    private String descriptionOfMalfunction;
    @Column(name = "dateofarrival")
    private LocalDate dateOfArrival;

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", odometer=" + odometer +
                ", descriptione='" + descriptionOfMalfunction + '\'' +
                ", dateOfArrival=" + dateOfArrival +
                '}';
    }
}

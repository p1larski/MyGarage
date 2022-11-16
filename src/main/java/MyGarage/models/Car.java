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
    private String descriptionOfMalfunction;
    private LocalDate dateOfArrival;

    @ManyToOne(optional = true)
    @JoinColumn(name = "mechanic_id")
    private Mechanic mechanicWhoRepair;

    public Car(Long odometer, String descriptionOfMalfunction, LocalDate dateOfArrival, Mechanic mechanicWhoRepair) {
        this.odometer = odometer;
        this.descriptionOfMalfunction = descriptionOfMalfunction;
        this.dateOfArrival = dateOfArrival;
        this.mechanicWhoRepair = mechanicWhoRepair;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", odometer=" + odometer +
                ", descriptionOfMalfunction='" + descriptionOfMalfunction + '\'' +
                ", dateOfArrival=" + dateOfArrival +
                ", mechanicWhoRepair=" + mechanicWhoRepair +
                '}';
    }
}

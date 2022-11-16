package MyGarage.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Mechanic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String phoneNumber;
    private LocalDate dateOfEmployement;

    @OneToMany(mappedBy = "mechanicWhoRepair")
    private List<Car> carsRepairedByMechanic;

    public Mechanic(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}

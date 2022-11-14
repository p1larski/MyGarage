package MyGarage.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Car {
    @Id
    private Long id;
    private Long Odometer;
    private String Description;
    private LocalDate DateOfArrival;

}

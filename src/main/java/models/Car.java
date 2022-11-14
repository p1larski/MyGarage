package models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Car {
    private Long id;
    private Long Odometer;
    private String Description;
    private LocalDate DateOfArrival;

}

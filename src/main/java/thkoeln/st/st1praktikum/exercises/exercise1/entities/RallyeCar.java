package thkoeln.st.st1praktikum.exercises.exercise1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import thkoeln.st.st1praktikum.core.AbstractEntity;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class RallyeCar extends AbstractEntity {

    @ElementCollection(targetClass = Turbo.class, fetch = FetchType.EAGER)
    private final List<Turbo> turbos = new ArrayList<Turbo>();
    private String manufacturer;
    private Integer suspensionTravel;
    private Integer yearOfConstruction;
}

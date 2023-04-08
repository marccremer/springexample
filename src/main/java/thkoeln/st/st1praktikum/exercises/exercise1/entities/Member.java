package thkoeln.st.st1praktikum.exercises.exercise1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import thkoeln.st.st1praktikum.core.AbstractEntity;

import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Member extends AbstractEntity {
    private String name;
    private String telephoneNumber;
}

package thkoeln.st.st1praktikum.exercises.exercise1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import thkoeln.st.st1praktikum.core.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class PurchasingAgreement extends AbstractEntity {
    private Float price;
    private String agreementDate;

    @OneToOne
    private RallyeCar rallyeCar;

    @ManyToOne
    private Member member;
}

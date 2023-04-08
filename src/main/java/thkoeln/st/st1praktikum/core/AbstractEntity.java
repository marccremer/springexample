package thkoeln.st.st1praktikum.core;

import java.util.UUID;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@MappedSuperclass
public abstract class AbstractEntity {

  @Id
  @Getter
  protected UUID id;

  protected AbstractEntity() {
    this.id = UUID.randomUUID();
  }
}

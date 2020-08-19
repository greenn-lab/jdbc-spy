package experiment.spring.jdbcspy.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Fruit {
  
  @Id
  @GeneratedValue
  private Long id;
  
  private String name;
  private Integer acidity;
  private Integer brix;

}

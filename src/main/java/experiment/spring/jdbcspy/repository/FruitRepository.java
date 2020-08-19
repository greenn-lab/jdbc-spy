package experiment.spring.jdbcspy.repository;

import experiment.spring.jdbcspy.domain.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FruitRepository extends JpaRepository<Fruit, Long> {

  Optional<Fruit> findByNameLike(String water_melon);

}

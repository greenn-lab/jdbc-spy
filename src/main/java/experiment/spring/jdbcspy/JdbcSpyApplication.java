package experiment.spring.jdbcspy;

import experiment.spring.jdbcspy.domain.Fruit;
import experiment.spring.jdbcspy.repository.FruitRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
@RequiredArgsConstructor
@Slf4j
public class JdbcSpyApplication implements CommandLineRunner {
  
  private final FruitRepository repository;
  
  
  public static void main(String[] args) {
    SpringApplication.run(JdbcSpyApplication.class, args);
  }
  
  @Override
  public void run(String... args) throws Exception {
    final Optional<Fruit> waterMelon = repository.findByNameLike("Water Melon");
    
    if (waterMelon.isEmpty()) {
      repository.save(Fruit.builder().name("Water Melon").build());
    }
  }
  
}

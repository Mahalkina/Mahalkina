package hello;
import hello.model.Human;
import org.springframework.data.repository.CrudRepository;

    public interface HumanRepository extends CrudRepository<Human, Integer> {
//        List<Human> findByName(String lastName);

    }

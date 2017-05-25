package hello;

import org.springframework.data.repository.CrudRepository;

public interface HumanRepository extends CrudRepository<Human, Integer> {

}
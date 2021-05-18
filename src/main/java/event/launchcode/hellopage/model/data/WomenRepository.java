package event.launchcode.hellopage.model.data;

import event.launchcode.hellopage.model.WomenItems;
import org.springframework.data.repository.CrudRepository;

public interface WomenRepository extends CrudRepository<WomenItems,Integer> {
}

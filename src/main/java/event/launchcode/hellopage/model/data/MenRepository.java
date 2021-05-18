package event.launchcode.hellopage.model.data;

import event.launchcode.hellopage.model.MenItems;
import org.springframework.data.repository.CrudRepository;

public interface MenRepository extends CrudRepository<MenItems,Integer> {
}

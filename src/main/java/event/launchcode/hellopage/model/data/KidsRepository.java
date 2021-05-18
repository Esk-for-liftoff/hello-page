package event.launchcode.hellopage.model.data;

import event.launchcode.hellopage.model.KidsItems;
import org.springframework.data.repository.CrudRepository;

public interface KidsRepository extends CrudRepository<KidsItems,Integer> {
}

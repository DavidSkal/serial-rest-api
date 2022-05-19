package pl.skalski.serialapp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.skalski.serialapp.dao.entity.Serial;

@Repository
public interface SerialRepo extends CrudRepository<Serial,Long>
{

}

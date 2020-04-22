package encobib.repository;

import encobib.model.LendingPeriod;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostGreSqlLendingPeriodsRepository extends CrudRepository<LendingPeriod, Integer> {

    //    List<LendingPeriod> getLendingPeriodsById(int id);
}

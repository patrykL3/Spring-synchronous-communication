package pl.patryklubik.datacreator.adapter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.patryklubik.datacreator.model.Data;
import pl.patryklubik.datacreator.model.DataRepository;


/**
 * Create by Patryk Łubik on 24.07.2021.
 */

@Repository
interface SqlDataRepository extends DataRepository, JpaRepository<Data, Integer> {
}

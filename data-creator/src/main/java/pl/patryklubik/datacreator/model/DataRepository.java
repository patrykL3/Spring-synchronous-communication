package pl.patryklubik.datacreator.model;

import java.util.List;
import java.util.Optional;


/**
 * Create by Patryk Łubik on 24.07.2021.
 */
public interface DataRepository {

    Optional<Data> findById(Integer id);
    Data save(Data entity);
    List<Data> findAll();
}

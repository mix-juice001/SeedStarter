package seedsstarter.model;

import java.util.List;

public interface VarietyRepository {
    List<Variety> findAll();

    Variety findById(Integer id);

}

package seedsstarter.datasource;

import org.springframework.stereotype.Repository;
import seedsstarter.model.Variety;
import seedsstarter.model.VarietyRepository;

import java.util.List;

@Repository
public class VarietyDataSource implements VarietyRepository {
    @Override
    public List<Variety> findAll() {
        return null;
    }

    @Override
    public Variety findById(Integer id) {
        return null;
    }
}

package seedsstarter.service;

import seedsstarter.model.Variety;
import seedsstarter.model.VarietyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VarietyService {

    @Autowired
    private VarietyRepository varietyRepository;

    public List<Variety> findAll() {
        return this.varietyRepository.findAll();
    }

    public Variety findById(final Integer id) {
        return this.varietyRepository.findById(id);
    }

}

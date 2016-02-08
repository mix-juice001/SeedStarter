package seedsstarter.model;

import java.util.List;

public interface SeedStarterRepository {
    List<SeedStarter> findAll();

    void add(SeedStarter seedStarter);
}

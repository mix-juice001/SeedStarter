package seedsstarter.datasource;

import org.springframework.stereotype.Repository;
import seedsstarter.model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class SeedsStarterDataSource implements SeedStarterRepository {
    @Override
    public List<SeedStarter> findAll() {
        SeedStarter seedStarter1 = new SeedStarter();
        seedStarter1.setId(1);
        seedStarter1.setType(Type.PLASTIC);
        seedStarter1.setCovered(true);
        seedStarter1.setDatePlanted(new Date());
        seedStarter1.setFeatures(Feature.ALL);
        Row row1 = new Row();
        row1.setSeedsPerCell(300);
        Variety variety = new Variety();
        variety.setId(101);
        variety.setName("ポインセチア");
        row1.setVariety(variety);
        List<Row> rows = new ArrayList<Row>();
        rows.add(row1);
        seedStarter1.setRows(rows);

//        SeedStarter seedStarter2 = new SeedStarter();

        List<SeedStarter> seedStarters = new ArrayList<SeedStarter>();
        seedStarters.add(seedStarter1);
        return seedStarters;
    }

    @Override
    public void add(SeedStarter seedStarter) {

    }
}

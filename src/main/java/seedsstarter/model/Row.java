package seedsstarter.model;

public class Row {
    Variety variety;
    Integer seedsPerCell;

    public Variety getVariety() {
        return variety;
    }

    public void setVariety(Variety variety) {
        this.variety = variety;
    }

    public Integer getSeedsPerCell() {
        return seedsPerCell;
    }

    public void setSeedsPerCell(Integer seedsPerCell) {
        this.seedsPerCell = seedsPerCell;
    }
}

package seedsstarter.model;

public enum Feature {
    SEEDSTARTER_SPECIAL_SUBSTRATE,
    FERTILIZER,
    PH_COLLECTOR;

    public static Feature[] ALL = Feature.values();

    String name;
}

package KH._6._6_19;

public enum RangeType {
    SHORT("근거리"),
    LONG("원거리");

    private final String type;

    RangeType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

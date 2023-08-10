package sehwan._6._6_19;

public class Weapon extends Item {

    public RangeType rangeType;

    public Weapon (String name, RangeType rangeType) {
        super(name);
        this.rangeType = rangeType;
    }
}

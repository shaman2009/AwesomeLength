package org.nanchao.unit;

public abstract class LengthUnit {
    public static final LengthUnit MILE = new Mile();
    public static final LengthUnit YARD = new Yard();
    public static final LengthUnit FEET = new Feet();
    public static final LengthUnit INCH = new Inch();

    public static final long BASIC_UNIT = 1L;

    public abstract long convertToBasicLengthUnit();
}

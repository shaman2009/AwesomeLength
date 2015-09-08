package org.nanchao.unit;

public final class Feet extends LengthUnit {
    @Override
    public long convertToBasicLengthUnit() {
        return LengthUnit.INCH.convertToBasicLengthUnit() * 12;
    }
}

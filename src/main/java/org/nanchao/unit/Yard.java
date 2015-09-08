package org.nanchao.unit;

public final class Yard extends LengthUnit {
    @Override
    public long convertToBasicLengthUnit() {
        return LengthUnit.FEET.convertToBasicLengthUnit() * 3;
    }
}

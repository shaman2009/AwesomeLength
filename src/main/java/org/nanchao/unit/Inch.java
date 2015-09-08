package org.nanchao.unit;

public class Inch extends LengthUnit {
    @Override
    public long convertToBasicLengthUnit() {
        return LengthUnit.BASIC_UNIT * 10;
    }
}

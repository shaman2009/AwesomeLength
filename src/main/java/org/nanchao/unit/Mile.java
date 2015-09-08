package org.nanchao.unit;

public final class Mile extends LengthUnit {
    @Override
    public long convertToBasicLengthUnit() {
        return LengthUnit.YARD.convertToBasicLengthUnit() * 1760;
    }
}

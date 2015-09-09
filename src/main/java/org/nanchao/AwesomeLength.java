package org.nanchao;

import org.nanchao.unit.LengthUnit;

public final class AwesomeLength {
    private final long length;
    private final LengthUnit unit;

    public AwesomeLength(final long length, final LengthUnit unit) {
        this.length = length;
        this.unit = unit;
    }

    @Override
    public boolean equals(final Object otherLength) {
        if (this == otherLength) return true;
        if (otherLength == null || getClass() != otherLength.getClass()) return false;

        AwesomeLength that = (AwesomeLength) otherLength;
        return this.getBasicLength() == that.getBasicLength();
    }

    private long getBasicLength() {
        return this.length * this.unit.convertToBasicLengthUnit();
    }

    @Override
    public int hashCode() {
        int result = (int) (length ^ (length >>> 32));
        result = 31 * result + unit.hashCode();
        return result;
    }
}
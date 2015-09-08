package org.nanchao;

import junit.framework.Assert;
import org.junit.Test;
import org.nanchao.unit.LengthUnit;

public class AwesomeLengthTest {

    @Test
    public void one_mile_should_equal_one_mile() {
        AwesomeLength oneMileA = new AwesomeLength(1L, LengthUnit.MILE);
        AwesomeLength oneMileB = new AwesomeLength(1L, LengthUnit.MILE);
        Assert.assertTrue(oneMileA.equals(oneMileB));
    }

    @Test
    public void one_mile_should_not_equal_two_mile() {
        AwesomeLength oneMileA = new AwesomeLength(1L, LengthUnit.MILE);
        AwesomeLength twoMileB = new AwesomeLength(2L, LengthUnit.MILE);
        Assert.assertFalse(oneMileA.equals(twoMileB));
    }

    @Test
    public void one_yard_should_equal_one_yard() {
        AwesomeLength oneYardA = new AwesomeLength(1L, LengthUnit.YARD);
        AwesomeLength oneYardB = new AwesomeLength(1L, LengthUnit.YARD);
        Assert.assertTrue(oneYardA.equals(oneYardB));
    }

    @Test
    public void one_yard_should_not_equal_two_yard() {
        AwesomeLength oneYardA = new AwesomeLength(1L, LengthUnit.YARD);
        AwesomeLength twoYardB = new AwesomeLength(2L, LengthUnit.YARD);
        Assert.assertFalse(oneYardA.equals(twoYardB));
    }

    @Test
    public void one_mile_should_equal_1760_yard() {
        AwesomeLength _1Mile = new AwesomeLength(1L, LengthUnit.MILE);
        AwesomeLength _1760Yard = new AwesomeLength(1760L, LengthUnit.YARD);
        Assert.assertTrue(_1Mile.equals(_1760Yard));
    }

    @Test
    public void one_mile_should_not_equal_2000_yard() {
        AwesomeLength _1Mile = new AwesomeLength(1L, LengthUnit.MILE);
        AwesomeLength _2000Yard = new AwesomeLength(2000L, LengthUnit.YARD);
        Assert.assertFalse(_1Mile.equals(_2000Yard));
    }

    @Test
    public void one_feet_should_equal_one_feet() {
        AwesomeLength oneFeetA = new AwesomeLength(1L, LengthUnit.FEET);
        AwesomeLength oneFeetB = new AwesomeLength(1L, LengthUnit.FEET);
        Assert.assertTrue(oneFeetA.equals(oneFeetB));
    }

    @Test
    public void one_feet_should_not_equal_two_feet() {
        AwesomeLength oneFeetA = new AwesomeLength(1L, LengthUnit.FEET);
        AwesomeLength twoFeetB = new AwesomeLength(2L, LengthUnit.FEET);
        Assert.assertFalse(oneFeetA.equals(twoFeetB));
    }

    @Test
    public void one_yard_should_equal_three_feet() {
        AwesomeLength oneYard = new AwesomeLength(1L, LengthUnit.YARD);
        AwesomeLength threeFeet = new AwesomeLength(3L, LengthUnit.FEET);
        Assert.assertTrue(oneYard.equals(threeFeet));
    }

    @Test
    public void one_yard_should_not_equal_six_feet() {
        AwesomeLength oneYard = new AwesomeLength(1L, LengthUnit.YARD);
        AwesomeLength sixFeet = new AwesomeLength(6L, LengthUnit.FEET);
        Assert.assertFalse(oneYard.equals(sixFeet));
    }

    @Test
    public void one_inch_should_equal_one_inch() {
        AwesomeLength oneInchA = new AwesomeLength(1L, LengthUnit.INCH);
        AwesomeLength oneInchB = new AwesomeLength(1L, LengthUnit.INCH);
        Assert.assertTrue(oneInchA.equals(oneInchB));
    }

    @Test
    public void one_inch_should_not_equal_two_inch() {
        AwesomeLength oneInchA = new AwesomeLength(1L, LengthUnit.INCH);
        AwesomeLength twoInchB = new AwesomeLength(2L, LengthUnit.INCH);
        Assert.assertFalse(oneInchA.equals(twoInchB));
    }

    @Test
    public void one_feet_should_equal_12_inch() {
        AwesomeLength oneFeet = new AwesomeLength(1L, LengthUnit.FEET);
        AwesomeLength _12Inch = new AwesomeLength(12L, LengthUnit.INCH);
        Assert.assertTrue(oneFeet.equals(_12Inch));
    }

    @Test
    public void one_feet_should_not_equal_20_inch() {
        AwesomeLength oneFeet = new AwesomeLength(1L, LengthUnit.FEET);
        AwesomeLength _20Inch = new AwesomeLength(20L, LengthUnit.INCH);
        Assert.assertFalse(oneFeet.equals(_20Inch));
    }
}
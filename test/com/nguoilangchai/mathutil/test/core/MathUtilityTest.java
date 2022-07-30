package com.nguoilangchai.mathutil.test.core;

import com.nguoilangchai.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;

public class MathUtilityTest {

//Test trường hợp đưa đầu vào ngon, ra kết quả ngon    
@Test
public void testGetFactorialGivenRightArgumentReturnsWell(){
    long expected = 120;
    long actual = MathUtil.getFactorial(5);
    
    Assert.assertEquals(expected, actual);
    
    Assert.assertEquals(12, MathUtil.getFactorial(0));
    Assert.assertEquals(2, MathUtil.getFactorial(2));
    Assert.assertEquals(6, MathUtil.getFactorial(3));
}

// test trường hợp đưa đầu vào cà chớn, ra exception
@Test(expected = IllegalArgumentException.class)
public void testGetFactorialGivenWrongArgumentThrowsException(){
    MathUtil.getFactorial(21);

}

// test trường hợp đưa đầu vào cà chớn, ra exception bằng lambda expression
@Test
public void testGetFactorialGivenWrongArgumentThrowsException_Lambda(){
    Assert.assertThrows(IllegalArgumentException.class, 
            ()-> {
                MathUtil.getFactorial(21);
            }
            );
}

// test trường hợp đưa đầu vào cà chớn, ra exception bằng try catch
@Test
public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch(){
    try {
        MathUtil.getFactorial(-1);
    } catch (Exception e) {
        Assert.assertEquals("Invalid argument. N between 0..20", e.getMessage());
    }
    }
    
}

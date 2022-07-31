package com.nguoilangchai.mathutil.test.core;

import com.nguoilangchai.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    
    @Parameters
    public static Object[][] initData(){
        return new Integer[][]{
                                    {0, 1},      
                                    {1, 1},  
                                    {2, 2},  
                                    {3, 6},  
                                    {4, 24},
                                    {5, 120}
        };
    }
    
    @Parameter(value = 0)
    public int n;
    
    @Parameter(value = 1)
    public long expected;
    
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
        Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }
}

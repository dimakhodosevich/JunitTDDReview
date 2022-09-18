package by.itstep.khodosevich.lesson2;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class MultipleTest {

    Multiple multiple = new Multiple();


    @Parameters(
            {
                    "1,2,2",
                    "2,2,4",
                    "3,3,9"
            }
    )
    @Test
    public void multiple_PositiveResult_WithAccessData(int value1, int value2, int result){
        assertEquals(result, multiple.multiple(value1,value2));
    }




}
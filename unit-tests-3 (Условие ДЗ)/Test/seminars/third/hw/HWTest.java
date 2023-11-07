package seminars.third.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HWTest {
    MainHW mainHW;

    @BeforeEach
    void SetUp(){
        mainHW=new MainHW();
    }

    @ParameterizedTest
    @ValueSource(ints={2,4,6,8})
    void evenNumberTest(int i){
        assertTrue(mainHW.evenOddNumber(i));
    }

    @ParameterizedTest
    @ValueSource(ints={1,3,5,7})
    void oddNumberTest(int i){
        assertFalse(mainHW.evenOddNumber(i));
    }

    @ParameterizedTest
    @ValueSource(ints={30,90})
    void inIntervalMethodTest(int i){
        assertTrue(mainHW.numberInInterval(i));
    }

    @ParameterizedTest
    @ValueSource(ints={20,102})
    void outIntervalMethodTest(int i){
        assertFalse(mainHW.numberInInterval(i));
    }
}

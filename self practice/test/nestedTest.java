package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;

@Nested
public class nestedTest {

    public String str, str1;
    @Test
    @BeforeEach
    public void setEmpty(){
        str = "a";
        str1= "A";
    }
    @Test
    public void lengthisZero(){
        assertEquals(1, str.length());
    }
}

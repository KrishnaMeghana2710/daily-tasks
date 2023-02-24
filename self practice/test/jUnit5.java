package test;
import calc.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


class jUnit5{
    @Test
    void test(){
        assertEquals(2, 2);
    }

    @Test
    void lengthTest(){
        assertEquals("abc".length(), 3);
    }

    @Test
    void addTest(){
        add obj = new add();
        int sum = 5;
        int result = obj.add1(2, 3);
        assertEquals(sum, result);

}
    @Test
    void subtract(){
        sub obj= new sub();
        int expected = 5;
        int result = obj.sub1(10, 5);
        assertEquals(expected, result);
}
    
    @Test
    void performanceTest(){
        assertTimeout(Duration.ofSeconds(5), 
        ()->{

            for(int i =0 ;i<1000; i++){
                int j = i;
                System.out.println(j);
            }
        }
        );
    }

    @Nested
    class NestedTest{
        private String str;
        @Test
        @BeforeEach
        void setEmpty(){
            str="a";
        }

        @Test
        void upper(){
            assertEquals("A", str.toUpperCase());
        }
        @Test
        void length(){
            assertEquals(1, str.length());
        }


    }
    

}
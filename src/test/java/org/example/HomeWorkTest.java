package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HomeWorkTest {
    @Test
    public void shouldGetExampleResult_whenGivenExampleStr(){
        HomeWork homeWork = new HomeWork();
        String str = "abcddcba";

        Assertions.assertEquals("abcd", homeWork.findMaxSubstring(str));
    }

    @Test
    public void shouldGetEqualAsInputStr_whenGivenStr(){
        HomeWork homeWork = new HomeWork();
        String str = "123456";

        Assertions.assertEquals("123456", homeWork.findMaxSubstring(str));
    }

    @Test
    public void shouldGetOneLengthStr_whenGivenRepeatableStr(){
        HomeWork homeWork = new HomeWork();
        String str = "11111";

        Assertions.assertEquals("1", homeWork.findMaxSubstring(str));
    }

    @Test
    public void shouldGetThreeLengthStr_whenGivenRepeatableStr(){
        HomeWork homeWork = new HomeWork();
        String str = "123123123";

        Assertions.assertEquals("123", homeWork.findMaxSubstring(str));
    }

}
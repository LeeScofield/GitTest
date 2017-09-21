package com.test.git;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        List<Integer> list = Arrays.asList(1,2,5,6,3,4);

        list.sort((a,b) -> a - b);
        list.forEach(System.out::println);
    }
}

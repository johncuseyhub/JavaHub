package org.cusey;

import java.util.function.Function;

public class MyMain {

	public static void main(String[] args) {
        Function<String, Integer> func = x -> x.length();

        Integer apply = func.apply("mkyong");   // 6

        System.out.println(apply);

	}

}

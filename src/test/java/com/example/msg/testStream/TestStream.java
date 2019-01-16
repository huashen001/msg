package com.example.msg.testStream;

import org.hibernate.boot.jaxb.hbm.spi.JaxbHbmClassRenameType;
import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLOutput;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author WJQ
 * @Title: TestStream
 * @ProjectName msg
 * @Description: TODO
 * @date 2019/1/1415:10
 */
public class TestStream {
    @Test
    public void test() {
        Stream<String> i = Stream.of("I", "love", "you", "you");
        // i.forEach(str -> System.out.print(str));

        // i.filter(str -> str.length()==3).forEach(str -> System.out.print(str));
        i.distinct().forEach(str -> System.out.print(str));

        List<String> collect = i.map(str -> str.toUpperCase()).collect(Collectors.toList());
        collect
                .forEach(str -> System.out.println(str));
    }

    @Test
    public void tes() {
        Integer i1 = 50;
        Integer i2 = 50;
        System.out.println(i1==i2);
    }
}

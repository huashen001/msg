package com.example.msg.dataobject;

import io.lettuce.core.dynamic.annotation.CommandNaming;
import lombok.Data;

import javax.persistence.*;

/**
 * @author WJQ
 * @Title: DataVO
 * @ProjectName msg
 * @Description: TODO
 * @date 2019/1/1114:19
 */


@Data
@Entity
@Table(name = "data")
public class DataVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private  String name;
    private int age;


    public DataVO(Integer id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "DataVO{" +
                "id=" + id +
                ", 姓名='" + name + '\'' +
                ", 年龄=" + age +
                '}';
    }

    public DataVO() {
    }
}

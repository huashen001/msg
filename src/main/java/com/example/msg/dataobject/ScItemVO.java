package com.example.msg.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author WJQ
 * @Title: ScItem
 * @ProjectName msg
 * @Description: TODO
 * @date 2019/1/916:43
 */

@Data
@Entity
@Table(name = "nmfz_goods")
public class ScItemVO {
    @Id
    private String goods_id;
    private String  goods_name;

}

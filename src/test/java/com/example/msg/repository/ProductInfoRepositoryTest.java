package com.example.msg.repository;

import com.example.msg.MsgApplicationTests;
import com.example.msg.dataobject.ScItem;
import com.example.msg.dataobject.ScItemVO;
import lombok.Data;
import org.junit.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

/**
 * @author WJQ
 * @Title: ProductInfoRepositoryTest
 * @ProjectName msg
 * @Description: TODO
 * @date 2019/1/916:53
 */

@Component
@Data
public class ProductInfoRepositoryTest extends MsgApplicationTests {
    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Test
    public void test() {
        List<ScItem> all = productInfoRepository.findAll();
        List<String> collect = all.stream().map(ScItem::getGoods_id).collect(Collectors.toList());
        List<ScItemVO> collect1 = all.stream().map(e -> {
            ScItemVO scItemVO = new ScItemVO();
            System.out.println(e);
            BeanUtils.copyProperties(e, scItemVO);
            System.out.println(scItemVO);
            return scItemVO;
        }).collect(Collectors.toList());
        for (String s : collect) {
            System.out.println(s.toString());
        }
        for (ScItem scItem : all) {
            System.out.println(scItem.getGoods_name());
        }

    }

    @Test
    public void gitDataById() {
        Optional<ScItem> one = productInfoRepository.findById("159CF744A48B4CD58C02F81EFE788DFG2");
        if(one.isPresent()){
            System.out.println(one.get().getGoods_id());
        }else {
            System.out.println("数据为ＮＵＬＬ　");
        }

    }
}
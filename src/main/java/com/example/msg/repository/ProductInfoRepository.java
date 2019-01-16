package com.example.msg.repository;

import com.example.msg.dataobject.ScItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author WJQ
 * @Title: ProductInfoRepository
 * @ProjectName msg
 * @Description: TODO
 * @date 2019/1/916:40
 */
public interface ProductInfoRepository extends JpaRepository<ScItem,String > {

   /* List<ScItem>  findAllByGoods_idIn();*/
}

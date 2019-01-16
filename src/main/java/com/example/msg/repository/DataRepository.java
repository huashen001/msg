package com.example.msg.repository;

import com.example.msg.dataobject.DataVO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author WJQ
 * @Title: DataRepository
 * @ProjectName msg
 * @Description: TODO
 * @date 2019/1/1114:21
 */
public interface DataRepository extends JpaRepository<DataVO,Integer> {
}

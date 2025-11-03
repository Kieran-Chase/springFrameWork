package com.xzit.mapper;

import com.xzit.entity.Acc;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/11/3
 */
@Repository
public interface AccMapper {
    @Update("update acc set money=money-#{money} where accno=#{accno}")
    void update(Acc acc);
}

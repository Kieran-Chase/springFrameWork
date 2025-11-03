package com.xzit.mapper;

import com.xzit.entity.Records;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/11/3
 */
@Repository
public interface RecordsMapper {
    @Insert("insert into records values(null,#{accno},#{category},#{money})")
    void insert(Records records);
}

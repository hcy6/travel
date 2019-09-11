package org.lanqiao.travel.mapper;

import org.lanqiao.travel.entity.Work;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface WorkMapper {
    int deleteByPrimaryKey(Integer workId);

    int insert(Work record);

    int insertSelective(Work record);

    Work selectByPrimaryKey(Integer workId);

    List selectAllWork();

    int updateByPrimaryKeySelective(Work record);

    int updateByPrimaryKey(Work record);
}
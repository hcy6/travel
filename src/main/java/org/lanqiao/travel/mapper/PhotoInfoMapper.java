package org.lanqiao.travel.mapper;

import org.lanqiao.travel.entity.PhotoInfo;

public interface PhotoInfoMapper {
    int deleteByPrimaryKey(Integer photoContentId);

    int insert(PhotoInfo record);

    int insertSelective(PhotoInfo record);

    PhotoInfo selectByPrimaryKey(Integer photoContentId);

    int updateByPrimaryKeySelective(PhotoInfo record);

    int updateByPrimaryKey(PhotoInfo record);
}
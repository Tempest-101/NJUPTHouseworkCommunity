package com.njupt.community.dao;

import com.njupt.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

@Mapper
@Repository
public interface DiscussPostMapper {
    List<DiscussPost> selectDiscussPosts(@Param("userId") int userId, @Param("offset") int offset, @Param("limit") int limit);

    int selectDiscussPostRows(@Param("userId") int userId);
}

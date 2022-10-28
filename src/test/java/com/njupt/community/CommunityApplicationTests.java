package com.njupt.community;

import com.njupt.community.dao.DiscussPostMapper;
import com.njupt.community.dao.UserMapper;
import com.njupt.community.entity.DiscussPost;
import com.njupt.community.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CommunityApplicationTests {

    @Autowired
    private DiscussPostMapper discussDiscussMapper;
    @Test
    void contextLoads() {
        List<DiscussPost> a = discussDiscussMapper.selectDiscussPosts(0, 0, 10);
        for(DiscussPost i : a)
        System.out.println(i);
    }

}

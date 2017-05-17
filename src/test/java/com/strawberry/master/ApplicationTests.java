package com.strawberry.master;

import com.strawberry.master.entity.BlogProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by yaguang.wang
 * on 2017/5/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ApplicationTests {
    @Autowired
    private BlogProperties blogProperties;

    @Test
    public void getLog() {
        Assert.assertEquals(blogProperties.getName(),"kehan");
        Assert.assertEquals(blogProperties.getTitle(),"Spring boot");
    }
}

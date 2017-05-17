package com.strawberry.master.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by yaguang.wang
 * on 2017/5/17.
 */
@Component
@Getter
@Setter
public class BlogProperties {

    @Value("${com.starwberry.master.name}")
    private String name;

    @Value("${com.starwberry.master.title}")
    private String title;
}

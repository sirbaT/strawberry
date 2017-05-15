package com.strawberry.master.dao.inter;

import com.strawberry.master.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 用户仓库
 * Created by yaguang,wang
 * on 2017/5/15.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> loadUserByUserName(String userName);
}

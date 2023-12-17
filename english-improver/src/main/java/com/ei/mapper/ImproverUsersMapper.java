package com.ei.mapper;

import com.ei.entities.ImproverUsers;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author Crean Culty
 * @date 2023/12/16
 */
@Mapper
@Repository
public interface ImproverUsersMapper {
    ImproverUsers selectByUsername(String username);
}

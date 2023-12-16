package com.ei.mapper;

import com.ei.entities.ImproverUsers;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Crean Culty
 * @date 2023/12/16
 */
@Mapper
public interface ImproverUsersMapper {
    ImproverUsers selectByUsername(String username);
}

package com.ei.mapper;

import com.ei.entities.Tense;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 86157
 * @date 2023/12/16
 */
@Mapper
public interface TenseMapper {
    List<Tense> getAllTense();
    Boolean insertTense(Tense tense);
}

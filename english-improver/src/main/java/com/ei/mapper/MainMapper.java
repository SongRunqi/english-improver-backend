package com.ei.mapper;

import com.ei.pojo.DO.EiWord;
import com.ei.pojo.DTO.Word;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 86157
 * 2024/1/7
 */
@Mapper
public interface MainMapper {
    int addWord(Word word);
    List<EiWord> getWords();
}

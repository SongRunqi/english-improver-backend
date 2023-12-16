package com.ei.mapper;

import com.ei.entities.Words;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 86157
 * @date 2023/12/16
 */
@Mapper
public interface WordsMapper {

    /**
     * 查找属于某用户的所有单词
     * @param userId 用户id
     *           @return 单词列表
     */
    List<Words> getWordsByUserId(Integer userId);
    /**
     * 通过单词id和词性查找单词
     * @param id 单词id
     * @param property 词性
     * @return 句子列表
     */
    Words getWordsByIdAndProperty(Integer id, String property);
    /**
     * 通过单词id查找单词
     * @param id 单词id
     * @return 句子列表
     */
    Words getWordsById(Integer id);
    /**
     * 通过单词id和用户id查找单词
     * @param userId 用户id
     * @param wordId 单词id
     * @return 句子列表
     */
    List<Words> getWordsById(Integer userId, Integer wordId);

    /**
     * 插入单词
     * @param word 单词
     * @return 是否插入成功
     */
    Integer insertWord(Words word);
}

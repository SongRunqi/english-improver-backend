package com.ei.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author 86157
 * @date 2023/12/16
 */
@Mapper
public interface WordRelateToSentenceMapper {

    /**
     * 根据用户、单词、词性id查找句子id
     * @param userId 用户id
     * @param wordId 单词id
     * @return 句子id
     */
    Integer[] getSentenceIdByUserIdAndWordIdAndTenseId(Integer userId, Integer wordId);

    /**
     * 根据用户和句子id查找单词id
     * @param userId 用户id
     * @param sentenceId 句子id
     * @return 单词id
     */
    Integer[] getWordIdByUserIdAndSentenceId(Integer userId, Integer sentenceId);
}

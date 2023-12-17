package com.ei.mapper;

import com.ei.entities.WordRelateToSentence;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author 86157
 * @date 2023/12/16
 */
@Mapper
@Repository
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

    /**
     * 根据单词句子关联插入记录
     * @param wordRelateToSentence 单词句子关联
     * @return 是否插入成功
     */
    Integer insertWordRelateToSentence(WordRelateToSentence wordRelateToSentence);
}

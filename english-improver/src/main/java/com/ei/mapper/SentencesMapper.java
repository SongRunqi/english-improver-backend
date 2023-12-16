package com.ei.mapper;

import com.ei.entities.Sentences;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 86157
 * @date 2023/12/16
 */
@Mapper
public interface SentencesMapper {
    /**
     * 根据用户和句子id查找句子
     * @param userId 用户id
     * @param sentenceId 句子id
     * @return 句子
     */
    Sentences getSentencesByUserIdAndSentenceId(Integer userId, Integer sentenceId);

    /**
     * 查找属于某用户的所有句子
     * @param userId 用户id
     * @return 句子列表
     */
    List<Sentences> getSentencesByUserId(Integer userId);

    /**
     * 插入句子
     * @param sentences 句子
     * @return 是否插入成功
     */
    boolean insertSentences(Sentences sentences);
}

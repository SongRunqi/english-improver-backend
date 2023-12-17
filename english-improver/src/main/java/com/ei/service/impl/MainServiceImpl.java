package com.ei.service.impl;


import com.ei.entities.Sentences;
import com.ei.entities.WordRelateToSentence;
import com.ei.entities.Words;
import com.ei.mapper.*;
import com.ei.service.MainService;
import com.ei.util.Result;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Map;

/**
 * @author 86157
 * @date 2023/12/16
 */
@Service
public class MainServiceImpl implements MainService {
    private final ImproverUsersMapper usersMapper;
    private final SentencesMapper sentencesMapper;
    private final TenseMapper tenseMapper;
    private final WordsMapper wordsMapper;
    private final WordRelateToSentenceMapper wordRelateToSentenceMapper;

    /**
     * 构造函数
     * @param usersMapper 用户mapper
     * @param sentencesMapper 句子mapper
     * @param tenseMapper 时态mapper
     * @param wordsMapper 单词mapper
     */
    public MainServiceImpl(ImproverUsersMapper usersMapper,
                           SentencesMapper sentencesMapper,
                           TenseMapper tenseMapper,
                           WordsMapper wordsMapper,
                           WordRelateToSentenceMapper wordRelateToSentenceMapper) {
        this.usersMapper = usersMapper;
        this.sentencesMapper = sentencesMapper;
        this.tenseMapper = tenseMapper;
        this.wordsMapper = wordsMapper;
        this.wordRelateToSentenceMapper = wordRelateToSentenceMapper;
    }

    /**
     * 查找属于某用户的所有单词
     *
     * @param id 用户id
     * @return 单词列表
     */
    public Result getWordsByUserId(Integer id) {
        var data = wordsMapper.getWordsByUserId(id);
        return Result.success(Map.of("words", data));
    }

    /**
     * 查找属于某用户的所有句子
     * @param id 用户id
     * @return 句子列表
     */
    public Result getSentencesByUserId(Integer id) {
        var sentences =  sentencesMapper.getSentencesByUserId(id);
        return Result.success(Map.of("sentences", sentences));
    }

    // 通过用户、单词、词性id查找句子 TODO: 2023/12/16 未完成



    /**
     * 根据句子id和用户id查找单词
     * @param  sentenceId 句子id
     * @param userId 用户id
     * @return 单词列表
     * TODO: 2023/12/16 未完成
     *
     */
    public Result getWordsBySentenceIdAndUserId(Integer sentenceId, Integer userId) {
        var wordIds = wordRelateToSentenceMapper.getWordIdByUserIdAndSentenceId(userId, sentenceId);
        var words = Arrays.stream(wordIds).map(wordsMapper::getWordsById).toArray();
        return Result.success(Map.of("words", words));
    }

    /**
     * 添加单词
     * @param word 单词
     * @return 是否添加成功
     */
    public Result addWordToUser(Words word) {
        var result = wordsMapper.insertWord(word);
        if (result >= 1) {
            return Result.success("添加成功");
        } else {
            return Result.fail("添加失败");
        }
    }
    /**
     * 添加句子
     * @param sentence 句子
     * @return 是否添加成功
     */
    public Result addSentenceToUser(Sentences sentence) {
        var result = sentencesMapper.insertSentences(sentence);
        if (result >= 1) {
            return Result.success("添加成功");
        } else {
            return Result.fail("添加失败");
        }
    }

    /**
     * 将单词与句子关联
     * @param wordRelateToSentence 单词句子关联
     * @return 是否关联成功
     */
    public Result relateWordToSentence(WordRelateToSentence wordRelateToSentence) {
        var result = wordRelateToSentenceMapper.insertWordRelateToSentence(wordRelateToSentence);
        if (result >= 1) {
            return Result.success("关联成功");
        } else {
            return Result.fail("关联失败");
        }
    }
}

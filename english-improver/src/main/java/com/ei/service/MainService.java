package com.ei.service;

import com.ei.pojo.DO.EiWord;
import com.ei.pojo.DTO.Word;

import java.util.List;

/**
 * @author 86157
 * @date 2023/12/16
 */

public interface MainService {
    /**
     * 添加单词
     * @param word 单词
     * @return 影像记录数，失败为０
     */
    int addWord(Word word);

    /**
     * 获取所有单词
     * @return 所有单词
     */
    List<EiWord> getWords();
}

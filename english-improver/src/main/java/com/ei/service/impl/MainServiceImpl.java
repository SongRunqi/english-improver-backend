package com.ei.service.impl;


import com.ei.mapper.MainMapper;
import com.ei.pojo.DO.EiWord;
import com.ei.pojo.DTO.Word;
import com.ei.service.MainService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 86157
 * @date 2023/12/16
 */
@Service
public class MainServiceImpl implements MainService {
    MainMapper mainMapper;
    public MainServiceImpl(MainMapper mainMapper) {
        this.mainMapper = mainMapper;
    }

    /**
     * 添加单词
     * @param word 单词
     * @return 影像记录数，失败为０
     */
    @Override
    public int addWord(Word word) {
        System.out.println("word = " + word);
        return mainMapper.addWord(word);
    }
    /**
     * 获取所有单词
     * @return 所有单词
     */
    @Override
    public List<EiWord> getWords() {
        return mainMapper.getWords();
    }

}

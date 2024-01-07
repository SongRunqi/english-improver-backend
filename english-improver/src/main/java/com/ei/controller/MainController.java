package com.ei.controller;

import com.ei.pojo.DO.EiWord;
import com.ei.pojo.DTO.Word;
import com.ei.service.MainService;
import com.ei.util.Operation;
import com.ei.util.Result;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * @author Crean Culty
 * @date 2023/12/16
 */
@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping("/main")
public class MainController {
    private final MainService mainService;

    public MainController(MainService mainService) {
        this.mainService = mainService;
    }


    /**
     * 添加单词
     * @param word 单词
     * @return 添加结果
     */
    @RequestMapping("/addWord")
    public Result addWord(@RequestBody Word word) {
        int result = mainService.addWord(word);
        if (result == 1) {
            return Result.success(Operation.ADD);
        } else {
            return Result.fail(Operation.ADD);
        }
    }

    /**
     * 获取所有单词
     * @return 结果
     */
    @RequestMapping("/getWords")
    public Result getWords() {
        List<EiWord> words = mainService.getWords();
        if (words == null) {
            return Result.success("空数据",Operation.QUERY);
        }
        HashMap<String, Object> data = new HashMap<>();
        data.put("words", words);
        return Result.success(Operation.QUERY, data);
    }
}

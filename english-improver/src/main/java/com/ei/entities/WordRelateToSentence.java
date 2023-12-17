package com.ei.entities;

import lombok.Data;

/**
 * @author 86157
 * @date 2023/12/16
 */
@Data
public class WordRelateToSentence {
    private Integer userId;
    private Integer wordId;
    private Integer tenseId;
    private Integer sentenceId;
}

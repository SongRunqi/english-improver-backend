package com.ei.entities;

import lombok.Data;

/**
 * @author 86157
 * @date 2023/12/16
 */
@Data
public class WordRelateToSentence {
    private Integer user_id;
    private Integer word_id;
    private Integer tense_id;
    private Integer sentence_id;
}

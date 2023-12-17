package com.ei.entities;

import lombok.Data;

import java.io.Serial;
import java.sql.Date;

/**
 * @author Crean Culty
 * @date 2023/12/16
 */
@Data
public class Words implements java.io.Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private Integer id;
    private Date createdDate;
    private Integer userId;
    private String word;//单词
    private String pronunciation;//音标
    private Integer propertyId;//词性
    private String means;//词义
    private Integer tense;//时态
}

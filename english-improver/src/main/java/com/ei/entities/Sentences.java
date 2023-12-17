package com.ei.entities;

import lombok.Data;

import java.io.Serial;

/**
 * @author Crean Culty
 * @date 2023/12/16
 */
@Data
public class Sentences implements java.io.Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String userId;
    private String sentence;
    private String createdDate;
    private String translation;
    private String grammar;
}

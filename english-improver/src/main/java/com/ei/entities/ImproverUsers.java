package com.ei.entities;

import java.io.Serial;

/**
 * @author Crean Culty
 * @date 2023/12/16
 */
@lombok.Data
public class ImproverUsers implements java.io.Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String username;
    private transient String password;
    private String createdDate;

}

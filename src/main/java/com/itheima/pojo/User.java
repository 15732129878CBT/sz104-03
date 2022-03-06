package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Cbt
 * @createDate 2022-03-06 16:29
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    /**
     * id：用户id
     * username：用户名
     * password：密码
     */
    private Integer id;
    private String username;
    private Integer password;
}

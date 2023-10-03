package com.jarvlis.jaroj.model.dto.question;

/**
 * Author:Jarvlis
 * Date:2023-10-03
 * Time:11:32
 */

import lombok.Data;

/**
 * 题目用例
 */
@Data
public class JudgeCase {
    /**
     * 题目输入
     */
    private String input;

    /**
     * 题目输出
     */
    private String output;
}

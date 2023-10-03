package com.jarvlis.jaroj.model.dto.question;

/**
 * Author:Jarvlis
 * Date:2023-10-03
 * Time:11:32
 */

import lombok.Data;

/**
 * 判题配置
 */
@Data
public class JudgeConfig {

    /**
     * 时间限制(ms)
     */
    private Long timeLimit;

    /**
     * 内存限制(KB)
     */
    private Long memoryLimit;

    /**
     * 堆栈限制(KB)
     */
    private Long stackLimit;
}

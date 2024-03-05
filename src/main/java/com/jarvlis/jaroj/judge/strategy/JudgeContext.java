package com.jarvlis.jaroj.judge.strategy;

/**
 * Author:Jarvlis
 * Date:2024-01-11
 * Time:20:50
 */

import com.jarvlis.jaroj.judge.codesandbox.model.JudgeInfo;
import com.jarvlis.jaroj.model.dto.question.JudgeCase;
import com.jarvlis.jaroj.model.entity.Question;
import com.jarvlis.jaroj.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * 上下文（用于定义在策略中需要传递的参数）
 */

@Data
public class JudgeContext {
    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;
}

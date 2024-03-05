package com.jarvlis.jaroj.judge;

import com.jarvlis.jaroj.judge.strategy.DefaultJudgeStrategyImpl;
import com.jarvlis.jaroj.judge.strategy.JavaJudgeStrategyImpl;
import com.jarvlis.jaroj.judge.strategy.JudgeContext;
import com.jarvlis.jaroj.judge.strategy.JudgeStrategy;
import com.jarvlis.jaroj.judge.codesandbox.model.JudgeInfo;
import com.jarvlis.jaroj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * Author:Jarvlis
 * Date:2024-01-11
 * Time:21:33
 */
@Service
public class JudgeManager {
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategyImpl();
        if ("java".equals(language)) {
            judgeStrategy = new JavaJudgeStrategyImpl();
        }
        return judgeStrategy.doJudge(judgeContext);
    }
}

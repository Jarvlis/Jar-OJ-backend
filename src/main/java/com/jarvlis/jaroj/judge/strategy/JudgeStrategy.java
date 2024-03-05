package com.jarvlis.jaroj.judge.strategy;

import com.jarvlis.jaroj.judge.codesandbox.model.JudgeInfo;

/**
 * 判题策略
 */
public interface JudgeStrategy {
    JudgeInfo doJudge(JudgeContext judgeContext);
}

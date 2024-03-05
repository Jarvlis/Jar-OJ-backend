package com.jarvlis.jaroj.judge;

import com.jarvlis.jaroj.model.entity.QuestionSubmit;
import com.jarvlis.jaroj.model.vo.QuestionSubmitVO;

/**
 * Author:Jarvlis
 * Date:2024-01-11
 * Time:16:11
 */
public interface JudgeService {
    /**
     * 判题服务
     * @param questionSubmitId 题目ID
     * @return
     */
    QuestionSubmit doJudge(long questionSubmitId);
}

package com.jarvlis.jaroj.service;

import com.jarvlis.jaroj.model.dto.quesitonsubmit.QuestionSubmitAddRequest;
import com.jarvlis.jaroj.model.entity.QuestionSubmit;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jarvlis.jaroj.model.entity.User;

/**
* @author 十肆
* @description 针对表【question_submit(题目提交)】的数据库操作Service
* @createDate 2023-10-03 10:40:54
*/
public interface QuestionSubmitService extends IService<QuestionSubmit> {
    /**
     * 提交
     *
     * @param questionSubmitAddRequest 题目提交信息
     * @param loginUser
     * @return
     */
    long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitAddRequest, User loginUser);
}

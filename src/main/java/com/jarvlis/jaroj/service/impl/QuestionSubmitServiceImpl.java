package com.jarvlis.jaroj.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jarvlis.jaroj.common.ErrorCode;
import com.jarvlis.jaroj.exception.BusinessException;
import com.jarvlis.jaroj.mapper.QuestionSubmitMapper;
import com.jarvlis.jaroj.model.dto.quesitonsubmit.QuestionSubmitAddRequest;
import com.jarvlis.jaroj.model.entity.Question;
import com.jarvlis.jaroj.model.entity.QuestionSubmit;
import com.jarvlis.jaroj.model.entity.User;
import com.jarvlis.jaroj.model.enums.QuestionSubmitLanguageEnum;
import com.jarvlis.jaroj.model.enums.QuestionSubmitStatusEnum;
import com.jarvlis.jaroj.service.QuestionService;
import com.jarvlis.jaroj.service.QuestionSubmitService;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
* @author 十肆
* @description 针对表【question_submit(题目提交)】的数据库操作Service实现
* @createDate 2023-10-03 10:40:54
*/
@Service
public class QuestionSubmitServiceImpl extends ServiceImpl<QuestionSubmitMapper, QuestionSubmit>
    implements QuestionSubmitService{
    @Resource
    private QuestionService questionService;

    /**
     * 提交题目
     *
     * @param questionSubmitAddRequest
     * @param loginUser
     * @return
     */
    @Override 
    public long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitAddRequest, User loginUser) {
        // 判断实体是否存在，根据类别获取实体
        long questionId = questionSubmitAddRequest.getQuestionId();
        String language = questionSubmitAddRequest.getLanguage();
        QuestionSubmitLanguageEnum languageEnum = QuestionSubmitLanguageEnum.getEnumByValue(language);
        Question question = questionService.getById(questionId);
        if (question == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND_ERROR);
        }
        // 是否已提交题目
        long userId = loginUser.getId();
        // 每个用户串行提交题目
        QuestionSubmit questionSubmit = new QuestionSubmit();
        questionSubmit.setUserId(userId);
        questionSubmit.setQuestionId(questionId);
        questionSubmit.setCode(questionSubmitAddRequest.getCode());
        questionSubmit.setLanguage(questionSubmitAddRequest.getLanguage());
        // todo 设置初始状态
        questionSubmit.setJudgeInfo("{}");
        questionSubmit.setStatus(QuestionSubmitStatusEnum.WAITING.getValue());

        boolean save = this.save(questionSubmit);
        if(!save){
            throw new BusinessException(ErrorCode.SYSTEM_ERROR, "数据插入失败");
        }
        return questionSubmit.getId();
    }
}





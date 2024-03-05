package com.jarvlis.jaroj.judge.codesandbox.impl;

import com.jarvlis.jaroj.judge.codesandbox.CodeSandBox;
import com.jarvlis.jaroj.judge.codesandbox.model.ExecuteCodeRequest;
import com.jarvlis.jaroj.judge.codesandbox.model.ExecuteCodeResponse;
import com.jarvlis.jaroj.judge.codesandbox.model.JudgeInfo;
import com.jarvlis.jaroj.model.enums.JudgeInfoMessageEnum;
import com.jarvlis.jaroj.model.enums.QuestionSubmitStatusEnum;

import java.util.List;

/**
 * Author:Jarvlis
 * Date:2024-01-11
 * Time:14:22
 */

/**
 *  实例代码沙箱（仅为了跑通业务流程）
 */
public class ExampleCodeSandBox implements CodeSandBox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeRequest) {
        List<String> inputLists = executeRequest.getInputLists();

        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        executeCodeResponse.setOutputLists(inputLists);
        executeCodeResponse.setMessage("测试执行成功");
        executeCodeResponse.setStatus(QuestionSubmitStatusEnum.SUCCEED.getValue());
        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoMessageEnum.ACCEPTED.getText());
        judgeInfo.setMemory(100L);
        judgeInfo.setTime(100L);

        executeCodeResponse.setJudgeInfo(judgeInfo);

        return executeCodeResponse;
    }
}

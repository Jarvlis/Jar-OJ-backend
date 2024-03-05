package com.jarvlis.jaroj.judge.codesandbox;

import com.jarvlis.jaroj.judge.codesandbox.model.ExecuteCodeRequest;
import com.jarvlis.jaroj.judge.codesandbox.model.ExecuteCodeResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Author:Jarvlis
 * Date:2024-01-11
 * Time:15:46
 */
@Slf4j
@AllArgsConstructor
public class CodeSandboxProxy implements CodeSandBox {
    private final CodeSandBox codeSandBox;

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeRequest) {
        log.info("代码沙箱请求信息: " + executeRequest.toString());
        ExecuteCodeResponse executeCodeResponse = codeSandBox.executeCode(executeRequest);
        log.info("代码沙箱响应信息: " + executeCodeResponse.toString());
        return executeCodeResponse;
    }
}

package com.jarvlis.jaroj.judge.codesandbox;

import com.jarvlis.jaroj.judge.codesandbox.model.ExecuteCodeRequest;
import com.jarvlis.jaroj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * Author:Jarvlis
 * Date:2023-12-26
 * Time:17:27
 */
public interface CodeSandBox {
    /**
     * 执行代码
     * @param executeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeRequest);
}

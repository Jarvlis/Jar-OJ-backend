package com.jarvlis.jaroj.judge.codesandbox.impl;

import com.jarvlis.jaroj.judge.codesandbox.CodeSandBox;
import com.jarvlis.jaroj.judge.codesandbox.model.ExecuteCodeRequest;
import com.jarvlis.jaroj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * Author:Jarvlis
 * Date:2024-01-11
 * Time:14:22
 */

/**
 * 第三方代码沙箱（调用网上现成的代码沙箱）
 */
public class ThirdPartyCodeSandBox implements CodeSandBox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}

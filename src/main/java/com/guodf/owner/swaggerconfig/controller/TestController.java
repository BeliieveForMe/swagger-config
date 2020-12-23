package com.guodf.owner.swaggerconfig.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TOOD
 * @Author Administrator
 * @Date 2020/12/172:39
 * @Version 1.0
 **/
@RestController
@Api(value = "/ttt",tags ={"測試"})
public class TestController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ApiOperation(value = "ceshi ")
    public String logTest(String name, String age) {
        return "success";
    }
}




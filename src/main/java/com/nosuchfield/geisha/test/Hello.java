package com.nosuchfield.geisha.test;

import com.nosuchfield.geisha.ioc.annotations.Component;
import com.nosuchfield.geisha.mvc.annotations.Param;
import com.nosuchfield.geisha.mvc.annotations.RequestMapping;

/**
 * @author hourui 2017/10/27 22:51
 */
@Component
public class Hello {

    @RequestMapping
    public String hello(@Param("name") String name) {
        System.out.println("我的名字是：" + name);
        return "hello, " + name;
    }

}
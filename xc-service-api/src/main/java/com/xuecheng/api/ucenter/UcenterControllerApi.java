package com.xuecheng.api.ucenter;

import com.xuecheng.framework.domain.ucenter.ext.XcUserExt;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by mrt on 2018/7/17.
 */
@Api(value = "用户中心",description = "用户中心管理")
public interface UcenterControllerApi {
    final String API_PRE = "/ucenter";

    @GetMapping(API_PRE+"/getuserext")
    public XcUserExt getUserext(@RequestParam("username") String username);

}

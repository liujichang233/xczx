package com.xuecheng.manage_cms.web.controller;

import com.xuecheng.api.cms.SysDicthinaryControllerApi;
import com.xuecheng.framework.domain.system.SysDictionary;
import com.xuecheng.manage_cms.service.CmsConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @version 1.0
 * @create 2018-07-02 8:49
 **/
@RestController
public class SysDicthinaryController implements SysDicthinaryControllerApi {

    @Autowired
    CmsConfigService cmsConfigService;
    @Override
    public SysDictionary getByType(@PathVariable("type") String type) {
        return cmsConfigService.findDictionaryByType(type);
    }
}

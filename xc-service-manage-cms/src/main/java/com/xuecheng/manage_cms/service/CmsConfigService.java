package com.xuecheng.manage_cms.service;

import com.xuecheng.framework.domain.cms.CmsConfig;
import com.xuecheng.framework.domain.cms.response.CmsConfigResult;
import com.xuecheng.framework.domain.system.SysDictionary;
import com.xuecheng.framework.exception.ExceptionCast;
import com.xuecheng.framework.model.response.CommonCode;
import com.xuecheng.manage_cms.dao.CmsConfigRepository;
import com.xuecheng.manage_cms.dao.SysDicthinaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 * @version 1.0
 * @create 2018-06-27 10:57
 **/
@Service
public class CmsConfigService {

    @Autowired
    CmsConfigRepository cmsConfigRepository;

    @Autowired
    SysDicthinaryRepository sysDicthinaryRepository;

    //根据id查询配置信息
    public CmsConfigResult getConfigById(String id){
        CmsConfig one = cmsConfigRepository.findOne(id);
        if(one == null){
            ExceptionCast.cast(CommonCode.INVLIDATE);
        }
        return new CmsConfigResult(CommonCode.SUCCESS,one);
    }

    //根据字典表的type字典查询数据字典表
    public SysDictionary findDictionaryByType(String type){
        return sysDicthinaryRepository.findBydType(type);
    }

}

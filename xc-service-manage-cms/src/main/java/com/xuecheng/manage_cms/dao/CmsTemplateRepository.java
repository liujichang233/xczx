package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by mrt on 2018/6/23.
 */
public interface CmsTemplateRepository extends MongoRepository<CmsTemplate,String> {

}

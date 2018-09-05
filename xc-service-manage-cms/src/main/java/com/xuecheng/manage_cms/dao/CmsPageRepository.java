package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsPage;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by mrt on 2018/6/23.
 */
public interface CmsPageRepository extends MongoRepository<CmsPage,String> {
    //根据页面名称、站点id、页面web访问路径查询，如果查询
    CmsPage findBySiteIdAndPageNameAndPageWebPath(String siteId,String pageName,String pageWebPath);

}

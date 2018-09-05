package com.xuecheng.manage_course.client;

import com.xuecheng.api.cms.CmsPageControllerApi;
import com.xuecheng.framework.client.XcServiceList;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by mrt on 2018/6/23.
 */
@FeignClient(XcServiceList.XC_SERVICE_MANAGE_CMS)//FeignClient从eureka中找一个可用的服务
public interface CmsPageClient extends CmsPageControllerApi {
}

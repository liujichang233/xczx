package com.xuecheng.learning.client;

import com.xuecheng.api.search.EsCourseControllerApi;
import com.xuecheng.framework.client.XcServiceList;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by mrt on 2018/7/14.
 */
@FeignClient(value= XcServiceList.XC_SERVICE_SEARCH)
public interface SearchClient extends EsCourseControllerApi {

}

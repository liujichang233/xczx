package com.xuecheng.auth.client;

import com.xuecheng.api.ucenter.UcenterControllerApi;
import com.xuecheng.framework.client.XcServiceList;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by mrt on 2018/7/17.
 */
@FeignClient(value = XcServiceList.XC_SERVICE_UCENTER)
public interface UserClient extends UcenterControllerApi {
}

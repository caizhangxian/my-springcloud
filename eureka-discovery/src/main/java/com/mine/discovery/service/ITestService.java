package com.mine.discovery.service;

import com.mine.discovery.service.hystix.TestFeinHystix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Description
 * @Company: 北京国文互联教育科技集团有限公司
 * @Author:caizhangxian
 * @Date: 15:06 2018/11/27
 */
@FeignClient(value = "eureka-provide",fallback = TestFeinHystix.class)
public interface ITestService {
         @PostMapping("/test/getname")
         String findById(@RequestBody String id);

}

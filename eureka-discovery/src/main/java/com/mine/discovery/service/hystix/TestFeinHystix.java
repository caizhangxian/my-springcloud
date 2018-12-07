package com.mine.discovery.service.hystix;

import com.mine.discovery.service.ITestService;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Company: 北京国文互联教育科技集团有限公司
 * @Author:caizhangxian
 * @Date: 14:18 2018/11/30
 */
@Component
public class TestFeinHystix implements ITestService {
    @Override
    public String findById(String id) {
        return "error";
    }
}

package com.xyf.srb.sms.client.fallback;
/*
@author XYF
@date 2021/5/18- 18:35     
*/

import com.xyf.srb.sms.client.CoreUserInfoClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CoreUserInfoClientFallback implements CoreUserInfoClient {
    @Override
    public boolean checkMobile(String mobile) {
        log.error("远程调用失败，服务熔断");
        return false;//手机号不能重复
    }
}

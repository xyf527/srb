package com.xyf.srb.sms.service;
/*
@author XYF
@date 2021/5/15- 16:38     
*/

import java.util.Map;

public interface SmsService {

    void send(String mobile, String templateCode, Map<String,Object> param);

}

package com.xyf.srb.oss.service;
/*
@author XYF
@date 2021/5/15- 17:27     
*/

import java.io.InputStream;

public interface FileService {

        /**
         * 文件上传至阿里云
         */
        String upload(InputStream inputStream, String module, String fileName);

        /**
         * 根据路径删除文件
         * @param url
         */
        void removeFile(String url);


}

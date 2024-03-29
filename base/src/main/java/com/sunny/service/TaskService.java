package com.sunny.service;


import com.sunny.entity.ResponseMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private static final Logger log = LoggerFactory.getLogger(TaskService.class);

    public ResponseMsg<String> getResult(){

        log.info("任务开始执行，持续等待中...");

        try {
            Thread.sleep(30000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        log.info("任务处理完成");

        return new ResponseMsg<String>(0,"操作成功","success");

    }

}

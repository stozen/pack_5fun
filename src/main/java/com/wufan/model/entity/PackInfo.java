package com.wufan.model.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * Created by 7cc on 2017/9/7
 */
@Data
public class PackInfo {
    /**
     *  广告Id
     */
    private long ad;
    /**
     *  版本
     */
    private String version;
    /**
     *  版本包
     */
    private String versionPack;
    /**
     *  是否优先打包; 优先打包:1|正常:0
     */
    private int priority;
    /**
     *  打包任务唯一Id
     */
    private String taskId;
    /**
     *  任务开始时间
     */
    private final LocalDateTime startTime = LocalDateTime.now();
    /**
     *  回调url
     */
    private String callBackUrl;
}

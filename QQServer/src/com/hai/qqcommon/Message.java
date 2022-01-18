package com.hai.qqcommon;

import java.io.Serializable;

/**
 * @author hai
 * @date 2022/1/18
 * version 1.0
 * 服务器和客户端通信时的用户对象
 */
@SuppressWarnings({"all"})
public class Message implements Serializable {
    private String sender;      // 发送者
    private String receiver;    // 接收者
    private String content;     // 消息内容
    private String sentTime;    // 发送时间
    private String messType;    // 消息类型

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSentTime() {
        return sentTime;
    }

    public void setSentTime(String sentTime) {
        this.sentTime = sentTime;
    }

    public String getMessType() {
        return messType;
    }

    public void setMessType(String messType) {
        this.messType = messType;
    }
}

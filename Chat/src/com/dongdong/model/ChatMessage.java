package com.dongdong.model;

/**
 * 聊天消息实体类
 * @author daobo.yuan
 */
public class ChatMessage {
	public int userID;// 发送消息人ID
	public String chatMsg;// 消息内容
	public String nickName;//昵称
	public ChatMessage() {
		super();
	}
}
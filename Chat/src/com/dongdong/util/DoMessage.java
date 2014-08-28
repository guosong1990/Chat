/**
 * 
 */
package com.dongdong.util;

/**
 * @author guosong
 *
 * 2014年8月23日
 */
public class DoMessage {
	private String  message;
	public DoMessage(String message){
		this.message = message;
	}
	

	//编号从2开始
	public int syaWhat() {
		// TODO Auto-generated method stub
		//几个比较特殊的
		if(message.contains("笑话")){
			return 666;
		}
		if(message.contains("时间")){
			return 888;
		}
		
		if (message.contains("你不好")) {
			return 3;
		}else if (message.contains("什么")) {
			return 4;
		}else if (message.contains("你好")||message.contains("您好")) {
			return 5;
		}
		else if (message.contains("你多大")||message.contains("多大了")) {
			return 6;
		}
		else if (message.contains("吃了没")) {
			return 7;
		}
		else if (message.contains("哈哈")) {
			return 8;
		}
		else if (message.contains("你的照片")) {
			return 9;
		}
		else if (message.contains("伤心")||message.contains("难过")) {
			return 10;
		}
		else if (message.contains("无聊")) {
			return 11;
		}
		else if (message.contains("分析")) {
			return 12;
		}
		else if (message.contains("相信")) {
			return 13;
		}
		else if (message.contains("很闲")) {
			return 14;
		}
		else if (message.contains("去吃屎")||message.contains("sb")) {
			return 15;
		}
		else if (message.contains("好的")) {
			return 16;
		}
		else if (message.contains("没有")) {
			return 4;
		}
		else if (message.contains("别生气")) {
			return 4;
		}
		else if (message.contains("什么")) {
			return 4;
		}
		else if (message.contains("什么")) {
			return 4;
		}
		else if (message.contains("什么")) {
			return 4;
		}
		else if (message.contains("什么")) {
			return 4;
		}
		else if (message.contains("什么")) {
			return 4;
		}
		else if (message.contains("什么")) {
			return 4;
		}
		else if (message.contains("什么")) {
			return 4;
		}
		else if (message.contains("什么")) {
			return 4;
		}
		else if (message.contains("什么")) {
			return 4;
		}
		else if (message.contains("什么")) {
			return 4;
		}
		else if (message.contains("什么")) {
			return 4;
		}
		else if (message.contains("什么")) {
			return 4;
		}
		else if (message.contains("什么")) {
			return 4;
		}
		else if (message.contains("什么")) {
			return 4;
		}
		else if (message.contains("什么")) {
			return 4;
		}
		else if (message.contains("什么")) {
			return 4;
		}
		
		
		
		else {
			return 2;//无法判断说什么的时候
		}
	
	}
}

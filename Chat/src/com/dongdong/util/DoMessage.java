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
		if(message.contains("#")){
			return 333;//发送的是表情
		}
		
		if (message.contains("你不好")) {
			return 3;
		}else if (message.contains("什么")) {
			return 4;
		}else if (message.contains("你好")||message.contains("您好")||message.contains("hi")||message.contains("hello")) {
			return 5;
		}
		else if (message.contains("你多大")||message.contains("多大了")) {
			return 6;
		}
		else if (message.contains("吃了没")||message.contains("吃饭了没")) {
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
		else if (message.contains("去吃屎")||message.contains("sb")||message.contains("我靠")) {
			return 15;
		}
		else if (message.contains("好的")) {
			return 16;
		}
		else if (message.contains("没有")) {
			return 17;
		}
		else if (message.contains("别生气")) {
			return 18;
		}
		else if (message.contains("嗯")) {
			return 19;
		}
		else if (message.contains("哎")) {
			return 20;
		}
		else if (message.contains("你是谁")) {
			return 21;
		}
		else if (message.contains("算命")) {
			return 22;
		}
		else if (message.contains("我认识你吗")) {
			return 23;
		}
		else if (message.contains("猜")) {
			return 24;
		}
		else if (message.contains("再见")||message.contains("拜")) {
			return 25;
		}
		else if (message.contains("美女")) {
			return 26;
		}
		else if (message.contains("哪里")) {
			return 27;
		}
		else if (message.contains("喜欢我")) {
			return 28;
		}
		else if (message.contains("干什么的")) {
			return 29;
		}
		else if (message.contains("怎么样")) {
			return 30;
		}
		else if (message.contains("对不起")) {
			return 31;
		}
		else if (message.contains("电话")) {
			return 32;
		}
		else if (message.contains("地址")) {
			return 33;
		}
		
		else if (message.contains("呵呵")||message.contains("嘿嘿")) {
			return 34;
		}
		
		else if (message.contains("傻")||message.contains("笨")) {
			return 34;
		}
		else {
			return 222;//无法判断说什么的时候
		}
	
	}
}

package com.cbg.logic;

public class LogicService {

	public String getContent(String[] pptBitBits, String startTag, String endTag, int length) {
		String content = "";
		
		for(int i = 1; i < length; i++) {
			content += pptBitBits[i];
		}
		
		String resultContent = startTag + "\r\n" + content + "\r\n" + endTag;
		
		return resultContent;
	}

}

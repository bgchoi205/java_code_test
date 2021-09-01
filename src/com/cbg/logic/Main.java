package com.cbg.logic;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		LogicService logicService = new LogicService();
		
//		String ppt = "<p>@S1</p>\r\n"
//				+ "		<h1>title</h1>\r\n"
//				+ "		<p>테스트중입니다.</p>\r\n"
//				+ "		<p>@S2</p>\r\n"
//				+ "		<h3>subtitle</h3>\r\n"
//				+ "		<p>Lorem, ipsum dolor sit amet consectetur adipisicing elit.</p>\r\n"
//				+ "		<p>A delectus nihil labore nam sit porro, ducimus est, repellendus, maiores numquam ipsa amet.</p>";
//		
		String ppt = "<p>@S1</p>\r\n"
				+ "<h1>hihi</h1>\r\n"
				+ "<ul>\r\n"
				+ "<li>\r\n"
				+ "<p>nonono</p>\r\n"
				+ "</li>\r\n"
				+ "</ul>\r\n"
				+ "<p>testptag</p>\r\n"
				+ "<p>@S2</p>\r\n"
				+ "<h1>hihi</h1>\r\n"
				+ "<p>ppppsdf<br>\r\n"
				+ "testptag</p>\r\n"
				+ "<p>@S1</p>\r\n"
				+ "<h1>hihi</h1>\r\n"
				+ "<ul>\r\n"
				+ "<li>\r\n"
				+ "<p>nonono</p>\r\n"
				+ "</li>\r\n"
				+ "</ul>\r\n"
				+ "<p>testptag</p>\r\n"
				+ "<p>@S2</p>\r\n"
				+ "<h1>hihi</h1>\r\n"
				+ "<p>ppppsdf<br>\r\n"
				+ "testptag</p>";
		
		String[] pptBits = ppt.split("<p>@S");
		
		
		for(int i = 1; i < pptBits.length; i++) {
			String startTag = "";
			String endTag = "";
			
			String[] pptBitBits = pptBits[i].split("\r\n");
			
			switch(Character.toString(pptBitBits[0].charAt(0))){
			case "1" :
				startTag = "<section class=\"S1\"><div class=\"wrap\">";
				endTag = "</div></section>";
				
				String resultContent = logicService.getContent(pptBitBits, startTag, endTag, pptBitBits.length);;
				
				System.out.println("S1 : \r\n" + resultContent);
				
				break;
			case "2" :
				startTag = "<section class=\"S2\"><div class=\"wrap\"><div class=\"content-center\">";
				endTag = "</div></div></section>";
				
				String resultContent2 = logicService.getContent(pptBitBits, startTag, endTag, pptBitBits.length);;
				
				System.out.println("S2 : \r\n" + resultContent2);
				
				break;
			}
			
		}
		
		

	}

}



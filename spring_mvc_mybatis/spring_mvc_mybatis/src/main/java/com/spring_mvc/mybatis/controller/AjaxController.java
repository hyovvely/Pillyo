package com.spring_mvc.mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {
	
	//�α��� ������ �̵�
	@RequestMapping("/loginForm")
	public String loginForm() {
		return "ajax/loginForm"; //loginForm.jsp �� ������
	}
	
	//�α��� ó��
	@ResponseBody
	@RequestMapping("/login")
//	public String loginCheck(@RequestParam("user_id") String id,
//										   @RequestParam("user_pw") String pw) {
	public String loginCheck(@RequestParam("id") String id,
			   							   @RequestParam("pw") String pw) { // Ajax ����ϴ� ��� : id, pw�� �������Ƿ�, id, pw�� ����
		// �α��� üũ (����)
		String result = "";
		if(id.equals("abcd") && pw.equals("1234"))
			result ="success";
		else
			result = "fail";
		
		return result; //
		
		//@ResponseBody�� ���� ��� : success.jsp �Ǵ� fail.jsp ��ȯ
		//@ResponseBody�� �ִ� ��� : ����(body)�� result �����ؼ� ��ȯ (�� ���������� sucess �Ǵ� fail ���)
	}
	
	//�α��� ��2���� �̵�
	@RequestMapping("/loginForm2")
	public String loginForm2() {
		return "ajax/loginForm2"; //loginForm.jsp �� ������
	}
}

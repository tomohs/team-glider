package jp.co.internous.glider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.internous.glider.model.domain.MstUser;
import jp.co.internous.glider.model.mapper.MstUserMapper;
import jp.co.internous.glider.model.session.LoginSession;

@Controller
@RequestMapping("/glider/mypage")
public class MyPageController {
	
	@Autowired
	private MstUserMapper mstUserMapper;
	
	@Autowired
	private LoginSession loginSession;
	
	@RequestMapping("/")
	public String index(Model m) {
		MstUser user = mstUserMapper.findByUserNameAndPassword(loginSession.getUserName(),loginSession.getPassword());
		
		m.addAttribute("user",user);
		m.addAttribute("loginSession",loginSession);
		
		return "my_page";
	}

}
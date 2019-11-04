package spring.web.ch01.ex02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ch01/ex02")
public class UserController {
	@RequestMapping("/1")
	public String user1(){
		return "ch01/ex02/user";
	}
	
	@RequestMapping("/2")
	public String user2(Model model){
		model.addAttribute("user", new User("이다희", 25));
		return "ch01/ex02/user";
	}
	
	@RequestMapping("/3")
	public void user3(User user){
		user.setName("이다희");
		user.setAge(26);
	}
	
	@RequestMapping("/4")
	public void user4(@ModelAttribute("man")User user){
		user.setName("박보검");
		user.setAge(27);
	}
	@RequestMapping("/5")
	public User user5(){
		User user = new User();
		user.setName("노혜주");
		user.setAge(25);
		return user;
	}
	@RequestMapping("/6")
	@ModelAttribute("human")
	public User user6(){
		User user = new User();
		user.setName("김우빈");
		user.setAge(32);
		return user;
	}
}

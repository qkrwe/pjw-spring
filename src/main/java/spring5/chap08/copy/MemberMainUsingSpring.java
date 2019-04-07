package spring5.chap08.copy;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * p.204 [리스?�� 8.13]�? Main�? Service�? 분리?�� Main �?�?<br>
 * Spring?���? bean?�� �?리함
 * 
 * @author Jacob
 */
public class MemberMainUsingSpring {

	/**
	 * main() 메서?��
	 */
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext(
				"chap08.xml");
		MemberService memberService = ctx.getBean(MemberService.class);
		memberService.insertMember();
		memberService.selectAll();
		ctx.close();
	}
}